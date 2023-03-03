package aula17.exercicios;

import java.util.Scanner;

/*--------------------------------------------------------------------------------
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
 * igual ao nome de usuário, mostrando uma mensagem de erro e voltando a pedir as 
 * informações.
--------------------------------------------------------------------------------*/

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean informacaoValida = false;
        String usuario;
        String senha;
        
        do{
            System.out.println("Informe o nome de usuário: "); 
            usuario = input.next();
            
            System.out.println("Informe sua senha: "); 
            senha = input.next();
    
            if(usuario.equalsIgnoreCase(senha)){
                informacaoValida = false;
                System.out.println("A senha não pode ser igual ao usuario, por favor informe novamente.");
            } else {
                informacaoValida = true;
                System.out.println("Valores válidos!");
            }
        } while (!informacaoValida);
        
    }
}
