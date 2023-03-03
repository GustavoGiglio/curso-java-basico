package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Altere o programa anterior para mostrar no final a soma dos números.
--------------------------------------------------------------------------------*/

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        double soma = 0;

        System.out.println("Informe o primeiro número: ");
        numero1 = input.nextInt();

        System.out.println("Informe o segundo número: ");
        numero2 = input.nextInt();

        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
            soma += i;
        }

        System.out.println("Soma: " + soma);
    }
}
