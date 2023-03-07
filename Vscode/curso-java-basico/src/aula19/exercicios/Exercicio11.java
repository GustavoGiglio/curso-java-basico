package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina
 * e escreva a quantidade de elementos armazenados neste vetor que são pares.
--------------------------------------------------------------------------------*/

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdNumerosPares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero: ");
            vetorA[i] = input.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                qtdNumerosPares++;
            }
        }

        System.out.println("Quandidade de elementos Pares: " + qtdNumerosPares);
    }

}
