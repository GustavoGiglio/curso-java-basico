package aula20.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a 
 * captura imprima a matriz criada e encontre a quantidade de números pares, a 
 * quantidade de números ímpares.
--------------------------------------------------------------------------------*/

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Informe um valor da pos[" + i + "," + j + "]");
                numeros[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        
        int qndPares = 0;
        int qndImpares = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if(numeros[i][j] % 2 == 0){
                    qndPares++;
                } else {
                    qndImpares++;
                }
            }
        }

        System.out.println("Quantidade numeros pares: " + qndPares);
        System.out.println("Quantidade numeros impares: " + qndImpares);
    }
}
