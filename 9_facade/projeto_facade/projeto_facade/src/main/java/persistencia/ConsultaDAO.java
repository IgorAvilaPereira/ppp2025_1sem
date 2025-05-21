package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import negocio.Consulta;
import negocio.Medico;
import negocio.Paciente;

public class ConsultaDAO {

    private ConexaoPostgreSQL conexao;

    public ConsultaDAO(){
        this.conexao = new ConexaoPostgreSQL();
    }

    public boolean inserir(Consulta consulta) throws SQLException{
        String sql = "INSERT INTO consulta (medico_id, paciente_id, data_hora, observacao) VALUES (?,?,?,?) RETURNING id;";
        Connection connection = conexao.getConexao();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, consulta.getMedico().getId());
        statement.setInt(2, consulta.getPaciente().getId());
        statement.setTimestamp(3,  Timestamp.valueOf(consulta.getDataHora()));
        statement.setString(4, consulta.getObservacao());
        ResultSet rs = statement.executeQuery();
        if (rs.next()){
            consulta.setId(rs.getInt("id"));            
        }
        statement.close();
        connection.close();
        return consulta.getId() != 0;
    }

    public boolean deletar(int id) throws SQLException {
        String sql = "DELETE FROM consulta where id = ?;";
        Connection connection = conexao.getConexao();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        int linhasAfetadas = statement.executeUpdate();
        statement.close();
        connection.close();
        return linhasAfetadas == 1;
    }

    public ArrayList<Consulta> listar() throws SQLException{
        ArrayList<Consulta> vetConsulta = new ArrayList<>();
        String sql = "SELECT * FROM consulta ORDER BY id;";
        Connection connection = conexao.getConexao();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            Consulta consulta = new Consulta();
            consulta.setId(rs.getInt("id"));            
            consulta.setMedico(new Medico(rs.getInt("medico_id")));
            consulta.setPaciente(new Paciente(rs.getInt("paciente_id"))); 
            consulta.setDataHora(rs.getTimestamp("data_hora").toLocalDateTime());
            consulta.setObservacao(rs.getString("observacao"));
            vetConsulta.add(consulta);
        }
        statement.close();
        connection.close();
        return vetConsulta;

    }

}
