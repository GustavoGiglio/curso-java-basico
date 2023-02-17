package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 *Faça um programa que leia um número e exiba o dia correspondente da semana.
 *(1-Domingo, 2-Segunda, etc.), se digitar outro valor deve parecer valor inválido 
 --------------------------------------------------------------------------------*/

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número [1-7]: ");
        int diaSemana = input.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor Inválido");
        }

    }
}
