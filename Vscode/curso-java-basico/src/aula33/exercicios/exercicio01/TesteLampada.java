package aula33.exercicios.exercicio01;

public class TesteLampada {
    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();
        
        lampada.mudarEstado();
        
        lampada.mostrarEstado();
        
        lampada.mudarEstado();

        lampada.mostrarEstado();
    }
}
