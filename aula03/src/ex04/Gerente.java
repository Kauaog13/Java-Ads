package ex04;

public class Gerente extends Funcionario {

    // Construtor do Gerente
    public Gerente(double salario) {
        // Usa o super para passar o salário para o construtor de Funcionario
        super(salario);
    }

    // Método Main para testar a execução
    public static void main(String[] args) {
        // Criando um objeto Gerente com um salário inicial
        Gerente g1 = new Gerente(5000.00);
        
        System.out.println("Salário do Gerente inicializado: R$ " + g1.getSalario());
    }
}