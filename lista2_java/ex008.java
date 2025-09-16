import java.util.Scanner;

public class AnalisadorDeReais {
    private double[] numeros = new double[10];

    public void preencherVetor(Scanner scanner) {
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < this.numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            this.numeros[i] = scanner.nextDouble();
        }
    }

    public void analisarEImprimir() {
        int qtdNegativos = 0;
        double somaPositivos = 0;

        for (double numero : this.numeros) {
            if (numero < 0) {
                qtdNegativos++;
            } else if (numero > 0) {
                somaPositivos += numero;
            }
        }

        System.out.println("\nQuantidade de números negativos: " + qtdNegativos);
        System.out.printf("Soma dos números positivos: %.2f\n", somaPositivos);
    }
}

import java.util.Scanner;

public class TesteQuestao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnalisadorDeReais analisador = new AnalisadorDeReais();

        analisador.preencherVetor(scanner);
        analisador.analisarEImprimir();

        scanner.close();
    }
}