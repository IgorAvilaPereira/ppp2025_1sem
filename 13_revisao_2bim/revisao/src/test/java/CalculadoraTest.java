
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import junit.Calculadora;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    public void antesDeCadaTest() {
        System.out.println("oi");
        this.calculadora = new Calculadora();
    }

    @AfterEach
    public void depoisDeCadaTeste() {
        System.out.println("ola");
    }

    @Test
    public void testeSomar() {
        assertEquals(10, calculadora.somar(5, 5));
    }

    @ParameterizedTest
    @CsvSource({ "5,5,1" })
    public void testarDividir(int a, int b, int esperado) {
        assertEquals(esperado, calculadora.dividir(a,b));
    }

}
