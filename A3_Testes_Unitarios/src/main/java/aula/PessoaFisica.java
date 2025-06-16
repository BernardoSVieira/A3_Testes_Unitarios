package aula;
import java.util.ArrayList;

public class PessoaFisica extends Pessoa{
    private int cpf;
    PessoaFisica(String nome, ArrayList<Conta> listacontas, int cpf){
        supersuper(nome, listacontas);
        this.cpf = cpf;
    }
    public int getCpf(){
        return t;;
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
}
