package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que leia 5 números e informe a soma e a média dos números.
--------------------------------------------------------------------------------*/

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int soma = 0;
        double media;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe um número: ");
            numero = input.nextInt();
            soma += numero;
        }
        media = soma / 5;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
