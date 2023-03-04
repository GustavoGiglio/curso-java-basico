package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Desenvolva um programa que faça uma tabuada de um número qualquer inteiro que 
 * será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em
 * 1 e terminar em 10, o valor inicial e final devem ser informados também pelo 
 * usuário, conforme exemplo abaixo:
 *      Monta a tabuada de: 5
 *      Começar por: 4
 *      Terminar em: 7
 * 
 *      vou montar a tabuada de 5 começando em 4 e terminando em 7:
 *      5 x 4 = 20
 *      5 x 5 = 25
 *      5 x 6 = 30
 *      5 x 7 = 35
 * OBS: Você deve verificar se o usuário não digitou o final menor que o inicial.
--------------------------------------------------------------------------------*/

public class Exercicio33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe qual tabuada deseja criar: ");
        int numeroTabuada = input.nextInt();

        boolean invalido = true;
        int valorInicial, valorFinal;

        do {
            System.out.println("informe Valor Inicial: ");
            valorInicial = input.nextInt();

            System.out.println("informe Valor Final: ");
            valorFinal = input.nextInt();

            if (valorFinal > valorInicial) {
                invalido = false;
            }

        } while (invalido);

        System.out.println("Monta a tabuada de: " + numeroTabuada);
        System.out.println("Começar por: " + valorInicial);
        System.out.println("Terminar em: " + valorFinal);
        System.out.println("vou montar a tabuada de " + numeroTabuada + " começando em " + valorInicial +" e terminando em " + valorFinal + ":");
        System.out.println();

        for(int i = valorInicial; i <= valorFinal; i++){
            System.out.println(numeroTabuada + " X " + i + " = " + (numeroTabuada * i));
        }

    }
}