package aula34.exercicios.exercicio01;

public class TesteContador {


    static void imprimirValor(){
        System.out.println(Contador.retornaValor());
    }
    
    public static void main(String[] args) {
        
        imprimirValor();
        Contador.retornaValor();
        Contador.incrementarMaisUm();
        Contador.incrementarMaisUm();
        imprimirValor();
        Contador.zerar();
        imprimirValor();
        Contador.incrementarMaisUm();
        Contador.incrementarMaisUm();
        Contador.incrementarMaisUm();
        imprimirValor();
        
    }
}
