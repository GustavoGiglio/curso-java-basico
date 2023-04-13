package aula32;

public class Carro {
    
    private String marca;
    private String modelo;
    private int numeroPassageiros;
    private double capacidadeCombustivel;
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

    //Método privado para auxiliar a calcular o combustivel
    private double divideKmPorConsumoCombustivel(double km){
        return km / this.consumoCombustivel;
    }

    // metodo com parâmetro
    public double calculaCombustivel(double km) {
        return this.divideKmPorConsumoCombustivel(km);
    }

    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }
}
