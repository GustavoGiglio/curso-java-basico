package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * O hipermecado Tabajara está com uma promoção de carnes que é imperdível. Confira:
 *                        até 5 kg          Acima de 5 kg
 *      File Duplo      R$ 4,90 por Kg      R$ 5,80 por Kg
 *      Alcatra         R$ 5,90 por Kg      R$ 6,80 por Kg
 *      Picanha         R$ 6,90 por Kg      R$ 7,80 por Kg
 * Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos 
 * de carne da promoção, porém não há limites para a quantidade de carne por 
 * cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um
 * desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo e a
 * quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as
 * informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento
 * valor do desconto e valor a pagar. 
 --------------------------------------------------------------------------------*/

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tipo de carne: ");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipo = input.nextInt();

        System.out.println("Informe a quantidade de carne(kg):");
        double qtd = input.nextDouble();

        double precoKg = 0;

        if (tipo == 1) {
            System.out.println(qtd + "Kg - File Duplo");
            if (qtd > 5) {
                precoKg = 5.8;
            } else {
                precoKg = 4.9;
            }
        } else if (tipo == 2) {
            System.out.println(qtd + "Kg - Alcatra");
            if (qtd > 5) {
                precoKg = 6.8;
            } else {
                precoKg = 5.9;
            }
        } else if (tipo == 3) {
            System.out.println(qtd + "Kg - Picanha");
            if (qtd > 5) {
                precoKg = 7.8;
            } else {
                precoKg = 6.9;
            }
        }
        double total = qtd * precoKg;
        System.out.println(qtd + "kg * " + precoKg + " = " + total);

        System.out.println("Compra no cartão? Digite [1]Sim [2]Não3:");
        int cartao = input.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);
        }
    }
}