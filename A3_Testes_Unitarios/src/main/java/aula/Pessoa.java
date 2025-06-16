package aula;

import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private ArrayList<Conta> listaContas;

    public Pessoa(String nome, ArrayList<Conta> listaContas) {
        this.nome = nome;
        this.listaContas = listaContas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conta> getListaContas() {
        return listaContas;
    }

    public void setListaContas(Conta conta) {
        this.listaContas.add(conta);
    }
}