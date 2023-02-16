package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa para cálculo de uma folha de pagamento, sabendo que os 
 * descontos são do imposto de Renda, que depende do salário bruto (Conforme
 * tabela abaixo) e 3% para o Sindicado e que o FGTS corresponde a 11% do Salário
 * Bruto, mas não descontado (é a empresa que deposita). O salário Líquido 
 * corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao
 * usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
 * -Desconto do IR;
 * -Salário Bruto até 900(inclusive) - isento
 * -Salário Bruto até 1500(inclusive) - desconto de 5%
 * -Salário Bruto até 2500(inclusive) - desconto de 10%
 * -Salário Bruto acima de 2500 - desconto de 20%
 * Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo
 * o valor da hora é 5 e a quantidade de hora é 220.
 * 
 *  Salário Bruto: (5 * 220)            : R$ 1100,00
 * (-) IR (5%)                          : R$   55,00
 * (-) INSS (10%)                       : R$  110,00
 * FGTS (11%)                           : R$  121,00
 * Total de descontos                   : R$  165,00
 * Salário Liquido                      : R$  935,00
--------------------------------------------------------------------------------*/

public class Exercicio12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("informe o valor/hora: ");
        double valorHora = input.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhada = input.nextDouble();

        double salarioBruto = valorHora * horasTrabalhada;
        int percentualIR = 0;

        if(salarioBruto <= 900){
            percentualIR = 0;
        } else if(salarioBruto > 900 && salarioBruto <= 1500){
            percentualIR = 5;
        } else if(salarioBruto > 1500 && salarioBruto <= 2500){
            percentualIR = 10;
        } else if(salarioBruto > 2500){
            percentualIR = 20;
        }

        double descontoImpostoRenda = (salarioBruto / 100) * percentualIR;
        double descontoINSS = (salarioBruto / 100) * 10;
        double descontoFGTS = (salarioBruto / 100) * 11;
        double totalDescontos = descontoImpostoRenda + descontoINSS;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + valorHora + " * " + horasTrabalhada + ") : R$" + salarioBruto);
        System.out.println("(-) IR ("+ percentualIR+"%) : R$" + descontoImpostoRenda);
        System.out.println("(-) INSS (10%) : R$" + descontoINSS);
        System.out.println("FGTS (11%) : R$" + descontoFGTS);
        System.out.println("Total de descontos : R$" + totalDescontos);
        System.out.println("Salário Líquido : R$" + salarioLiquido);


    }
}
