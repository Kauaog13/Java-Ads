import java.util.Scanner;

public class ContadorDePares {
    private int[] vetor = new int[10];

    public void lerVetor(Scanner scanner) {
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.print("Posição " + i + ": ");
            this.vetor[i] = scanner.nextInt();
        }
    }

    public void contarEImprimirPares() {
        int contador = 0;
        for (int valor : this.vetor) {
            if (valor % 2 == 0) {
                contador++;
            }
        }
        System.out.println("\nO vetor possui " + contador + " valor(es) par(es).");
    }
}

import java.util.Scanner;

public class TesteQuestao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContadorDePares contador = new ContadorDePares();

        contador.lerVetor(scanner);
        contador.contarEImprimirPares();

        scanner.close();
    }
}