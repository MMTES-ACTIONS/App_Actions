import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testarSoma() {
        assertEquals(15, calculadora.somar(10, 5));
    }

    @Test
    public void testarSubtracao() {
        assertEquals(5, calculadora.subtrair(10, 5));
    }

    @Test
    public void testarMultiplicacao() {
        assertEquals(50, calculadora.multiplicar(10, 5));
    }

    @Test
    public void testarDivisao() {
        assertEquals(2.0, calculadora.dividir(10, 5), 0.01);
    }

    @Test
    public void testarDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}
