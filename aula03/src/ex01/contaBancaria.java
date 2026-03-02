package ex01;

public class contaBancaria {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    // PARA EXECUTAR:
    public static void main(String[] args) {
        contaBancaria minhaConta = new contaBancaria();
        minhaConta.depositar(100.0);
        minhaConta.sacar(50.0);
        System.out.println("Saldo final: R$ " + minhaConta.getSaldo());
    }
}