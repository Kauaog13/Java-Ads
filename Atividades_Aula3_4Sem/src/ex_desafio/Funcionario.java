package ex_desafio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade); // Chamando o construtor da classe pai (Pessoa)
        // Usar o setter para aproveitar a validação
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        // Validação de regra de negócio: o salário não pode ser negativo
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro: O salário do funcionário não pode ser negativo.");
            this.salario = 0; // Define um valor padrão seguro
        }
    }
}
