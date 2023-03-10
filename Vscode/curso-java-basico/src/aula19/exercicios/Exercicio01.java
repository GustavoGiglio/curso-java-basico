package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo 
 * e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
--------------------------------------------------------------------------------*/

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe um numero inteiro: ");
            vetorA[i] = input.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println("");

        System.out.print("Vetor B = ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }

}
