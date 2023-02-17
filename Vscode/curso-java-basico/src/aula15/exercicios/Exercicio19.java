package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que leia 2 números e em seguida pergunte ao usuario qual 
 * operação ele deseja realizar. O resultado da operação deve ser acompanhado de
 * uma frase que diga se o número é:
 *      par ou ímpar
 *      positivo ou negativo
 --------------------------------------------------------------------------------*/

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int numero1 = input.nextInt();

        System.out.println("Informe o segundo número:");
        int numero2 = input.nextInt();

        System.out.println("Qual operação deseja realizar [+] [-] [*] [/]: ");
        String opcao = input.next();
        boolean valida = true;
        double resultado =0;
        
        switch (opcao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Opção inválida!");
                valida = false;
        }

        if (valida) {
            
            System.out.println("Resultado: " + resultado);

            if (resultado % 2 == 0) {
                System.out.println("É par");
            } else {
                System.out.println("É ímpar");
            }

            if (resultado > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("negativo");
            }
        }
    }
}