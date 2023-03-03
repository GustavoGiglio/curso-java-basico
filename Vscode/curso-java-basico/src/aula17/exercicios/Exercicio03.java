package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que leia e valide as seguintes informações:
 * a. Nome: maior que 3 caracteres;
 * b. Idade: entre 0 e 150;
 * c. Salário: maior que zero;
 * d. Sexo: 'f' ou 'm';
 * e. Estado Civil: 's','c','v','d'.
--------------------------------------------------------------------------------*/

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean informacaoValida = false;
        
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        //verifica se nome está válido
        do{
            System.out.println("Informe seu nome: ");
            nome = input.next();
            if(nome.length() > 3){
                informacaoValida = true;
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }

        } while(!informacaoValida);

        informacaoValida = false;
        
        //verifica se idade está válido
        do {
            System.out.println("Informe sua idade: ");
            idade = input.nextInt();
            if(idade > 0 && idade <= 150){
                informacaoValida = true;
            } else {
                System.out.println("Idade precisa estar entre 0-150.");
            }
        } while (!informacaoValida);
        
        informacaoValida = false;
        
        //verifica se sálario está válido
        do {
            System.out.println("Informe seu salário: ");
            salario = input.nextDouble();
            if(salario > 0){
                informacaoValida = true;
            } else {
                System.out.println("Salário tem que ser maior que Zero.");
            }
        } while (!informacaoValida);
        
        informacaoValida = false;
        
        //verifica se sexo está válido
        do {
            System.out.println("Informe seu sexo (F)femenino ou (M)masculino: ");
            sexo = input.next();
            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                informacaoValida = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }
        } while (!informacaoValida);
        
        informacaoValida = false;
        
        //verifica se estado civil está válido
        do {
            System.out.println("Informe seu estado civil (S)solteiro, (c)casado, (v)viúvo, (d)divorciado: ");
            estadoCivil = input.next();
            if(estadoCivil.equalsIgnoreCase("s") || 
                estadoCivil.equalsIgnoreCase("c") || 
                estadoCivil.equalsIgnoreCase("v") || 
                estadoCivil.equalsIgnoreCase("d")){
                    informacaoValida = true;
            } else {
                System.out.println("Estado Civil precisa ser prenchido com 's','c','v','d'. ");
            }
        } while (!informacaoValida);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}
