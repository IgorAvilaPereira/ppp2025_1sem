DROP DATABASE IF EXISTS barela_car;

CREATE DATABASE barela_car;

\c barela_car;

CREATE TABLE usuario (
    id serial primary key,
    nome text not null,
    telefone character(11) not null
);

CREATE TABLE carona (
    id serial primary key,
    data_hora timestamp default current_timestamp
);

CREATE TABLE corrida (
    usuario_id integer references usuario (id),
    carona_id integer references carona (id),
    pago boolean default false,
    valor numeric(8,2) default 0,
    primary key (carona_id, usuario_id)
);




