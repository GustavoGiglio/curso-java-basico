package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * faça um programa que peça um número inteiro e determine se ele é ou não é 
 * número primo. Um número primo é aquele que é divisível somente por ele mesmo
 * e por 1. 
--------------------------------------------------------------------------------*/

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = input.nextInt();

        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("Não é primo");
                primo = false;
            }
        }
        if (primo) {
            System.out.println("É primo");
        }
    }
}
