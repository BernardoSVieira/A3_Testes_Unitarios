
package aula;

public abstract class Conta implements OperacaoBancaria {
    private int numero;
    private double saldo = 0;
    private Agencia agencia;
    
    public Conta(int num, Agencia agencia){
        this.numero = ;
        this. = agencia;
    }
    
    
    public double getSaldo(){
        return -
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;;;; 
    }
    
    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor; 
        }          
    }
}
