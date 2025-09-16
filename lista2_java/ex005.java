import java.util.Arrays;
import java.util.Scanner;

public class AnalisadorDeMaiorValor {
    private int[] numeros = new int[10];

    public void lerNumeros(Scanner scanner) {
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < this.numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            this.numeros[i] = scanner.nextInt();
        }
    }

    public void encontrarEImprimirMaior() {
        if (this.numeros.length == 0) {
            System.out.println("O vetor está vazio.");
            return;
        }

        int maior = this.numeros[0];
        int posicao = 0;

        for (int i = 1; i < this.numeros.length; i++) {
            if (this.numeros[i] > maior) {
                maior = this.numeros[i];
                posicao = i;
            }
        }
        
        System.out.println("\nVetor lido: " + Arrays.toString(this.numeros));
        System.out.println("Maior elemento: " + maior);
        System.out.println("Posição (índice) do maior elemento: " + posicao);
    }
}

import java.util.Scanner;

public class TesteQuestao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnalisadorDeMaiorValor analisador = new AnalisadorDeMaiorValor();

        analisador.lerNumeros(scanner);
        analisador.encontrarEImprimirMaior();

        scanner.close();
    }
}