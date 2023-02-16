package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que verifique se uma letra digita é "F" ou "M". Conforme a 
 * letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
--------------------------------------------------------------------------------*/

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe uma letra [F] ou [M]: ");
        String sexo = input.next();

        if(sexo.equalsIgnoreCase("f") ){
            System.out.println("F - Feminino");
        } else if (sexo.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido!");
        } 
    } 
}
