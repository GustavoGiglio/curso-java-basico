package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo
 * e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: 
 * B[i] = A[i]*2 
--------------------------------------------------------------------------------*/

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero: ");
            vetorA[i] = input.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.print("VetorA = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println("");
        
        System.out.print("VetorA = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

    }

}
