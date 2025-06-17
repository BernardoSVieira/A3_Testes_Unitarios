package aula;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class TestPessoaFisica {

    @Test
    void testPessoaFisicaConstructorAndCpfMethods() {
        String nome = "João Silva";
        ArrayList<Conta> contas = new ArrayList<>();
        long cpf = 12345678900L;

        PessoaFisica pessoa = new PessoaFisica(nome, contas, cpf);

        assertEquals(nome, pessoa.getNome());
        assertEquals(contas, pessoa.getListaContas());
        assertEquals(cpf, pessoa.getCpf());

        long novoCpf = 98765432100L;
        pessoa.setCpf(novoCpf);
        assertEquals(novoCpf, pessoa.getCpf());
    }
}
