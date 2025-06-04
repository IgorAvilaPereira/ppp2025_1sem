package apresentacao;

import java.sql.SQLException;
import java.time.LocalDateTime;

import negocio.Consulta;
import negocio.Medico;
import negocio.Paciente;
import persistencia.ConsultaDAO;
import service.ConsultaService;

public class Main {
    public static void main(String[] args) {
        // sem facade  
        // Paciente ronaldo = new Paciente(1);
        // Medico drFelipe = new Medico(3);
        // Consulta c = new Consulta();
        // c.setPaciente(ronaldo);
        // c.setMedico(drFelipe);
        // c.setDataHora(LocalDateTime.now());
        // c.setObservacao(observacao);
        // try {
        //     new ConsultaDAO().inserir(c);
        //     System.out.println("Beiii! Deu certo!");
        // } catch (SQLException e) {
        //     e.printStackTrace();
        //     System.out.println("Deu xabum!");
        // }

        // com facade
        // new ConsultaService().inserir(3, 1, LocalDateTime.now(), "agora com facade");
        new ConsultaService().deletar(8);
    }
}