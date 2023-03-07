package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 *Criar um vetor A com 10 elementos Inteiros. Construir um vetor B de mesmo tipo
 *e tamanho, obdecendo as seguintes regras de formação: a)B deverá receber 1
 quando A for par; b)B deverá receber 0 quando A for ímpar.
--------------------------------------------------------------------------------*/

public class Exercicio25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 1; i < vetorA.length; i++) {
            System.out.println("Informe o " + i + "º: ");
            vetorA[i] = input.nextInt();

            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;  
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
    }

}