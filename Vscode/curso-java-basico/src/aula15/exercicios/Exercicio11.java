package aula15.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * As organizações Tabajara resolveram dar um aumento de salário aos seus 
 * colaboradores e lhe contrataram para desenvolver o programa que calculará os
 * reajustes.
 *  -Faça um programa que recebe o salário de um colaborador e o aumento segundo
 *   o seguinte critério, baseado no salário atual:
 *      Salários até R$280,00(incluindo): aumento de 20%
 *      Salários entre R$280,00 e R$700,00 : aumento de 15%
 *      Salários entre R$700,00 e R$1500,00 : aumento de 10% 
 *      Salarios de R$1500,00 em diante : aumento de 5% 
 *  -Após o aumento ser realizado, informe na tela:
 *    O salário antes do aumento;
 *    O percentual de aumento aplicado;
 *    O valor do aumento;
 *    O novo salário, após o aumento
--------------------------------------------------------------------------------*/

public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("informe o salário do colaborador: ");
        double salario = input.nextDouble();
        int percentual = 0;
        double aumento;
        double novoSalario;

        if(salario <= 280){
            percentual = 20;
        } else if(salario > 280 && salario < 700){
            percentual = 15;
        } else if(salario >= 700 && salario < 1500){
            percentual = 10;
        } else if(salario >= 1500){
            percentual = 5;
        }

        aumento = (salario / 100) * percentual;
        novoSalario = salario + aumento;

        System.out.println("Salario Antes: R$" + salario);
        System.out.println("Porcentual aumentado: " + percentual + "%");
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Novo Salário: R$" + novoSalario);
    }
}