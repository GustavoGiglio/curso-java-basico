package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo
 * e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão do
 * respectivo elemento de A por 2 (dois), ou seja: B[i] = A[i] % 2. 
--------------------------------------------------------------------------------*/

public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Informe o " + (i+1) + "º numero: ");
            vetorA[i] = input.nextInt();
            vetorB[i] = vetorA[i] % 2;
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
