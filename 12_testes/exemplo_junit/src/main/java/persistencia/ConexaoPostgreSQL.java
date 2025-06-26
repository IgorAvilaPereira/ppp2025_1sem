package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgreSQL {
    private static ConexaoPostgreSQL INSTANCE = new ConexaoPostgreSQL();
   
    private String host;
    private String dbname;
    private String username;
    private String password;
    private String port;

    private ConexaoPostgreSQL() {
        this.host = "localhost";
        this.port = "5432";
        this.dbname = "barela_car";
        this.username = "postgres";
        this.password = "postgres";        
    }

    public static ConexaoPostgreSQL getInstance() {
        return INSTANCE;
     
        
    }
    
    public Connection getConnection() throws SQLException{
        String url = "jdbc:postgresql://"+this.host+":"+this.port+"/"+this.dbname;
        return DriverManager.getConnection(url, username, password);
    }

}
