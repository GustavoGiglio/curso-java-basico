package aula20.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa para jogar o jogo da velha. O programa deve permitir que dois 
 * jogadores façam uma partida do jogo da velha, usando o computador para ver o 
 * tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja 
 * colocar a sua peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e 
 * determinar automaticamente quando o jogo terminou e quem foi o vencedor(jogador1 
 * ou jogador2). A cada nova jogada, o programa deve atualizar a situação do 
 * tabuleiro na tela
--------------------------------------------------------------------------------*/

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 1 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        // Enquanto ninguem ganhar faça:
        while (!ganhou) {

            // Define a vez de quem vai jogar na rodada
            if (jogada % 2 == 1) { // jogador 1
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'O';
            }

            // Valida escolha linha
            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Entre com a linha (1,2 ou 3)");
                linha = input.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente!");
                }
            }

            // valida escolha coluna
            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com a coluna (1,2 ou 3)");
                coluna = input.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente!");
                }
            }

            // Verifica se a posição já foi escolhida
            linha--;
            coluna--;
            if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
                System.out.println("Posição já usada, tente novamente!");
            } else { // jogada válida
                tabuleiro[linha][coluna] = sinal;
                jogada++;
            }

            // imprime tabuleiro
            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
                System.out.println();
            }

            //verifica se tem ganhador
            if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') ||     //linha 1
                    (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') || //linha 2
                    (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') || //linha 3
                    (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') || //coluna 1
                    (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') || //coluna 2
                    (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') || //coluna 3
                    (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') || //diagonal
                    (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')){  //diagonal inversa
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') ||     //linha 1
                    (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') || //linha 2
                    (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') || //linha 3
                    (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') || //coluna 1
                    (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') || //coluna 2
                    (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') || //coluna 3
                    (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') || //diagonal
                    (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')){  //diagonal inversa
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            } else if (jogada > 9){
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida.");
            }

        }

    }
}
