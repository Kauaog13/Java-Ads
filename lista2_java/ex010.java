import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VerificadorDeIguais {
    private int[] vetor = new int[10];

    public void lerVetor(Scanner scanner) {
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.print("Posição " + i + ": ");
            this.vetor[i] = scanner.nextInt();
        }
    }

    public void verificarEImprimirIguais() {
        Set<Integer> valoresRepetidos = new HashSet<>();
        Set<Integer> unicos = new HashSet<>();

        System.out.println("\nValores repetidos encontrados:");
        boolean encontrou = false;

        for (int valor : this.vetor) {
            // Se o valor não for adicionado ao conjunto de únicos, significa que ele já existe.
            if (!unicos.add(valor)) {
                // Adicionamos ao conjunto de repetidos para não imprimir o mesmo número várias vezes.
                if (valoresRepetidos.add(valor)) {
                    System.out.println(valor);
                    encontrou = true;
                }
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum valor repetido foi encontrado.");
        }
    }
}

import java.util.Scanner;

public class TesteQuestao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VerificadorDeIguais verificador = new VerificadorDeIguais();

        verificador.lerVetor(scanner);
        verificador.verificarEImprimirIguais();
        
        scanner.close();
    }
}