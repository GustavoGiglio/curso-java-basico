package aula20.exercicios;
/*--------------------------------------------------------------------------------
 * Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. 
 * Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos 
 * associar um tarefa específica (compromisso agendado). O programa deve ter um menu 
 * onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida 
 * com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o 
 * dia e a hora para obter o compromisso armazenado.
--------------------------------------------------------------------------------*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //31dias 24horas
        String[][] compromisso = new String[31][24];

        boolean sair = false;
        byte opacao;

        
        while(!sair){
            System.out.println("Digite [1] para adicionar compromisso");
            System.out.println("Digite [2] para verificar compromisso");
            System.out.println("Digite [0] para sair");
            
            opacao = input.nextByte();
            
            if(opacao == 1){ //adicionar compromisso
                
                int dia = 0;
                boolean diaValido = false;
                while(!diaValido){
                    System.out.println("Entre com o dia do mês: ");
                    dia = input.nextInt();
                    if(dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente!");
                    }
                }

                int hora = 0;
                boolean horaValido = false;
                while(!horaValido){
                    System.out.println("Entre com a hora do compromisso: ");
                    hora = input.nextInt();
                    if(hora >= 0 && hora <= 24){
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválido, digite novamente!");
                    }
                }
                dia--;
                System.out.println("Digite o compromisso:");
                compromisso[dia][hora] = input.next();

            } else if(opacao == 2){ //verificar compromisso
                int dia = 0;
                boolean diaValido = false;
                while(!diaValido){
                    System.out.println("Entre com o dia do mês: ");
                    dia = input.nextInt();
                    if(dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente!");
                    }
                }

                int hora = 0;
                boolean horaValido = false;
                while(!horaValido){
                    System.out.println("Entre com a hora do compromisso: ");
                    hora = input.nextInt();
                    if(hora >= 0 && hora <= 24){
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválido, digite novamente!");
                    }
                }
                dia--;
                System.out.println("O compromisso agendado é:");
                System.out.println(compromisso[dia][hora]);

            } else if(opacao == 0){ //sair
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente!");
            }

        }
    }
}
