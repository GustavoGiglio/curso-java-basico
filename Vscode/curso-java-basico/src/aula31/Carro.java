package aula31;

public class Carro {
    
    public String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    private double consumoCombustivel;

    
    // metodo simples
    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capacidadeCombustivel * this.consumoCombustivel + " Km");
    }

    // metodo com retorno
    public double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return this.capacidadeCombustivel * this.consumoCombustivel;
    }

    private double divideKmPorConsumoCombustivel(double km){
        return km / this.consumoCombustivel;
    }

    // metodo com parâmetro
    public double calculaCombustivel(double km) {
        return this.divideKmPorConsumoCombustivel(km);
    }
}
