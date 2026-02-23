package atividade2; // Verifique se o package está correto no seu projeto

public class Produto {
    // Atributos
    String nome;
    double preco;

    // Método para mostrar dados
    void mostrarDados() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
    }

    public static void main(String[] args) {
        // Criando o objeto
        Produto p1 = new Produto();
        
        // Atribuindo valores
        p1.nome = "Notebook Gamer";
        p1.preco = 4500.00;

        // Mostrando os dados
        p1.mostrarDados();
    }
}