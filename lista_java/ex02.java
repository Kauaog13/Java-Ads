import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura, alturaMaxima = Double.MIN_VALUE, alturaMinima = Double.MAX_VALUE;

        System.out.println("Digite a altura de 5 participantes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Participante " + (i + 1) + ": ");
            altura = scanner.nextDouble();

            if (altura > alturaMaxima) {
                alturaMaxima = altura;
            }

            if (altura < alturaMinima) {
                alturaMinima = altura;
            }
        }

        System.out.printf("\nAltura máxima registrada: %.2f\n", alturaMaxima);
        System.out.printf("Altura mínima registrada: %.2f\n", alturaMinima);

        scanner.close();
    }
}