package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça as 4 notas bimestrais e mostre a média
 --------------------------------------------------------------------------------*/

 public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a nota1: ");
        double nota1 = input.nextDouble();
        
        System.out.println("Informe a nota2: ");
        double nota2 = input.nextDouble();
        
        System.out.println("Informe a nota3: ");
        double nota3 = input.nextDouble();
        
        System.out.println("Informe a nota4: ");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas é: " + media);
    }
}
