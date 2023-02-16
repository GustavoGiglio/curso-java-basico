package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça um número e então mostre a mensagem
 * O número informado foi [número].
 --------------------------------------------------------------------------------*/

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int numero = input.nextInt();
        System.out.println("O número informado foi " + numero);
    }
    
}
