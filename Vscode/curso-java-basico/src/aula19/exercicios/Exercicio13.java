package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que 
 * determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.
--------------------------------------------------------------------------------*/

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero: ");
            vetorA[i] = input.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0) {
                soma += vetorA[i];
            }
        }

        System.out.println("A soma de todos elementos de vetor A é: " + soma);
    }

}
