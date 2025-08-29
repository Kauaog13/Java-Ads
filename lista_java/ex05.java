import java.util.Scanner;

public class AnaliseNumeros2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int totalNumeros = 0;
        int pares = 0;
        int impares = 0;
        int somaPares = 0;
        int somaTotal = 0;

        System.out.println("Digite uma sequência de números positivos. Digite 0 para encerrar.");

        while ((numero = scanner.nextInt()) != 0) {
            totalNumeros++;
            somaTotal += numero;

            if (numero % 2 == 0) {
                pares++;
                somaPares += numero;
            } else {
                impares++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        if (pares > 0) {
            double mediaPares = (double) somaPares / pares;
            System.out.printf("Média dos números pares: %.2f\n", mediaPares);
        } else {
            System.out.println("Nenhum número par foi inserido. Não é possível calcular a média.");
        }

        if (totalNumeros > 0) {
            double mediaGeral = (double) somaTotal / totalNumeros;
            System.out.printf("Média geral dos números lidos: %.2f\n", mediaGeral);
        } else {
            System.out.println("Nenhum número foi inserido. Não é possível calcular a média.");
        }

        scanner.close();
    }
}