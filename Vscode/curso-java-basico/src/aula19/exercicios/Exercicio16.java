package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e
 * escreva: 
 * a)A soma de elementos armazenados neste vetor que são inferiores a 15;
 * b)A quantidade de elementos armazenados neste vetor que são iguais a 15; e 
 * c)A média dos elementos armazenados no vetor que são superiores a 15.
--------------------------------------------------------------------------------*/

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número: ");
            vetorA[i] = input.nextInt();
        }

        int somaInferior = 0;
        int qntIgual = 0;
        int somaSuperior = 0;
        int qntSuperior = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 15) {
                somaInferior += vetorA[i];
            } else if (vetorA[i] == 15) {
                qntIgual ++;
            } else {
                somaSuperior += vetorA[i];
                qntSuperior++;
            }
        }

        for(int i =0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println("");

        System.out.println("Soma números < 15: " + somaInferior);
        System.out.println("Qnt números ==  15: " + qntIgual);
        System.out.println("Média números > 15: " + (somaSuperior/qntSuperior));
    }

}
