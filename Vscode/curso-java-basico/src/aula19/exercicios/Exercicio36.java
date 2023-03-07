package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada 
 * elemento do vetor A é formado pela potência de base 2 elevado ao expoente igual
 * a posição do respectivo elemento, ou seja: A[i] = 2. Sugestão int A[11];
-------------------------------------------------------------------------------- */

public class Exercicio36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[11];
        
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero: ");
            vetorA[i] = input.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.pow(2, i); 
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
    
    }
    
}
