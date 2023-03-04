package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * O departamento Estadual de Meteorologia lhe contratou para desenvolver um 
 * programa que leia um conjunto indeterminado de temperaturas, e informe ao 
 * final a menor e a maior temperaturas informadas, bem como a média das 
 * temperaturas.
--------------------------------------------------------------------------------*/

public class Exercicio31 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de temperaturas:");
        int qntTemperaturas = input.nextInt();

        double temperatura;
        double soma = 0;
        double menor = Double.MAX_VALUE; // o menor vai receber o maior valor possível
        double maior = Double.MIN_VALUE; // o maior vai receber o menor valor possível

        for(int i = 1; i <= qntTemperaturas; i++){
            System.out.println("Informe a temperatura " + i + ":");
            temperatura = input.nextDouble();
            
            soma += temperatura;

            if(temperatura > maior){
                maior = temperatura;
            }

            if(temperatura < menor){
                menor = temperatura;
            }
        }
        System.out.println("Média: " + (soma/qntTemperaturas));
        System.out.println("Menor Temperatura: " + menor);
        System.out.println("Maior Temperatura: " + maior);
    }
}
