package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 *Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
 números pares e a quantidade de números impares. 
--------------------------------------------------------------------------------*/

public class Exercicio14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero; 
        int qntPares =0;
        int qntImpares = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("informe um número: ");
            numero = input.nextInt();

            if(numero % 2 == 0){
                qntPares++;
            } else {
                qntImpares++;
            }
        }
        System.out.println("Resultado");
        System.out.println("Par: " + qntPares + " Impar: " + qntImpares);
    }
    
}
