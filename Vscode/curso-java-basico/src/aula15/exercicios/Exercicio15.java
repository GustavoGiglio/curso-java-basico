package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar
 * se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo
 * se o mesmo é: equilatero, isósceles ou escaleno.
 *    Dicas:
 *    -Três lados formam um triângulo, quando a soma de quaisquer dois lados for
 *      maior que o terceiro.
 *    -Triângulo Equilátero: Três lados iguais.
 *    -Triângulo Isósceles: quaisquer dois lados iguais.
 *    -Triângulo Escaleno: Três lados diferentes
 --------------------------------------------------------------------------------*/

public class Exercicio15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro lado do triângulo: ");
        double lado1 = input.nextDouble();

        System.out.println("Informe o segundo lado do triângulo: ");
        double lado2 = input.nextDouble();

        System.out.println("Informe o terceiro lado do triângulo: ");
        double lado3 = input.nextDouble();

        if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 +lado3 > lado1)){
           
            if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("É um triângulo Equilatero");
            
            } else if(lado1 == lado2 || lado2 == lado3 || lado3 ==lado1){
                System.out.println("É um triângulo Isósceles");
            
            } else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
                System.out.println("É um triângulo Escaleno");
            }
        } else {
            System.out.println("Não é triângulo!");
        }
    }
}