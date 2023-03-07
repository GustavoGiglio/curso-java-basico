package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que 
 * verifique se "todos" os elementos do vetor A são pares. Se pelo menos um 
 * elemento do vetor não for par o processo de repetição para percorrer os 
 * elementos do vetor deve ser encerrado, como sugestão: utilize uma variável do
 * tipo flag para atingir este propósito.
--------------------------------------------------------------------------------*/

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 1; i < vetorA.length; i++) {
            System.out.println("Informe o " + i + "º: ");
            vetorA[i] = input.nextInt();
            if (vetorA[i] % 2 != 0) {
                break;
            }

        }

    }
}