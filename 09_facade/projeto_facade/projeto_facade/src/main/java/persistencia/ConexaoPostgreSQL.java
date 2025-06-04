package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgreSQL {
    private String dbname;
    private String host;
    private String username;
    private String password;
    private String port;

    public ConexaoPostgreSQL(){
        this.dbname = "aula7";
        this.host = "localhost";
        this.username = "postgres";
        this.password = "postgres";
        this.port = "5432";
    }

    public Connection getConexao() throws SQLException{
        String url = "jdbc:postgresql://"+host+":"+port+"/"+dbname;
        return DriverManager.getConnection(url, username, password);
    }

}
