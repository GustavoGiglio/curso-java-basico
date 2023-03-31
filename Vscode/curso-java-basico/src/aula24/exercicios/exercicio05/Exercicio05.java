package aula24.exercicios.exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Contato contato1 = new Contato();
        contato1.nome = "Gustavo";
        contato1.sobrenome = "Giglio";
        contato1.endereco = "Rua centro historico";
        contato1.email = "gustavo@gmail.com";
        
        contato1.telefones = new String[5];
        contato1.telefones[0] = "9999-9999"; 
        contato1.telefones[1] = "9999-9998"; 
        contato1.telefones[2] = "9999-9997"; 

        System.out.println("Nome: "  + contato1.nome);
        System.out.println("Sobrenome: "  + contato1.sobrenome);
        System.out.println("Telefone 1: " + contato1.telefones[0]);
    }
}
