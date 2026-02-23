package atividade1;

public class Aluno {
    String nome;
    double nota;

    void imprimirDados() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Nota: " + nota);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Kauã Oliveira";
        aluno1.nota = 10.0;
        aluno1.imprimirDados();
    }
}