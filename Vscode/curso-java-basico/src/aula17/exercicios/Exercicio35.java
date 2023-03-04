package aula17.exercicios;
/*--------------------------------------------------------------------------------
 * Um funcionário de uma empresa recebe aumento salarial anualmente:
 * sabe-se que:
 *    A)Esse funcionário foi contratado em 1995, com salário inicial de R$1.00,00;
 *    B)Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
 *    C)A partir de 1997 (inclusive), os aumentos salárias sempre correspondem ao
 *     dobro do percentual do ano anterior. Faça um programa que determine o 
 *     salário atual desse funcionário. Após concluir isto, altere o programa
 *     permitindo que o usuário digite o salário inicial do funcionário.
--------------------------------------------------------------------------------*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double percentual = 1.5;
        double salario = 1000;
        salario += (salario / 100) * percentual;

        DecimalFormat format = new DecimalFormat("###,###.##");
        
        for (int i = 1997; i <= 2023; i++) {
            percentual *= 2;
            salario += (salario / 100) * percentual;
            System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
        }

    }

}
