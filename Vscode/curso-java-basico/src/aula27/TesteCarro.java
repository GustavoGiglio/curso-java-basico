package aula27;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca  = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        //metodo simples sem retorno
        van.exibirAutonomia();
        
        //metodo com retorno
        System.out.println("Autonomia do carro é: " + van.obterAutonomia());
        
        //metodo com retorno atribuido a uma variavel.
        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia do carro é: " + autonomia);

        //metodo com parâmetros 
        double qtdCombustivel10 = van.calculaCombustivel(10);
        double qtdCombustivel15 = van.calculaCombustivel(15);
        System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
        System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
    }
}
