package aula20.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Modifique o programa anterior de maneira a guardar os compromissos de todo o 
 * ano, organizados por mês, dia e hora (só 8 horas por dia)
--------------------------------------------------------------------------------*/

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //31dias 24horas
        String[][][] compromisso = new String[12][31][8];

        boolean sair = false;
        byte opacao;

        
        while(!sair){
            System.out.println("Digite [1] para adicionar compromisso");
            System.out.println("Digite [2] para verificar compromisso");
            System.out.println("Digite [0] para sair");
            
            opacao = input.nextByte();
            
            if(opacao == 1){ //adicionar compromisso
                
                int mes = 0;
                boolean mesValido = false;
                while(!mesValido){
                    System.out.println("Entre com o mês: ");
                    mes = input.nextInt();
                    if(mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("mes inválido, digite novamente!");
                    }
                }

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
                    if(hora >= 0 && hora <= 8){
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválido, digite novamente!");
                    }
                }
                mes--;
                dia--;
                System.out.println("Digite o compromisso:");
                compromisso[mes][dia][hora] = input.next();

            } else if(opacao == 2){ //verificar compromisso
                
                int mes = 0;
                boolean mesValido = false;
                while(!mesValido){
                    System.out.println("Entre com o mês: ");
                    mes = input.nextInt();
                    if(mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("mes inválido, digite novamente!");
                    }
                }
                
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
                    if(hora >= 0 && hora <= 8){
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválido, digite novamente!");
                    }
                }
                mes--;
                dia--;
                System.out.println("O compromisso agendado é:");
                System.out.println(compromisso[mes][dia][hora]);

            } else if(opacao == 0){ //sair
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente!");
            }

        }
    }
}
