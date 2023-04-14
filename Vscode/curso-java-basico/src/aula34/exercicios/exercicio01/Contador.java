package aula34.exercicios.exercicio01;

public class Contador {
    
    private static int cont;

    public static void zerar(){
        cont = 0;
    }

    public static void incrementarMaisUm(){
        cont++;
    }

    public static int retornaValor(){
        return cont;
    } 
}
