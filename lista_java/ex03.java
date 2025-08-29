import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        double soma = 0;
        int totalNumeros = 0;
        int positivos = 0;
        int negativos = 0;
        
        System.out.println("Digite os números. Digite um caractere (ex: 's') para encerrar a entrada.");

        while (scanner.hasNextDouble()) {
            numero = scanner.nextDouble();
            soma += numero;
            totalNumeros++;

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        
        if (totalNumeros > 0) {
            double media = soma / totalNumeros;
            double porcentagemPositivos = (double) positivos / totalNumeros * 100;
            double porcentagemNegativos = (double) negativos / totalNumeros * 100;

            System.out.println("\n--- Resultados ---");
            System.out.printf("Média aritmética dos números: %.2f\n", media);
            System.out.println("Total de números positivos: " + positivos);
            System.out.println("Total de números negativos: " + negativos);
            System.out.printf("Porcentagem de números positivos: %.2f%%\n", porcentagemPositivos);
            System.out.printf("Porcentagem de números negativos: %.2f%%\n", porcentagemNegativos);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }

        scanner.close();
    }
}