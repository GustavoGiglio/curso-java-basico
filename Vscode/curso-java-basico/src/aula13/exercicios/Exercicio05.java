package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que converta metros para centímetros.
 --------------------------------------------------------------------------------*/

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor a ser convertido de metros para centimetros: ");
        double metros = input.nextDouble();
        
        double centimetros = metros * 100;
        System.out.println("Valor convertido para " + centimetros + "cm");
    }
}