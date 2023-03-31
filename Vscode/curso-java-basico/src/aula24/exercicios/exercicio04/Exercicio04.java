package aula24.exercicios.exercicio04;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        conta.numero = 123456;
        conta.agencia = "1234";
        conta.saldo = 800;
        conta.status = "ativo";
        conta.especial = true;
        conta.limite = 1000;

        System.out.println("Saldo da conta "  + conta.numero + " = "  + conta.saldo);
    }
}
