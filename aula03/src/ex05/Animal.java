package ex05;

/* Vai compilar? 
 * Resposta: Não.
 */

class Animal {
    // A classe Animal possui um construtor que exige uma String.
    // Isso faz com que o Java não crie mais o construtor vazio automático.
    Animal(String tipo) { 
        System.out.println("Tipo de animal: " + tipo);
    } 
} 

/* * Qual erro ocorrerá? 
 * Resposta: Erro de compilação informando que o construtor implícito 'Animal()' 
 * está indefinido. A classe Cachorro tenta chamar o construtor vazio do pai, 
 * mas ele não existe mais.
 */

class Cachorro extends Animal { 
    
    /* * Como corrigir? 
     * Resposta: Devemos usar a palavra-chave 'super' para chamar explicitamente 
     * o construtor da classe pai, passando o argumento que ela pede.
     */
    Cachorro() { 
        super("Canino"); // Correção: Chama o construtor de Animal passando a String necessária.
        System.out.println("Cachorro instanciado.");
    } 
    
    public static void main(String[] args) {
        new Cachorro();
    }
}