package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre
 * a temperatura em graus Celsius. C=(5*(F-32)/9).
 --------------------------------------------------------------------------------*/

public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Farenheit: ");
        double farenheit = input.nextDouble();

        double celsius = (5 * (farenheit - 32) / 9);
        System.out.println("A temperatura em graus Celsius é: " + celsius);
    }
}
