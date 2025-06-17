import aula.Agencia;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AgenciaTest {

    @Test
    void testConstrutorEGetNumero() {
        Agencia agencia = new Agencia(123);
        assertEquals(123, agencia.getNumero(), "Deve retornar o número inicial corretamente");
    }

    @Test
    void testSetNumero() {
        Agencia agencia = new Agencia(0);
        agencia.setNumero(456);
        assertEquals(456, agencia.getNumero(), "Deve atualizar o número corretamente");
    }

    @Test
    void testNumeroZero() {
        Agencia agencia = new Agencia(0);
        assertEquals(0, agencia.getNumero(), "Deve aceitar zero como número de agência");
    }

    @Test
    void testNumeroNegativo() {
        Agencia agencia = new Agencia(-1);
        assertEquals(-1, agencia.getNumero(), "Deve aceitar número negativo (sem validação)");
    }

    @Test
    void testSetNumeroVariasVezes() {
        Agencia agencia = new Agencia(1);
        agencia.setNumero(10);
        agencia.setNumero(20);
        assertEquals(20, agencia.getNumero(), "Deve refletir o último valor setado");
    }
}
