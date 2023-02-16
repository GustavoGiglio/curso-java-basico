package aula13.exercicios;
/*--------------------------------------------------------------------------------
 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
 * calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura)-58
 --------------------------------------------------------------------------------*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a sua altura: ");
        double altura = input.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}