package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import negocio.Usuario;

public class UsuarioDAO {

    public Usuario obter(int id) throws SQLException {
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM usuario where id = ?;";
        Connection connection = ConexaoPostgreSQL.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            usuario.setId(rs.getInt("id"));
        }
        preparedStatement.close();
        connection.close();
        return usuario;  

    }

    public boolean inserir(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuario (nome, telefone) VALUES (?, ?) RETURNING id;";
        Connection connection = ConexaoPostgreSQL.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, usuario.getNome());
        preparedStatement.setString(2, usuario.getTelefone());
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            usuario.setId(rs.getInt("id"));
        }
        preparedStatement.close();
        connection.close();
        return usuario.getId() != 0;        
    }

}
