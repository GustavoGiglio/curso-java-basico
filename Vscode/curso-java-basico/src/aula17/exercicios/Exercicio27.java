package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que calcule o número médio de alunos por turma. Para isto,
 * peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas
 * não podem ter mais de 40 alunos.
--------------------------------------------------------------------------------*/

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de turmas: ");
        int qntTurmas = input.nextInt();
        int qntAlunos;

        int soma = 0;
        boolean invalido = true;

        for (int i = 1; i <= qntTurmas; i++) {

            invalido = true;

            do {
                System.out.println("Informe a quantidade de alunos da turma " + i + ":");
                qntAlunos = input.nextInt();

                if (qntAlunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("Númeor de alunos inválidos! Digite novamente");
                }

            } while (invalido);

            soma += qntAlunos;
        }

        double media = (soma / qntTurmas);

        System.out.println("Média: " + media);
    }
}