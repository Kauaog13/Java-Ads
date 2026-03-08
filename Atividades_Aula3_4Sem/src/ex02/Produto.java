package ex02;

public class Produto {
    // Atributos privados (Encapsulamento)
    private String nome;
    private double preco;

    // Método Setter para o preço com validação
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo!");
        }
    }

    // Método Getter para o preço
    public double getPreco() {
        return preco;
    }

    // Getters e Setters para o nome (boa prática)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Teclado Mecânico");
        
        // Testando valor válido
        p1.setPreco(150.00);
        System.out.println("Produto: " + p1.getNome() + " | Preço: R$ " + p1.getPreco());

        // Testando valor inválido (negativo)
        p1.setPreco(-50.00); 
    }
}