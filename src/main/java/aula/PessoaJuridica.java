package aula;

import java.util.ArrayList;

public class PessoaJuridica extends Pessoa {
    private long cnpj;

    public PessoaJuridica(String nome, ArrayList<Conta> listaContas, long cnpj) {
        super(nome, listaContas);
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}
