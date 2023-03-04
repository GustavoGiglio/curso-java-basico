package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que calcule o valor total investido por um colecionador em sua
 * coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar
 * a quantidade de CDs e o valor para cada um
--------------------------------------------------------------------------------*/

public class Exercicio28 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de CDs:");
        int qntCDs = input.nextInt();
        double preco;
        double soma = 0;

        for(int i = 1; i <= qntCDs; i++){
            System.out.println("Informe o preço do CD " + i + ":");
            preco = input.nextDouble();
            soma += preco;
        }
        double media = (soma / qntCDs);

        System.out.println("Total Investido: R$" + soma);
        System.out.println("Média Gasto por CD: R$" + media);
    }

    
}
