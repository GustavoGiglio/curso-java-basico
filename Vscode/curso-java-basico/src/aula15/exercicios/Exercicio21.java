package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 * Álcool:
 *  -Até 20 litros, desconto de 3% por litro
 *  -Acima de 20 litros, desconto de 5% por litro 
 * Gasolina:
 *  -Até 20 litros, desconto de 3% por litro
 *  -Acima de 20 litros, desconto de 6% por litros
 * Escreva um algoritmo que leia um número de litros vendidos, o tipo de 
 * combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e 
 * imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
 * gasolina é R$2,50, o preço do litro do álcool é R$1,90.
 --------------------------------------------------------------------------------*/

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de litros vendidos: ");
        double litros = input.nextDouble();

        System.out.println("Informe o tipo de combustível: [A]álcool ou [G]gasolina: ");
        String tipoCombustivel = input.next();

        double precoGasolina = 2.5;
        double precoAlcool = 1.9;
        double percentualDesconto = 0;
        double total = 0;
        double totalDesconto = 0;
        
        if (tipoCombustivel.equalsIgnoreCase("a")) {
            if (litros <= 20) {
                percentualDesconto = 3;
            } else {
                percentualDesconto = 5;
            }

            total = litros * precoAlcool;
            
        } else if (tipoCombustivel.equalsIgnoreCase("g")) {
            if (litros <= 20) {
                percentualDesconto = 3;
            } else {
                percentualDesconto = 6;
            }
            
            total = litros * precoGasolina;
        }

        totalDesconto = (total / 100) * percentualDesconto;
        double precoPagar = total - totalDesconto;

        System.out.println("Valor a ser pago: " + precoPagar);

        
    }
}