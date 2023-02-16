package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça dois números e imprima a soma
 --------------------------------------------------------------------------------*/

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor inteiro a ser somado: ");
        int numero1 = input.nextInt();
        System.out.println("Informe o segundo valor inteiro a ser somado: ");
        int numero2 = input.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma de " + numero1 + "+" + numero2 + "=" + soma);
    }
}