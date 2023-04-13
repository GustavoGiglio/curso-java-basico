package aula30;

public class Carro {

    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel,
            double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {
    }

    // metodo simples
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capacidadeCombustivel * this.consumoCombustivel + " Km");
    }

    // metodo com retorno
    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return this.capacidadeCombustivel * this.consumoCombustivel;
    }

    // metodo com parâmetro
    double calculaCombustivel(double km) {
        double qtdCombustivel = km / this.consumoCombustivel;
        return qtdCombustivel;
    }
}
