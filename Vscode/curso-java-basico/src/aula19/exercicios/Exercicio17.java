package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Ler um vetor A com 10 elementos inteiros correspondentes as idades de um 
 * grupo de pessoas. Escreva um programa que determine e escreva a quantidade de
 * pessoas que possuem idade superior a 35 anos.
--------------------------------------------------------------------------------*/

public class Exercicio17 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Informe a idade da " + (i+1) + "º pessoa");
            vetorA[i] = input.nextInt();
        }

        int qntIdadeMaior =0;
        for(int i =0; i < vetorA.length; i++){
            if(vetorA[i] > 35){
                qntIdadeMaior++;
            }
        }
        System.out.println("Quantidade de pessoas com idade superior a 35 anos: " + qntIdadeMaior);
    }
}
