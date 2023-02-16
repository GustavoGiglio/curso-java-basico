package aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

    /*     
        System.out.println("Informe sua idade: ");
        int idade = input.nextInt();

        if(idade >= 19){
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }
    */
        System.out.println("Informe o preço do item: ");
        double valor = input.nextDouble();

        if(valor <= 10){
            System.out.println("Está barato para comprar");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Muito caro!");
        }
    }
}
