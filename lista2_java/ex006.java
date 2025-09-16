import java.util.Scanner;

public class ImpressoraInversa {
    private int[] valores = new int[6];

    public void lerValores(Scanner scanner) {
        System.out.println("Digite 6 valores inteiros:");
        for (int i = 0; i < this.valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            this.valores[i] = scanner.nextInt();
        }
    }

    public void mostrarOrdemInversa() {
        System.out.println("\nValores na ordem inversa:");
        for (int i = this.valores.length - 1; i >= 0; i--) {
            System.out.print(this.valores[i] + " ");
        }
        System.out.println(); // Nova linha no final
    }
}

import java.util.Scanner;

public class TesteQuestao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImpressoraInversa impressora = new ImpressoraInversa();

        impressora.lerValores(scanner);
        impressora.mostrarOrdemInversa();

        scanner.close();
    }
}