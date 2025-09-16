import java.util.Scanner;

public class LocalizadorMaiorMenor {
    private int[] valores = new int[5];

    public void lerValores(Scanner scanner) {
        System.out.println("Digite 5 valores inteiros:");
        for (int i = 0; i < this.valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            this.valores[i] = scanner.nextInt();
        }
    }

    public void mostrarPosicaoMaiorMenor() {
        if (this.valores.length == 0) {
            System.out.println("Vetor vazio.");
            return;
        }

        int posMaior = 0;
        int posMenor = 0;

        for (int i = 1; i < this.valores.length; i++) {
            if (this.valores[i] > this.valores[posMaior]) {
                posMaior = i;
            }
            if (this.valores[i] < this.valores[posMenor]) {
                posMenor = i;
            }
        }

        System.out.println("\nPosição (índice) do maior valor: " + posMaior);
        System.out.println("Posição (índice) do menor valor: " + posMenor);
    }
}

import java.util.Scanner;

public class TesteQuestao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalizadorMaiorMenor localizador = new LocalizadorMaiorMenor();

        localizador.lerValores(scanner);
        localizador.mostrarPosicaoMaiorMenor();

        scanner.close();
    }
}