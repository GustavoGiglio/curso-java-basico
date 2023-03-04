package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Altere o programa de cálculo dos números primos, informando, caso o número não 
 * seja primo, por quais números ele é divisível.
--------------------------------------------------------------------------------*/

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = input.nextInt();

        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("Não é primo - divisível por " + i);
                primo = false;
            }
        }
        if (primo) {
            System.out.println("É primo");
        }
    }
}
