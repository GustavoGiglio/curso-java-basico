package aula34.exercicios.exercicio02;

public class TesteCalculadora {

    public static void main(String[] args) {

        imprimirTela(Calculadora.somar(10, 10));
        imprimirTela(Calculadora.subtrair(10, 10));
        imprimirTela(Calculadora.multiplicar(10, 10));
        imprimirTela(Calculadora.dividir(10, 10));
        imprimirTela(Calculadora.potencia(10, 2));
    }

    public static void imprimirTela(double num) {
        System.out.println(num);
    }
}
