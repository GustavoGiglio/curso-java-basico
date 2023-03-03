package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * A série de Fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,34,55,...
 * faça um programa capaz de gerar a série até o n-ésimo termo.
--------------------------------------------------------------------------------*/

public class Exercicio15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero;
        int primeiro = 1; 
        int segundo = 1;
        int proximo;

        System.out.println("Informe um número: ");
        numero = input.nextInt();

        System.out.println(primeiro);
        System.out.println(segundo);

        for(int i = 3; i <= numero; i++){
           
           proximo = primeiro + segundo;    // primeiro |1|1|2|3|5
           primeiro = segundo;              // segundo  |1|2|3|5|8
           segundo = proximo;               // proximo  |2|3|5|8|13

           System.out.println(proximo); 
        }
    }
}
