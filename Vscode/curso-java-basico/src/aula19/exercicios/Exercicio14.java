package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina
 * e escreva a média aritmética simples dos elementos ímpares armazenados neste 
 * vetor.
--------------------------------------------------------------------------------*/
public class Exercicio14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int qntImpares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero: ");
            vetorA[i] = input.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                soma += vetorA[i];
                qntImpares++;
            }
        }

        System.out.println("A média dos elementos ímpares é: " + (soma / qntImpares));
    }

}
