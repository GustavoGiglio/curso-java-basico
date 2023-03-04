package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma 
 * lista dos números primos existentes entre 1 e um número inteiro informado 
 * pelo usuário.
--------------------------------------------------------------------------------*/

public class Exercicio32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = input.nextInt();
        
        boolean primo;
        
        for (int i = 1; i <= numero; i++) {

            primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println(i);
            }
        }
    }

}
