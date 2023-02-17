package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça um número inteiro e determine se ele é par ou impar.
 * Dica: utilize o operador módulo(resto da divisão).
 --------------------------------------------------------------------------------*/

public class Exercicio18 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = input.nextInt();

        if(numero % 2 == 0){
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
    } 
}