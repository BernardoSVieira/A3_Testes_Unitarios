import aula.Agencia;
import aula.Conta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestConta {

    private Conta conta;
    private Agencia agencia;

    static class ContaFake extends Conta {
        public ContaFake(int numero, Agencia agencia) {
            super(numero, agencia);
        }

        @Override
        public void depositar(double valor) {
            super.depositar(valor);
        }

        @Override
        public void sacar(double valor) {
            super.sacar(valor);
        }
        
        @Override
        public void imprimir() {
        // Implementação vazia para teste
        }
    }

    @BeforeEach
    void setUp() {
        agencia = new Agencia(123);
        conta = new ContaFake(1, agencia);
    }

    @Test
    void testGetNumero() {
        assertEquals(1, conta.getNumero());
    }

    @Test
    void testSetNumero() {
        conta.setNumero(99);
        assertEquals(99, conta.getNumero());
    }

    @Test
    void testGetSaldoInicial() {
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    void testSetSaldo() {
        conta.setSaldo(200.0);
        assertEquals(200.0, conta.getSaldo());
    }

    @Test
    void testGetAgencia() {
        assertEquals(agencia, conta.getAgencia());
    }

    @Test
    void testSetAgencia() {
        Agencia novaAgencia = new Agencia(456);
        conta.setAgencia(novaAgencia);
        assertEquals(novaAgencia, conta.getAgencia());
    }

    @Test
    void testDepositar() {
        conta.depositar(150.0);
        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    void testSacarComSaldoSuficiente() {
        conta.depositar(200.0);
        conta.sacar(100.0);
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    void testSacarComSaldoInsuficiente() {
        conta.depositar(50.0);
        conta.sacar(100.0); 
        assertEquals(50.0, conta.getSaldo()); 
    }
}
