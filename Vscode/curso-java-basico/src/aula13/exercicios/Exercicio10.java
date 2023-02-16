package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça a temperatura em graus Celsius, transforme e mostre
 * em graus Farenheit.
 --------------------------------------------------------------------------------*/

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Celsius: ");
        double celsius = input.nextDouble();

        double farenheit = celsius * 1.8 + 32;
        System.out.println("A temperatura em Farenheit é: " + farenheit);
    }
}
