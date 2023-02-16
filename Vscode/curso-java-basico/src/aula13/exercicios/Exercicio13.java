package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que pergunte quanto você ganha por hora e o número de horas
 * trabalhadas no mês. Calcule e mostre e mostre o total do seu salário no 
 * referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
 * 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
 * . salário bruto.
 * a)Quanto pagou ao INSS.
 * b)Quanto pagou ao sindicato.
 * c)O salário líquido.
 * d)Calcule os descontos e o salário líquido, conforme a tabela abaixo:
 *      + Salário Bruto : R$ - IR (11%) : R$ - INNSS 
 *      (8%) : R$ - Sindicato ( 5%) : R$ = Salário 
 *      Liquido : R$
 *   obs: Salário Bruto - Descontos = Salário Líquido.
 --------------------------------------------------------------------------------*/

public class Exercicio13 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorHora = input.nextDouble();
        
        System.out.println("Número de horas trabalhadas no mês: ");
        double horas = input.nextDouble();

        double salarioBruto = horas * valorHora;
        double descontoINSS = (salarioBruto / 100) * 8;
        double descontoSindicato = (salarioBruto / 100) * 5;
        double descontoImpostoRenda = (salarioBruto / 100) * 11;
        double totalDescontos = descontoINSS + descontoSindicato + descontoImpostoRenda;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Valor pago ao INSS: " + descontoINSS);
        System.out.println("Valor pago ao Sindicato: " + descontoSindicato);
        System.out.println("Valor pago ao Imposto de Renda: " + descontoImpostoRenda);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}