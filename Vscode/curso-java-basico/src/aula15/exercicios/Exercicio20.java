package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
 * As perguntas são:
 *  "Telefonou para a vítima?"
 *  "Esteve no local do crime?"
 *  "Mora perto da vítima?"
 *  "Devia para a vítima?"
 *  "Já trabalhou com a vítima?"
 * O programa deve no final emitir uma classificação sobre a participação da 
 * pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser
 * classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
 * Caso contrário, ele será classificado como "Inocente".
 --------------------------------------------------------------------------------*/

public class Exercicio20 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? [S] ou [N]:");
        String resposta1 = input.next();

        System.out.println("Esteve no local do crime? [S] ou [N]:");
        String resposta2 = input.next();

        System.out.println("Mora perto da vítima? [S] ou [N]:");
        String resposta3 = input.next();

        System.out.println("Devia para a vítima? [S] ou [N]:");
        String resposta4 = input.next();

        System.out.println("Já trabalhou com a vítima? [S] ou [N]:");
        String resposta5 = input.next();

        int contador =0;
        if(resposta1.equalsIgnoreCase("s")){
            contador++;
        }
        
        if(resposta2.equalsIgnoreCase("s")){
            contador++;
        }
        
        if(resposta3.equalsIgnoreCase("s")){
            contador++;
        }
        
        if(resposta4.equalsIgnoreCase("s")){
            contador++;
        }
        
        if(resposta5.equalsIgnoreCase("s")){
            contador++;
        }
        
        if(contador == 5){
            System.out.println("Assassino!");
        } else if(contador == 3 || contador == 4){
            System.out.println("Cúmplice!");
        } else if(contador == 2){
            System.out.println("Suspeito!");
        } else if(contador == 1 || contador == 0){
            System.out.println("Inocente!");
        }
    }
}