package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça dois números, base e expoente, calcule e mostre o
 * primeiro número elevado ao segundo número. Não utilize a função de potência
 * da linguagem.
--------------------------------------------------------------------------------*/

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base;
        int expoente;

        System.out.println("Informe o primeiro número para base: ");
        base = input.nextInt();

        System.out.println("Informe o segundo número para expoente: ");
        expoente = input.nextInt();

        int resultado = base;

        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }
        
        System.out.println("Resultado: " + resultado);
    }

}
