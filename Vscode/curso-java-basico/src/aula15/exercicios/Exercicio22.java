package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 *                     Até 5kg           Acima de 5Kg
 *      Morango     R$ 2,50 por Kg      R$ 2,20 por Kg
 *      Maçã        R$ 1,80 por Kg      R$ 1,50 por Kg
 * Se o cliente comprar mais de 8kg em frutas ou o precoParcial total da compra 
 * ultrapassar R$25,00, receberá ainda um desconto de 10% sobre este total.
 * Escreva um algoritmo para ler a quantidade(em kg) de morangos e a quantidade
 * (em Kg) de maças adquiridas e escreva o precoParcial a ser pago do cliente.
 --------------------------------------------------------------------------------*/

public class Exercicio22 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de morangos(Kg): ");
        double qtdMorango = input.nextDouble();
        
        System.out.println("Informe a quantidade de maçãs(Kg): ");
        double qtdMaca = input.nextDouble();

        double precoMorango =0;
        double precoMaca =0;
        
        if(qtdMorango <= 5){
            precoMorango = 2.5;
        }else if(qtdMorango > 5){
            precoMorango = 2.2;
        }
        
        if(qtdMaca <= 5){
            precoMaca = 1.8;
        }else if(qtdMaca > 5){
            precoMaca = 1.5;
        }
        
        double precoTotalMorango = qtdMorango * precoMorango;
        double precoTotalMaca = qtdMaca * precoMaca;
        
        double precoParcial = precoTotalMorango + precoTotalMaca;
        double precoTotal = precoParcial;

        if((qtdMorango + qtdMaca > 8) || (precoParcial > 25)){
            precoTotal = precoParcial - ((precoParcial / 100) * 10); 
        }

        System.out.println("Valor a ser pago: R$" + precoTotal);
    }    
}