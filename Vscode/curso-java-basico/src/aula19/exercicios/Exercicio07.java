package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um 
 * vetor C, onde cada elemento de C é a subtração dos respectivos elementos em A e B,
 * ou seja: C[i] = A[i] - B[i].
--------------------------------------------------------------------------------*/

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(" Vetor A: Informe o " + (i+1) + "º numero:");
            vetorA[i] = input.nextInt();
        }
       
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Vetor B: Informe o " + (i+1) + "º numero:");
            vetorB[i] = input.nextInt();
        }
        for (int i = 0 ; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
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
        
        System.out.println("");

        System.out.print("Vetor C = ");
        for(int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
    }
}
