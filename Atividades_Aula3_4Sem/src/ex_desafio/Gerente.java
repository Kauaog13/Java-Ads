package ex_desafio;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario); // Chamando o construtor da classe pai (Funcionario)
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void exibirInformacoes() {
        System.out.println("=== Dados do Gerente ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: R$ " + getSalario());
        System.out.println("Departamento: " + getDepartamento());
    }
}
