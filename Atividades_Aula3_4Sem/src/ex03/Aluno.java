package ex03;

public class Aluno extends Pessoa {
    private String curso;

    // Construtor do Aluno
    public Aluno(String nome, String curso) {
        // super(nome) envia o nome para o construtor da classe Pessoa
        super(nome);
        this.curso = curso;
    }

    public void mostrarDados() {
        // 'nome' é acessado diretamente porque é protected em Pessoa
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
    }

    // Método Main para testar
    public static void main(String[] args) {
        System.out.println("--- Testando Herança ---");
        
        // Criando o objeto Aluno
        Aluno a1 = new Aluno("Kauã Oliveira", "Análise e Desenvolvimento de Sistemas");
        
        // Chamando o método de exibição
        a1.mostrarDados();
    }
}