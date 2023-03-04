package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que calcule e mostre a média aritmética de N notas.
--------------------------------------------------------------------------------*/

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas a ser inserido: ");
        int qtdNotas = input.nextInt();

        double soma = 0;
        double media;

        for (int i = 0; i < qtdNotas; i++) {
            System.out.println("informe a " + (i + 1) + "º nota: ");
            double nota = input.nextDouble();
            soma += nota;
        }
        media = (soma / qtdNotas);
        System.out.println("Média : " + media);
    }
}