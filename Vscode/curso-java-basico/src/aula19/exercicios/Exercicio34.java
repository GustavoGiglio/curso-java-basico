package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada
 * elemento do vetor A e a relação de todos os pares de 0 até o respectivo elemento.
-------------------------------------------------------------------------------- */

public class Exercicio34 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero: ");
            vetorA[i] = input.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Analisando o número " + vetorA[i]);
            for(int j = 2; j < vetorA[i]; j++){
                if(j % 2 == 0){
                    System.out.println(j + " é par");
                }
            }
        }
        System.out.println();
    }
}
