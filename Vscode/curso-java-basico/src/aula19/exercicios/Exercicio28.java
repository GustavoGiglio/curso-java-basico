package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho
 * e com os mesmos elementos de A, sendo que estes deverão estar invertidos, ou
 * seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento 
 * de A passa a ser o penúltimo de B e assim por diante.
-------------------------------------------------------------------------------- */

public class Exercicio28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero: ");
            vetorA[i] = input.nextInt();
            vetorB[vetorA.length - i - 1] = vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}