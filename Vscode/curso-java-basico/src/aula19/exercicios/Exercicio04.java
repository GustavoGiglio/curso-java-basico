package aula19.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo 
 * tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do 
 * respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
--------------------------------------------------------------------------------*/

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Informe o " + (i+1) + "º numero: ");
            vetorA[i] = input.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(df.format(vetorA[i]) + " ");
        }
        System.out.println("");

        System.out.print("Vetor B = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(df.format(vetorB[i]) + " ");
        }
    }

}
