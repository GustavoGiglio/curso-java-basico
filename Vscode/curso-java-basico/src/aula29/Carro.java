package aula29;

public class Carro {
    
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    Carro(){
        System.out.println("Classe Carro foi instanciada");
        numeroPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numeroPassageiros_, double capacidadeCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numeroPassageiros = numeroPassageiros_;
        capacidadeCombustivel = capacidadeCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

    
}
