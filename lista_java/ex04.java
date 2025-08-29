import java.util.Scanner;

public class IntervalosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int count0_25 = 0;
        int count26_50 = 0;
        int count51_75 = 0;
        int count76_100 = 0;

        System.out.println("Digite números positivos. Digite um número negativo para encerrar.");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero >= 0 && numero <= 25) {
                count0_25++;
            } else if (numero >= 26 && numero <= 50) {
                count26_50++;
            } else if (numero >= 51 && numero <= 75) {
                count51_75++;
            } else if (numero >= 76 && numero <= 100) {
                count76_100++;
            }
        }

        System.out.println("\n--- Análise dos números ---");
        System.out.println("Total de números no intervalo [0-25]: " + count0_25);
        System.out.println("Total de números no intervalo [26-50]: " + count26_50);
        System.out.println("Total de números no intervalo [51-75]: " + count51_75);
        System.out.println("Total de números no intervalo [76-100]: " + count76_100);

        scanner.close();
    }
}