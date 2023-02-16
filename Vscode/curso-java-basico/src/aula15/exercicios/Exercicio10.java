package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que pergunte em que turno você estuda. Peça para digitar
 * M-matutino ou V-Vespertino ou N-Noturno. Imprima a mensagem "Bom Dia!", 
 * "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido", conforme o caso.
--------------------------------------------------------------------------------*/

public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Que turno você estuda? [M] [V] [N]");
        String turno = input.next();

        if(turno.length() > 1){
            System.out.println("Valor Inválido! Insira apenas um caractere!");
        } else {

            if(turno.equalsIgnoreCase("m")){
                System.out.println("Bom dia!");
            } else if(turno.equalsIgnoreCase("v")){
                System.out.println("Boa Tarde!");
            } else if(turno.equalsIgnoreCase("n")){
                System.out.println("Boa Noite!");
            } else {
                System.out.println("Valor Inválido!");
            }
        }
    }    
}
