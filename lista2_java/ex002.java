import java.util.Arrays;
import java.util.Scanner;

public class LeitorDeValores {
    private int[] valores = new int[6];

    public void lerValores(Scanner scanner) {
        System.out.println("Digite 6 valores inteiros:");
        for (int i = 0; i < this.valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            this.valores[i] = scanner.nextInt();
        }
    }

    public void mostrarValores() {
        System.out.println("\nValores lidos:");
        System.out.println(Arrays.toString(this.valores));
    }
}

import java.util.Scanner;

public class TesteQuestao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LeitorDeValores leitor = new LeitorDeValores();

        leitor.lerValores(scanner);
        leitor.mostrarValores();

        scanner.close();
    }
}