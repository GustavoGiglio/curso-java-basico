package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Uma academia deseja fazer um senso entre seus clientes para descobrir o mais
 * alto, o mais baixo, o mais gordo e o mais magro, para isto você deve fazer um
 * programa que pergunte a cada um dos clientes da academia seu código, sua altura
 * e seu peso. O final da digitação de dados deve ser dada quando o usuáriio 
 * digitar 0(zero) no campo código. Ao encerrar o programa também deve ser 
 * informados os códigos e valores do cliente mais alto, mais baixo, mais gordo e
 * do mais magro, além da méia das alturas e dos pesos dos clientes.
--------------------------------------------------------------------------------*/

public class Exercicio34 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("informe quantos clientes deseja informar os dadods: ");
        int numeroClientes = input.nextInt();

        double altura, peso;
        double somaAltura = 0;
        double somaPeso = 0;
        double maisAlto = Double.MIN_VALUE;
        double maisBaixo = Double.MAX_VALUE;
        double maisGordo = Double.MIN_VALUE;
        double maisMagro = Double.MAX_VALUE;

        boolean sair = false;
        String continuar;

        do{
            System.out.println("Deseja informar mais algum dado? [S] ou [N]: ");
            continuar = input.next();

            if(continuar.equalsIgnoreCase("s")){
                for (int i = 1; i <= numeroClientes; i++) {
        
                    System.out.println("Dados Cliente "+ i + ":");

                    System.out.println("Altura: ");
                    altura = input.nextDouble();
        
                    System.out.println("Peso: ");
                    peso = input.nextDouble();
        
                    somaAltura += altura;
                    somaPeso += peso;
        
                    if(altura > maisAlto){
                        maisAlto = altura;
                    }
        
                    if(altura < maisBaixo){
                        maisBaixo = altura;
                    }
        
                    if(peso > maisGordo){
                        maisGordo = peso;
                    }
                    
                    if(peso < maisMagro){
                        maisMagro = peso;
                    }
                }
            } else {
                sair = true;
            }

        } while(!sair);

        double mediaAltura = (somaAltura/numeroClientes);
        double mediaPeso = (somaPeso/numeroClientes);

        System.out.println("Média Altura: " + mediaAltura);
        System.out.println("Média Peso: " + mediaPeso);
        System.out.println("Maior altura: " + maisAlto);
        System.out.println("Menor altura: " + maisBaixo);
        System.out.println("Maior Peso: " + maisMagro);
        System.out.println("Menor Peso: " + maisGordo);
    }

}
