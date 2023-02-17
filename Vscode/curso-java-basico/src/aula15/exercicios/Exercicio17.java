package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça um número correspondente a um determinado ano e em 
 * seguida informe se este ano é ou não bissexto.
 --------------------------------------------------------------------------------*/

public class Exercicio17 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um ano: ");
        int ano = input.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println(ano + " É um ano bissexto");
        } else {
            System.out.println(ano + " não é um ano bissexto");
        }
    }
}