import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import negocio.Usuario;
import persistencia.ConexaoPostgreSQL;
import persistencia.UsuarioDAO;

public class MinhaClasseDeTeste {

    @BeforeAll
    static void executaAntesDeTudo(){
        System.out.println("Antes de Tudo");

    }

    @AfterAll
    static void executaDepoisDeTudo(){
        System.out.println("Depois de tudo");

    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testaTimeout() throws InterruptedException{
        Thread.sleep(1000);
    }

    @Test
    // @RepeatedTest(10)
    public void testaTelefone() {
        Usuario usuario = new Usuario();
        assertThrows(IllegalArgumentException.class, () -> {usuario.setTelefone("23");});
    }

    @Test
    public void mascaraTelefone() {
        Usuario usuario = new Usuario();
        usuario.setTelefone("53999999999");
        assertEquals("(53)999999999", usuario.getTelefoneComMascara());

    }

    @BeforeEach
    public void executarAntesDeCadaTeste() throws SQLException {
        System.out.println("Antes de cada!");
        Connection connection = ConexaoPostgreSQL.getInstance().getConnection();
        connection.prepareStatement("DELETE FROM usuario;").execute();
        connection.close();
    }

    @Test
    @DisplayName("Teste de adiciionar novos usuários!")
    public void testeAdicionar() throws SQLException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();
        usuario.setNome("David");
        usuario.setTelefone("53535353535");
        assertTrue(usuarioDAO.inserir(usuario));
    }

    @AfterEach
    public void executarDepoisDeCadaTeste() throws SQLException {
        System.out.println("Depois de cada!");
        Connection connection = ConexaoPostgreSQL.getInstance().getConnection();
        connection.prepareStatement("DELETE FROM usuario;").execute();
        connection.close();
    }

}
