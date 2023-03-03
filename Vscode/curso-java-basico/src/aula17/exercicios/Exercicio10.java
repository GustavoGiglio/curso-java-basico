package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que receba dois números inteiros e gere os números inteiros
 * que estão no intervalo compreendido por eles.
--------------------------------------------------------------------------------*/

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Informe o primeiro número: ");
        numero1 = input.nextInt();

        System.out.println("Informe o segundo número: ");
        numero2 = input.nextInt();

        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
        }
    }
}
