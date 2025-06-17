package aula;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class PessoaFisicaTest {

    @Test
    void testPessoaFisicaConstructorAndCpfMethods() {
        // Arrange
        String nome = "João Silva";
        ArrayList<Conta> contas = new ArrayList<>();
        long cpf = 12345678900L;

        // Act
        PessoaFisica pessoa = new PessoaFisica(nome, contas, cpf);

        // Assert
        assertEquals(nome, pessoa.getNome());
        assertEquals(contas, pessoa.getListaContas());
        assertEquals(cpf, pessoa.getCpf());

        // Testando o setter do CPF
        long novoCpf = 98765432100L;
        pessoa.setCpf(novoCpf);
        assertEquals(novoCpf, pessoa.getCpf());
    }
}
