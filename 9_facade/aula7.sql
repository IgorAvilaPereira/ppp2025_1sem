DROP DATABASE aula7;

CREATE DATABASE aula7;

\c aula7;

CREATE TABLE medico (
    id serial primary key,
    crm character(5) unique,
    nome text
);
INSERT INTO medico (crm, nome) VALUES ('12345', 'Dr. David');


CREATE TABLE paciente (
    id serial primary key,
    nome character varying(100) not null,
    cpf character(11) unique,
    data_nascimento date
);
INSERT INTO paciente (nome, cpf, data_nascimento) VALUES ('RONALDO', '11111111111', '2001-12-07');

CREATE TABLE consulta (
    id serial primary key,
    data_hora timestamp default current_timestamp,
    observacao text,
    medico_id integer references medico (id),
    paciente_id integer references paciente (id)
);

CREATE TABLE consulta_log (
    id serial primary key,
    data_hora timestamp,
    medico_nome text
);

CREATE TABLE medico_log (
    id serial primary key,
    data_hora timestamp default current_timestamp,
    medico_id integer,
    medico_nome text
);

CREATE OR REPLACE FUNCTION teste() RETURNS TRIGGER AS
$$
DECLARE
    medico_nome text;
BEGIN
    SELECT nome FROM medico WHERE id = NEW.medico_id INTO medico_nome;
    INSERT INTO consulta_log (data_hora, medico_nome) VALUES (NEW.data_hora, medico_nome);
    RETURN NEW;
END;
$$ LANGUAGE 'plpgsql';

CREATE OR REPLACE FUNCTION deletar_medico() RETURNS TRIGGER AS
$$
BEGIN
    RAISE NOTICE '%',  OLD.id;
    DELETE FROM consulta WHERE medico_id = OLD.id;
    RETURN OLD;
END;
$$ LANGUAGE 'plpgsql';

CREATE OR REPLACE FUNCTION deletar_consulta() RETURNS TRIGGER AS
$$
DECLARE
    medico_aux TEXT;
BEGIN
    SELECT nome FROM medico WHERE id = OLD.medico_id INTO medico_aux;
    INSERT INTO consulta_log (data_hora, medico_nome) VALUES (OLD.data_hora, medico_aux);
    RETURN OLD;
END;
$$ LANGUAGE 'plpgsql';

CREATE TRIGGER deletar_consulta_gatilho AFTER DELETE ON consulta FOR EACH 
ROW EXECUTE PROCEDURE deletar_consulta();

CREATE OR REPLACE FUNCTION adicionar_medico() RETURNS TRIGGER AS
$$
BEGIN
    INSERT INTO medico_log(medico_id, medico_nome) VALUES (NEW.id, NEW.nome);
    RETURN NEW;
END;
$$ LANGUAGE 'plpgsql';



CREATE OR REPLACE FUNCTION impedir_agendamentos_finais_de_semana() RETURNS TRIGGER AS
$$
DECLARE
    dia_da_semana integer;
BEGIN
    SELECT EXTRACT(dow from NEW.data_hora) INTO dia_da_semana;
    IF (dia_da_semana = 0 OR dia_da_semana = 6) THEN
        RAISE EXCEPTION 'Não pode agendar no final de semana';
        -- RETURN OLD;
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE 'plpgsql';


CREATE TRIGGER impedir_agendamentos_finais_de_semana_gatilho BEFORE INSERT OR UPDATE ON consulta FOR EACH 
ROW EXECUTE PROCEDURE impedir_agendamentos_finais_de_semana();

CREATE TRIGGER teste_gatilho AFTER INSERT ON consulta FOR EACH 
ROW EXECUTE PROCEDURE teste();

CREATE TRIGGER deletar_medico_gatilho BEFORE DELETE ON medico FOR EACH 
ROW EXECUTE PROCEDURE deletar_medico();

CREATE TRIGGER adicionar_medico_gatilho AFTER INSERT ON medico FOR EACH 
ROW EXECUTE PROCEDURE adicionar_medico();

INSERT INTO consulta (observacao, paciente_id, medico_id) values
('doença', 1, 1);


CREATE OR REPLACE FUNCTION obter_medico(id_aux bigint) RETURNS text AS
$$
DECLARE
    nome_aux text;
BEGIN
    select nome from medico where id = id_aux into nome_aux;
    RETURN nome_aux;
END;
$$ LANGUAGE 'plpgsql';

