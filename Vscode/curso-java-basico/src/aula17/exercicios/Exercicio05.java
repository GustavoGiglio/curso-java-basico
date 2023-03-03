package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Altere o programa anterior permitindo ao usuário informar as populações e as
 * taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
--------------------------------------------------------------------------------*/

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double populacaoA , populacaoB;
        double taxaCrescimentoA, taxaCrescimentoB;
        int cont = 0;
        boolean informacaoValida = false;
        
        do {
            System.out.println("Informe a quantidade da populção do país A: ");
            populacaoA = input.nextDouble();
            if(populacaoA > 0){
                informacaoValida = true;
            } else {
                System.out.println("Informe um valor maior que Zero.");
            }
        } while (!informacaoValida);
        
        informacaoValida = false;
        
        do {
            System.out.println("Informe a taxa de crescimento do país A: ");
            taxaCrescimentoA = input.nextDouble();
            if (taxaCrescimentoA > 0 ){
                informacaoValida =true;
            } else {
                System.out.println("Informe uma taxa maior que Zero.");
            }
        } while (!informacaoValida);
        
        informacaoValida = false;

        do {
            System.out.println("Informe a quantidade da populção do país B: ");
            populacaoB = input.nextDouble();
            if(populacaoB > 0){
                informacaoValida = true;
            } else {
                System.out.println("Informe um valor maior que Zero.");
            } 
        } while (!informacaoValida);
        
        informacaoValida = false;
        
        do {
            System.out.println("Informe a taxa de crescimento do país B: ");
            taxaCrescimentoB = input.nextDouble();
            if (taxaCrescimentoB > 0 ){
                informacaoValida =true;
            } else {
                System.out.println("Informe uma taxa maior que Zero.");
            }
        } while (!informacaoValida);

        while (populacaoA <= populacaoB) {

            populacaoA += (populacaoA / 100) * taxaCrescimentoA;
            populacaoB += (populacaoB / 100) * taxaCrescimentoB;
            cont++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Anos: " + cont);
    }
}