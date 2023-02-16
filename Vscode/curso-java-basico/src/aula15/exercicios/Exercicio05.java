package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa para leitura de duas notas parciais de um aluno. O programa
 * deve calcular a média alcançada por aluno e apresentar:
 *  A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 *  A mensagem "Reprovado", se a média for menor do que sete;
 *  A mensagem "Aprovado com Distinção", se a média for igual a dez.
--------------------------------------------------------------------------------*/

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = Input.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        double nota2 = Input.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        if(media == 10){
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
