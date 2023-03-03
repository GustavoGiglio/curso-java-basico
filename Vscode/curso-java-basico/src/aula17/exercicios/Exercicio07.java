package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que leia 5 números e informe o maior número.
--------------------------------------------------------------------------------*/

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe um número: ");
            numero = input.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número digitado foi: " + maior);

    }
}