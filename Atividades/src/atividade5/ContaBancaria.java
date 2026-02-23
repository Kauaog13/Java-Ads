package atividade5;

public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    public void sacar(double valor) {
        // Regra: Não permitir saque maior que o saldo
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Erro: Saldo insuficiente para o saque de R$ " + valor);
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Atual: R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Kauã Oliveira";
        conta.saldo = 500.00;

        conta.mostrarSaldo();
        conta.depositar(200);
        conta.sacar(100);   // Saque permitido
        conta.sacar(1000);  // Deve cair na regra de erro
        conta.mostrarSaldo();
    }
}