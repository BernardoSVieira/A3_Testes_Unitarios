package aula;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(int numero, double rendimento, Agencia agencia) {
        super(numero, agencia);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public void imprimir() {
        System.out.println("Rendimento: " + rendimento + "%");
    }
}