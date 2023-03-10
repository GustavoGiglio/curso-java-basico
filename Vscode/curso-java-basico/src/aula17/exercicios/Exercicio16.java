package aula17.exercicios;

/*--------------------------------------------------------------------------------
 * A série de Fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,34,55,...
 * Faça um programa que gera a série até que o valor seja maior que 500.
--------------------------------------------------------------------------------*/
public class Exercicio16 {
    public static void main(String[] args) {

        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        System.out.println(primeiro);
        System.out.println(segundo);

        while (proximo <= 500){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
            System.out.println(proximo);
        }
        
    }
}
