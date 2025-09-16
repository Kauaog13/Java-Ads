import java.util.Arrays;

public class ManipuladorDeVetor {

    // Vetor denominado A que armazena 6 números inteiros
    private int[] A = new int[6];

    // (A) Atribui os valores: 1, 0, 5, -2, -5, 7
    public void atribuirValores() {
        this.A[0] = 1;
        this.A[1] = 0;
        this.A[2] = 5;
        this.A[3] = -2;
        this.A[4] = -5;
        this.A[5] = 7;
        System.out.println("Vetor inicializado.");
    }

    // (B) Armazena e mostra a soma de A[0], A[1] e A[5]
    public void somarPosicoesEspecificas() {
        int soma = A[0] + A[1] + A[5];
        System.out.println("A soma dos valores nas posições A[0], A[1] e A[5] é: " + soma);
    }

    // (C) Modifica a posição 4 para 100 e imprime o vetor completo
    public void modificarEImprimir() {
        System.out.println("\nModificando a posição 4 para o valor 100.");
        this.A[4] = 100;
        System.out.println("Vetor modificado: " + Arrays.toString(this.A));
    }
}

public class TesteQuestao1 {
    public static void main(String[] args) {
        // Cria uma instância da classe com a lógica
        ManipuladorDeVetor manipulador = new ManipuladorDeVetor();

        // Executa os passos definidos
        manipulador.atribuirValores();
        manipulador.somarPosicoesEspecificas();
        manipulador.modificarEImprimir();
    }
}