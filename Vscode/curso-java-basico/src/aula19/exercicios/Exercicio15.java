package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina
 * o percentual de elementos pares e ímpares, respectivamente, armazenados neste 
 * vetor.
--------------------------------------------------------------------------------*/

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero: ");
            vetorA[i] = input.nextInt();
        }

        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                impar++;
            }
        }

        int par = vetorA.length - impar;

        double porcentagemPar = (par * 100) / vetorA.length;
        double porcentagemImpar = 100 - porcentagemPar;

        System.out.println("Porcentagem Pares: " + porcentagemPar);
        System.out.println("Porcentagem Impares: " + porcentagemImpar);

    }

}
