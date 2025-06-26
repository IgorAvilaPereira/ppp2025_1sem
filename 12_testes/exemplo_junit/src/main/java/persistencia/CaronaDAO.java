package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import negocio.Carona;

public class CaronaDAO {

    public boolean adicionar(Carona carona) throws SQLException{
        String sql = "INSERT INTO carona (data_hora) values (current_timestamp) RETURNING id;";
        Connection connection = ConexaoPostgreSQL.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            carona.setId(rs.getInt("id"));
        }
        preparedStatement.close();
        connection.close();
        return carona.getId() != 0;    

    }

}
