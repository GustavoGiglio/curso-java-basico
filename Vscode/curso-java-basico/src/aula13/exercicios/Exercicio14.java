package aula13.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a 
 * velocidade de um link de internet (em Mbps), calcule e informe o tempo 
 * aproximado de download do arquivo usando este link (em minutos).
 --------------------------------------------------------------------------------*/

public class Exercicio14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo para download(Mb): ");
        double tamanhoArquivo = input.nextDouble();
        
        System.out.println("Informe a velocidade da internet: ");
        double velocidadeInternet = input.nextDouble();

        double tempoDownload = (tamanhoArquivo / velocidadeInternet);
        System.out.println("O tempo de download do arquivo usando este link é : " + tempoDownload + " min");
    }
    
}
