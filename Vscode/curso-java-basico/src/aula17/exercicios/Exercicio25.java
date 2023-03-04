package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça para N pessoas a sua idade, ao final o programa 
 * devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e 
 * maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a 
 * média calculada.
--------------------------------------------------------------------------------*/

public class Exercicio25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de pessoas na turma: ");
        int numeroPessoas = input.nextInt();

        int idade;
        int soma = 0;

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Informe a idade da pessoa " + (i + 1) + ": ");
            idade = input.nextInt();
            soma += idade;
        }

        double media = (soma / numeroPessoas);

        if (media > 0 && media <= 25) {
            System.out.println("Turma Jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("Turma Adulta");
        } else if (media > 60) {
            System.out.println("Turma Idosa");
        }
    }

}
