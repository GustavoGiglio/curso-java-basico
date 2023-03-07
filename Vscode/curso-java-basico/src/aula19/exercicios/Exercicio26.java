package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 *Criar dois vetores A e B cada um com 10 elementos Inteiros. Construir um vetor C 
 *de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
 *a)C deverá receber 1 quando A for maior que B; b)C deverá receber 0 quando A for
 *igual a B; c)deverá receber -1 quando A for menor que B.
 * --------------------------------------------------------------------------------*/

public class Exercicio26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o número para o vetorA " + (i+1) + "º: ");
            vetorA[i] = input.nextInt(); 
        }
        
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Informe o número para vetorB " + (i+1) + "º: ");
            vetorB[i] = input.nextInt(); 

            if(vetorA[i]==vetorB[i]){
                vetorC[i] = 0;
            } else if(vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            } else {
                vetorC[i] = -1;
            }
            
        }

        System.out.print("Vetor a = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
       
        System.out.println("");

        System.out.print("Vetor b = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("");

        System.out.print("Vetor c = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
    
}
