package aula19.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Implementar um programa que obtenha a cotação do dólar (U$) em relação ao
 * real (R$) e a seguir armazene em vetor A com 20 elementos as seguintes
 * conversões: A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
--------------------------------------------------------------------------------*/

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] vetorA = new double[20];

        System.out.println("Entre com a cotação do dólar: ");
        double cotacao = input.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i+1);
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(df.format(vetorA[i]) + " ");
        }
    }

}
