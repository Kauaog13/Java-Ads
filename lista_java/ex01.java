public class SomaNumeros {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                soma += i;
                contador++;
            }
        }

        System.out.println("A soma dos números ímpares e múltiplos de 3 é: " + soma);
        System.out.println("O total de números que atenderam aos critérios é: " + contador);
    }
}