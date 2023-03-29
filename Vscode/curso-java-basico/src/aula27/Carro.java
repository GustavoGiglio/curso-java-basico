package aula27;

public class Carro {
   
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    // metodo simples
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + " Km");
    }

    // metodo com retorno
    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capacidadeCombustivel * consumoCombustivel;
    }

    // metodo com parâmetro
    double calculaCombustivel(double km) {
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
