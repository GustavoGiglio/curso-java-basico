package aula35.exercicios.exercicio02;

public class Calculadora {
    
    public static int somatorio(int num){
        if(num ==1){
            return 1;
        }
        return num + somatorio(num-1);
    }
}
