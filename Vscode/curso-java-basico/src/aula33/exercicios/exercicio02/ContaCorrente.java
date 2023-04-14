package aula33.exercicios.exercicio02;

public class ContaCorrente {
    
    private String numero;
    private String agencia;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;
    private double valorEspecialUsado;

    
    //Construtor
    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, double saldo, boolean especial, double limiteEspecial,
            double valorEspecialUsado) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
    }
    
    //Getter and Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    //Métodos
    public boolean realizarSaque(double quantiaASacar) {
        // tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else { // não tem saldo na conta
            if (especial) {
                // verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; // não é especial e não tem saldo suficiente
            }
        }
    }

    public void depositarDinheiro(double valorDepositado) {
        saldo += valorDepositado;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public boolean verficarChequeEspecial() {
        return saldo < 0;
    }
}
