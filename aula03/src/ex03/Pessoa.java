package ex03;

public class Pessoa {
    // Atributo acessível para as classes filhas
    protected String nome;

    // Construtor que recebe o nome
    public Pessoa(String nome) {
        this.nome = nome;
    }
}