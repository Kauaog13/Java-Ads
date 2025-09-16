import java.util.Scanner;

public class CalculadoraDeMedia {
    private double[] notas = new double[15];

    public void lerNotas(Scanner scanner) {
        System.out.println("Digite a nota dos 15 alunos:");
        for (int i = 0; i < this.notas.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            this.notas[i] = scanner.nextDouble();
        }
    }

    public void calcularEImprimirMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }

        double media = soma / this.notas.length;
        System.out.printf("\nA média geral da turma é: %.2f\n", media);
    }
}

import java.util.Scanner;

public class TesteQuestao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraDeMedia calculadora = new CalculadoraDeMedia();

        calculadora.lerNotas(scanner);
        calculadora.calcularEImprimirMedia();
        
        scanner.close();
    }
}