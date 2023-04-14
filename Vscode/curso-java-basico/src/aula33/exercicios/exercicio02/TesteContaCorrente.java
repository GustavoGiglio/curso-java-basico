package aula33.exercicios.exercicio02;

public class TesteContaCorrente {
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(100);

        System.out.println("Saldo da conta " + conta.getSaldo() + " = " + conta.getSaldo());

        boolean saqueEfetuado = conta.realizarSaque(500);

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta: " + conta.getSaldo());
        } else {
            System.out.println("Não foi possivel realizar o saque");
        }

        conta.depositarDinheiro(1000);
        System.out.println("Novo saldo: " + conta.getSaldo());

        conta.consultarSaldo();
        conta.realizarSaque(600);
        
        if(conta.verficarChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

    }   
}
