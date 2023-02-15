package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
    /* 
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = teclado.nextLine(); 
        System.out.println("Seu nome completo é: "+ nomeCompleto);
        
        System.out.println("Digite o seu primeiro nome: ");
        String primeiroNome = teclado.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
      
        System.out.println("Digie a sua idade:");
        int idade = teclado.nextInt();
        System.out.println("Sua idade é: " + idade);
        
        System.out.println("Digite a sua altura: ");
        double altura = teclado.nextDouble();
        System.out.println("sua altura é: " + altura);
    */

        System.out.println("Digite o seu primeiro nome, idade, quandidade de filhos, altura e se tem bichinho de estimação: ");
        String primeiroNome = teclado.next();
        int idade = teclado.nextInt();
        byte qtdFilhos = teclado.nextByte();
        float altura = teclado.nextFloat();
        boolean temPet = teclado.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro Nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinho de estimação? " + temPet);

    }
}