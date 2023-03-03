package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Façaa um programa que calcule o fatorial de um número inteiro fornecido pelo
 * usuáio. Ex: 5! = 5.4.3.2.1 = 120
--------------------------------------------------------------------------------*/

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número: ");
        numero = input.nextInt();

        int fatorial = 1;

        System.out.print(numero + "! = ");

        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            System.out.print(i + "*");
        }
        System.out.println("= " + fatorial);
    }
}
