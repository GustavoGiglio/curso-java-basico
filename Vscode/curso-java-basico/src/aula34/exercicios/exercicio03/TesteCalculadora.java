package aula34.exercicios.exercicio03;

public class TesteCalculadora {
    public static void main(String[] args) {

        imprimirTela(Calculadora.somar(10, 10));
        imprimirTela(Calculadora.subtrair(10, 10));
        imprimirTela(Calculadora.multiplicar(10, 10));
        imprimirTela(Calculadora.dividir(10, 10));
        imprimirTela2(Calculadora.potencia(10, 3));
        imprimirTela(Calculadora.fatorial(5));
    }

    public static void imprimirTela(int num) {
        System.out.println(num);
    }
    
    public static void imprimirTela2(double num) {
        System.out.println(num);
    }
}

