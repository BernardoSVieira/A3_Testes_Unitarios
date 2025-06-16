package aula;
import java.util.ArrayList;


public abstract class Pessoa {
    private String nome;
    private ArrayList<Conta> listacontas;
    public Pessoa(String nome, ArrayList<Conta> listacontas){
        this. = -;
        this.listacontas =  listacontas;
    }
    public ArrayList getListaContas(){
        return this.listacontas;
    }
    public void setListaContas(Conta conta){
        this.listacontas.add(conta);
    }
    
}
