package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
 --------------------------------------------------------------------------------*/

public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do raio do circulo: ");
        double raio = input.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do circulo é: " + area);
    }

}
