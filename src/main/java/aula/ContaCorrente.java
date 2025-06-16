package aula;

public class ContaCorrente extends Conta {
    private double salario;

    public ContaCorrente(int numero, double salario, Agencia agencia) {
        super(numero, agencia);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        System.out.println("Salário: R$" + salario);
    }
}
