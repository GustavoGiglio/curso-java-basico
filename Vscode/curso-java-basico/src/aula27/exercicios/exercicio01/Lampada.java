package aula27.exercicios.exercicio01;

/*-----------------------------------------------------------------------------------------------------
 * Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	para ligar,	desligar a lampada
-----------------------------------------------------------------------------------------------------*/
public class Lampada {
    
    String marca;
    String tipoLuz;
    String caracteristicas;
    String potencia;

    boolean ligada;

    void ligar(){
        ligada =true;
    }
    
    void desligar(){
        ligada = false;
    }
    
    void mostrarEstado(){
        if(ligada){
            System.out.println("Lâmpada está ligada!");
        } else {
            System.out.println("Lâmpada está desligada!");
        }
    }

    void mudarEstado(){
        if(ligada){
            desligar();
        } else {
            ligar();
        }
    }

}
