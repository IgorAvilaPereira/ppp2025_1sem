package apresentacao;

import java.sql.SQLException;

import negocio.Carona;
import negocio.Corrida;
import negocio.Usuario;
import persistencia.CaronaDAO;
import persistencia.ConexaoPostgreSQL;
import persistencia.CorridaDAO;
import persistencia.UsuarioDAO;

public class Main {
    public static void main(String[] args) throws SQLException {
        // ConexaoPostgreSQL objeto1 = ConexaoPostgreSQL.getInstance();
        // ConexaoPostgreSQL objeto2 = ConexaoPostgreSQL.getInstance();

        // System.out.println(objeto1.hashCode());
        // System.out.println(objeto2.hashCode());

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuario1  = new Usuario();
        // usuario1.setNome("David");
        // usuario1.setTelefone("53555555555");
        // usuarioDAO.inserir(usuario1);


        Usuario usuario2 = new Usuario();
        // usuario2.setNome("Ronaldo");
        // usuario2.setTelefone("53888888888");
        // usuarioDAO.inserir(usuario2);

        usuario1 = new UsuarioDAO().obter(13);
        usuario2 = new UsuarioDAO().obter(14);

        Carona carona = new Carona();
        new CaronaDAO().adicionar(carona);

        Corrida corrido1 = new Corrida();
        corrido1.setUsuario(usuario1);
        corrido1.setCarona(carona);
    
        Corrida corrido2 = new Corrida();
        corrido2.setUsuario(usuario2);
        corrido2.setCarona(carona);

        carona.getVetCorrida().add(corrido1);
        carona.getVetCorrida().add(corrido2);

        new CorridaDAO().adicionarCorridos(carona);
    }
}