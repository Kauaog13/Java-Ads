import java.util.Arrays;
import java.util.Scanner;

public class CalculadoraDeQuadrados {
    private double[] numerosReais;
    private double[] quadrados;

    public void lerNumeros(Scanner scanner, int quantidade) {
        this.numerosReais = new double[quantidade];
        this.quadrados = new double[quantidade];
        
        System.out.println("Digite " + quantidade + " números reais:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            this.numerosReais[i] = scanner.nextDouble();
        }
    }

    public void calcularQuadrados() {
        for (int i = 0; i < this.numerosReais.length; i++) {
            this.quadrados[i] = this.numerosReais[i] * this.numerosReais[i];
        }
    }

    public void imprimirVetores() {
        System.out.println("\nVetor Original: " + Arrays.toString(this.numerosReais));
        System.out.println("Vetor de Quadrados: " + Arrays.toString(this.quadrados));
    }
}

import java.util.Scanner;

public class TesteQuestao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraDeQuadrados calculadora = new CalculadoraDeQuadrados();

        System.out.print("Quantos números deseja inserir? ");
        int quantidade = scanner.nextInt();

        calculadora.lerNumeros(scanner, quantidade);
        calculadora.calcularQuadrados();
        calculadora.imprimirVetores();

        scanner.close();
    }
}