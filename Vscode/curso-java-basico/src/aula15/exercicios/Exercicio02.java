package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça um valor e mostre na tela se o valor é positivo ou
 * negativo.
--------------------------------------------------------------------------------*/

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = input.nextInt();

        if(numero >= 0){
            System.out.println(numero + " é positivo");
        } else {
            System.out.println(numero + " é negativo");
        }
    }
}