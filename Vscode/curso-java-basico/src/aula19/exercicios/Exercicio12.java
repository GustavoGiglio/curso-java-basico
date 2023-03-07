package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina
 * e escreva a soma de todos os elementos armazenados neste vetor.
--------------------------------------------------------------------------------*/

public class Exercicio12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero: ");
            vetorA[i] = input.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            soma += vetorA[i];

        }

        System.out.println("A soma de todos elementos de vetor A é: " + soma);
    }
    
}
