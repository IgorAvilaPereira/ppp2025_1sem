package service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import negocio.Consulta;
import negocio.Medico;
import negocio.Paciente;
import persistencia.ConsultaDAO;

public class ConsultaService {

    public ArrayList<Consulta> listar(){
        try {
            return new ConsultaDAO().listar();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    public Consulta inserir(int medicoID, int pacienteID, LocalDateTime dataHora, String observacao){
        Paciente paciente = new Paciente(pacienteID);
        Medico medico = new Medico(medicoID);
        Consulta consulta = new Consulta();
        consulta.setPaciente(paciente);
        consulta.setMedico(medico);
        consulta.setDataHora(LocalDateTime.now()); 
        consulta.setObservacao(observacao);
        try {
            new ConsultaDAO().inserir(consulta);
            System.out.println("Beiii! Deu certo!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Deu xabum!");
        }  
        return consulta;
    }

    public boolean deletar(int id){
        if (id <= 0) new IllegalStateException("Não vem com id xumbrega! Id's somente > 0");
        try {
            return new ConsultaDAO().deletar(id);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Deu xabum na exclusão de Consulta!");
        }
        return false;
    }

}
