package ex07;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Carro
        Carro meuCarro = new Carro("Toyota", 4);

        // Chamando o método para exibir os dados
        meuCarro.mostrarDados();

        System.out.println("\n---------------------------\n");

        Carro outroCarro = new Carro("Honda", 2);
        outroCarro.mostrarDados();
    }
}
