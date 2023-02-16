package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que leia três números e mostre o maior e o menor deles.
--------------------------------------------------------------------------------*/


public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int valor1 = input.nextInt();

        System.out.println("Informe o segundo valor: ");
        int valor2 = input.nextInt();

        System.out.println("Informe o terceiro valor: ");
        int valor3 = input.nextInt();

        if((valor1 >= valor2 && valor1 >= valor3) ) {
            System.out.println(valor1 + " É maior que " + valor2 + " e " + valor3);
        } else if((valor2 >= valor1) && (valor2 >= valor3)){
            System.out.println(valor2 + " É maior que " + valor1 + " e " + valor3);
        } else {
            System.out.println(valor3 + " É maior que " + valor1 + " e " + valor2);
        }

        if((valor1 <= valor2 && valor1 <= valor3) ) {
            System.out.println(valor1 + " É menor que " + valor2 + " e " + valor3);
        } else if((valor2 <= valor1) && (valor2 <= valor3)){
            System.out.println(valor2 + " É menor que " + valor1 + " e " + valor3);
        } else {
            System.out.println(valor3 + " É menor que " + valor1 + " e " + valor2);
        }
    }
}