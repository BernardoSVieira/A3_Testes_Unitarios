package aula;

import java.util.ArrayList;

public class PessoaFisica extends Pessoa {
    private long cpf;

    public PessoaFisica(String nome, ArrayList<Conta> listaContas, long cpf) {
        super(nome, listaContas);
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
