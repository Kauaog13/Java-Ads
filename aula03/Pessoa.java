package ex06;

class Pessoa {
    // A classe pai exige um nome no momento da criação
    Pessoa(String nome) {
        System.out.println("Pessoa criada: " + nome);
    }
}

class Aluno extends Pessoa {
    Aluno(String nome) {
        // CORREÇÃO: Invoca o construtor de Pessoa passando o nome recebido
        super(nome); 
        System.out.println("Aluno matriculado!");
    }
}