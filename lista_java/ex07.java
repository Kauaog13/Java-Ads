import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite um número entre 1 e 10: ");
            n = scanner.nextInt();
        } while (n < 1 || n > 10);

        System.out.println("\n--- Tabuada de " + n + " ---");
        for (int i = 0; i <= 10; i++) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}