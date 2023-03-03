package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso
 * o valor seja inválido e continue pedindo até que o usuário informe um valor 
 * válido.
--------------------------------------------------------------------------------*/

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean notaValida = false;


        //realiza o loop
        do {
            System.out.println("Informe uma nota entre 0-10: ");
            double nota = input.nextDouble();
    
            if(nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Nota informada: " + nota);
            } else {
                //notaValida = false;
                System.out.println("Nota inválida, digite novamente.");
            }
        } while (!notaValida); //Enquanto nota for diferente de uma nota válida continua realizando o loop


    }
    
}
