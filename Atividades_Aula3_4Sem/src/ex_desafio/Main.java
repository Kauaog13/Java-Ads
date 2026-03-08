package ex_desafio;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testando Criação Válida ---");
        Gerente gerente1 = new Gerente("Ana Souza", 35, 8500.00, "Tecnologia da Informação");
        gerente1.exibirInformacoes();

        System.out.println("\n--- Testando Validações (Regra de Negócio) ---");

        System.out.println("\nTentando alterar para salário negativo:");
        gerente1.setSalario(-500); // Isso deve acionar a mensagem de erro

        System.out.println("\nTentando criar funcionário com salário negativo inicial:");
        Funcionario funcInvalido = new Funcionario("Carlos", 28, -1200.00);
        System.out.println("Salário após criação inválida: R$ " + funcInvalido.getSalario());

        System.out.println("\nTentando alterar para idade negativa:");
        gerente1.setIdade(-5); // Isso deve acionar a mensagem de erro

        System.out.println("\n--- Verificando estado atual pós validações ---");
        gerente1.exibirInformacoes();
    }
}
