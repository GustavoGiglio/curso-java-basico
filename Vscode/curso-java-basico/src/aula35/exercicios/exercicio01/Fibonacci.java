package aula35.exercicios.exercicio01;

public class Fibonacci {
    
    public static int calcFibonacci(int num){
        
        if(num < 2){
            return 1;
        }
        return calcFibonacci(num-1) + calcFibonacci(num-2);
    }
}
