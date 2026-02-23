package atividade4;

public class Retangulo {
    // Atributos
    double base;
    double altura;

    // Método para calcular a área
    public double calcularArea() {
        return base * altura;
    }

    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        
        // Definindo os valores
        ret.base = 5.0;
        ret.altura = 3.0;
        
        // Imprimindo o resultado
        System.out.println("Base: " + ret.base);
        System.out.println("Altura: " + ret.altura);
        System.out.println("Área Total: " + ret.calcularArea());
    }
}