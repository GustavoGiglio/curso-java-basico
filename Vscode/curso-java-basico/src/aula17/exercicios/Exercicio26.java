package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Numa eleição existem três candidatos. Faça um programa que peça o número total
 * de eleitores. Peça para cada eleitor votar e ao final mostrar o número de votos
 * de cada candidato.
--------------------------------------------------------------------------------*/

public class Exercicio26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de eleitores: ");
        int qntEleitores = input.nextInt();

        int voto;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int invalidos = 0;

        for (int i = 1; i <= qntEleitores; i++) {
            System.out.println(i + "º eleitor | vote [1][2][3]: "); 
            voto = input.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                default:
                    invalidos++;
                    System.out.println("Valor inválido");
            }
        }
        System.out.println("Resultado: ");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Votos Inválidos: " + invalidos);
    }
}