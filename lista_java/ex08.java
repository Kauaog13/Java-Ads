import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
        a = scanner.nextInt();

        if (a < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else if (a == 0) {
            System.out.println("0! = 1");
        } else {
            long fatorial = 1;
            StringBuilder sequencia = new StringBuilder();
            
            System.out.println("\nCálculo do fatorial de " + a + ":");
            for (int i = a; i > 0; i--) {
                fatorial *= i;
                sequencia.append(i);
                if (i > 1) {
                    sequencia.append(" x ");
                }
            }
            
            System.out.println(sequencia.toString() + " = " + fatorial);
        }
        
        scanner.close();
    }
}