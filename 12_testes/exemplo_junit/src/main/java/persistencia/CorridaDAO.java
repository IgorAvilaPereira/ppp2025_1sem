package persistencia;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import negocio.Carona;
import negocio.Corrida;

public class CorridaDAO {

    public void adicionarCorridos(Carona carona) throws SQLException {
        ArrayList<Corrida> vetCorrida = carona.getVetCorrida();
        String transactionSQL = "BEGIN;";
        for (int i = 0; i < vetCorrida.size(); i++) {
            transactionSQL += "INSERT INTO corrida (usuario_id, carona_id) VALUES ("+vetCorrida.get(i).getUsuario().getId()+","+vetCorrida.get(i).getCarona().getId()+");";
        }
        transactionSQL += "COMMIT;";
        Connection connection = ConexaoPostgreSQL.getInstance().getConnection();
        connection.prepareStatement(transactionSQL).execute();        
        connection.close();
    }

}
