package aula19.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 *Criar um vetor A com 10 elementos Inteiros. Construir um vetor B de mesmo tipo
 *e tamanho, obedecendo as seguintes regras de formação: a)B deverá receber 'a'
 *quando A for menor que 7; b)B deverá receber 'b' quando A for igual a 7; 
 *c)B deverá receber 'c' quando A for maior que 7 e menor que 10; d)B deverá 
 *receber 'd' quando A for igual a 10; e e)B deverá receber 'e' quando A for maior
 *que 10. Sugestão: charB[10];
--------------------------------------------------------------------------------*/

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o " + (i+1) + "º: ");
            vetorA[i] = input.nextInt();  

            if(vetorA[i] < 7){
                vetorB[i] = 'a';
            } else if (vetorA[i] == 7){
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10){
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10){
                vetorB[i] = 'd';
            } else if( vetorA[i] > 10){
                vetorB[i] = 'e';
            }
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
