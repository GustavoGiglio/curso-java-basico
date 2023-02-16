package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro
 * desta área para o usuário.
 --------------------------------------------------------------------------------*/

public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("informe o valor do lado do quadrado: ");
        double lado = input.nextDouble();
        
        //area = lado * lado
        double area = Math.pow(lado, 2);
        System.out.println("A area do quadrado é: " + area);
        System.out.println("O dobro da area do quadrado é: " + (area * 2));
    }
}