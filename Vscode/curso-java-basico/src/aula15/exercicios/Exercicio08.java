package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que pergunte o preço de três produtos e informe qual produto
 * você deve comprar, sabendo que a decisão é sempre o mais barato.
--------------------------------------------------------------------------------*/

public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro produto: ");
        double valorProduto1 = input.nextDouble();

        System.out.println("Informe o valor do segundo produto: ");
        double valorProduto2 = input.nextDouble();

        System.out.println("Informe o valor do terceiro produto: ");
        double valorProduto3 = input.nextDouble();
        
        if(valorProduto1 <= valorProduto2 && valorProduto1 <= valorProduto3){
            System.out.println("Você deve comprar o produto 1 de valor R$" + valorProduto1);
        } else if (valorProduto2 <= valorProduto1 && valorProduto2 <= valorProduto3){
            System.out.println("Você deve comprar o produto 2 de valor R$" + valorProduto2);
        } else {
            System.out.println("Você deve comprar o produto 3 de valor R$" + valorProduto3);
        }
    }
}