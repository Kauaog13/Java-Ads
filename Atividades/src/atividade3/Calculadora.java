package atividade3;

public class Calculadora {

    // Método para somar
    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    // Método para subtrair
    public double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
    }
}