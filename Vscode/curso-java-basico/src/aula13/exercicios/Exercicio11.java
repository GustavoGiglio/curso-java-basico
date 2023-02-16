package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 *Faça um programa que peça 2 números inteiros e um número real. Calcule e mostre:
 *a) O produto do dobro do primeiro com metade do segundo.
 *b) A soma do triplo do primeiro com o terceiro.
 *c) O terceiro elevado ao cubo.
 --------------------------------------------------------------------------------*/

public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero1 = input.nextInt();
        
        System.out.println("Informe um outro número inteiro: ");
        int numero2 = input.nextInt();
        
        System.out.println("Informe um numero real: ");
        double numero3 = input.nextDouble();

        int resultado1 = ((numero1 * 2) * (numero2 / 2));
        double resultado2 = (numero1 * 3) + numero3;
        double resultado3 = Math.pow(numero3, 3);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    }
}
