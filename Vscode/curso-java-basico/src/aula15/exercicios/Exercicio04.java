package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que verifique se uma letra digitada é vogal ou consoante.
--------------------------------------------------------------------------------*/

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um letra: ");
        String letra = input.next();

    /*     
        //Primeira forma de resolver o exercício.
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") 
        || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") 
        || letra.equalsIgnoreCase("u") ){
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    */    
        //verificando se foi inserido mais de um caractere.
        if(letra.length() >  1){
            System.out.println("Valor invalido");
            System.out.println("Insira somente uma letra");
        } else {
            //Segunda forma de resolver o exercício.
        switch(letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U": System.out.println("Vogal"); break;
            default: System.out.println("Consoante");
        }
        }

    }
}
