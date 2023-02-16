package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que leia três número e mostre-os em ordem descresencte.
--------------------------------------------------------------------------------*/

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int numero1 = input.nextInt();
        
        System.out.println("Informe o segundo número: ");
        int numero2 = input.nextInt();
        
        System.out.println("Informe o terceiro número: ");
        int numero3 = input.nextInt();

        if(numero1 >= numero2 && numero1 >= numero3){
            if(numero2 >= numero3){
                System.out.println(numero1 + " " + numero2 + " " + numero3);
            } else { 
                System.out.println(numero1 + " " + numero3 + " " +numero2);
            }
        } else if(numero2 >= numero1 && numero2 >= numero3){
            if(numero1 >= numero3){
                System.out.println(numero2 + " " + numero1 + " " + numero3);
            } else {
                System.out.println(numero2 + " " + numero3 + " " + numero1);
            }
        } else if(numero3 >= numero1 && numero3 >= numero2){
            if(numero1 >= numero2){
                System.out.println(numero3 + " " + numero1 + " " + numero2);
            } else {
                System.out.println(numero3 + " " + numero2 + " " + numero1);
            }
        }
    }
}