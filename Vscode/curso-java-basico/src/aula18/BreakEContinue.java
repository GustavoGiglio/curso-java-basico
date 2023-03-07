package aula18;

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    /*   
        //Brak
        System.out.println("Informe um número: ");
        int num = input.nextInt();
          
        System.out.println("entre com um limite: ");
        int max = input.nextInt();
          
        for (int i = num; i <= max; i++) {
            System.out.println(i);
            if(i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }
        }
    */

    /* 
        //Break com rotulos - goto
        //Não é mais utilizado
        for (int i = 0; i <= 4; i++) {
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println(i);
        }
    */
        //contine
        System.out.println("Informe um número: ");
        int num = input.nextInt();
          
        System.out.println("entre com um limite: ");
        int max = input.nextInt();
          
        for (int i = num; i <= max; i++) {
            if(i % 7 == 0){
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}