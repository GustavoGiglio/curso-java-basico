package aula29;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca  = "Fiat";
        van.modelo = "Ducato";
        //van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.numeroPassageiros);

        Carro van2 = new Carro("fiat", "ducato",10,100,0.2);
        System.out.println(van2.marca);
        System.out.println(van2.marca);
        System.out.println(van2.numeroPassageiros);
        System.out.println(van2.capacidadeCombustivel);
        System.out.println(van2.consumoCombustivel);
    }
}