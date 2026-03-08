package ex07;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, int portas) {
        super(marca); // Usando super para repassar a marca ao construtor da classe Veiculo
        this.portas = portas;
    }

    public void mostrarDados() {
        System.out.println("Marca do Veículo: " + this.marca);
        System.out.println("Quantidade de Portas: " + this.portas);
    }
}
