package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que calcule as raizes de uma equação do segundo grau, na forma
 * ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as 
 * consistências, informando ao usuário nas seguintes situações:
 *  a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo
 *     grau e o programa não ve fazer pedir os demais valores, sendo encerrado;
 *  b. Se o delta calculado for negativo, a equação não possui raizes reais. 
 *     Informe ao usuário e encerra o programa;
 *  c. Se o delta calculado for igual a zero a equação possui apenas um raiz real;
 *     Informe-a ao usuário;
 *  d. Se o delta for positivo, a equação possui raiz reais; Informe-as ao usuário.
 --------------------------------------------------------------------------------*/

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe valor para A:");
        int a = input.nextInt();

        if (a == 0) {
            System.out.println("A equação não é de 2º grau!");
        } else {
            System.out.println("Informe valor para B:");
            int b = input.nextInt();

            System.out.println("Informe valor para C:");
            int c = input.nextInt();

            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("A equação não possui raizes reais");
            } else {
                System.out.println("Delta: " + delta);

                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }
    }
}