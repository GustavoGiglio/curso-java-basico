package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça dois números e imprima o maior deles.
--------------------------------------------------------------------------------*/

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero1 = input.nextDouble();
        
        System.out.println("Informe outro número: ");
        double numero2 = input.nextDouble();

        if(numero1 == numero2){
            System.out.println("os valores são iguais!");
        } else if (numero1 > numero2){
            System.out.println(numero1 + " é maior que " + numero2);
        } else {
            System.out.println(numero2 + " é maior que " + numero1);
        }
    }
}