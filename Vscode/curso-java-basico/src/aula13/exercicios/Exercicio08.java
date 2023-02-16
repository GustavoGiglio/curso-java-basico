package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que pergunte quanto você ganha por hora e o número de horas
 * trabalhadas no mês. Calcule e mostre o total do seu sálario no referido mês.
 --------------------------------------------------------------------------------*/

public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorHora = input.nextDouble();
        
        System.out.println("Número de horas trabalhadas no mês: ");
        double horas = input.nextDouble();

        double salario = horas * valorHora;
        System.out.println("Seu sálario total do mês é: " + salario);
    }
}
