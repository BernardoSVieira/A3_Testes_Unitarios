package aula;

public class ContaPoupanca extends Conta{
    private double rendimento;
    public ContaPoupanca(int numero, double rendimento, Agencia agencia){
        super(numero, agencia);
        this.rendimento = rendimento;
    } 
    
    @Override
    public void imprimir() {
        System.out.println("Seu rendimento é : "+this.rendimento);
    }
    
    public double getRendimento(){
        
    }
    
    public void setRendimento(double rendimento){
        
    }    
}
