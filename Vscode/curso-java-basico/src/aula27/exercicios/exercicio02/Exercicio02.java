package aula27.exercicios.exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "31231";
        conta.agencia = "321";
        conta.especial = true;
        conta.limiteEspecial = 2000;
        conta.saldo = 50;
        conta.valorEspecialUsado = 0;


        boolean saqueEfetuado = conta.realizarSaque(500);
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta: " + conta.saldo);
        } else {
            System.out.println("Não fou possivel realizar o saque");
        }

        conta.depositarDinheiro(1000);
        System.out.println("Novo saldo: " + conta.saldo);

        conta.consultarSaldo();
        conta.realizarSaque(600);
        
        if(conta.verficarChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

    }
}
