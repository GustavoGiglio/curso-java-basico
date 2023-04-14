package aula33.exercicios.exercicio01;

public class Lampada {

    private String marca;
    private String tipoLuz;
    private String caracteristicas;
    private String potencia;
    private boolean ligada;

    // Construtor
    public Lampada(String marca, String tipoLuz, String caracteristicas, String potencia, boolean ligada) {
        this.marca = marca;
        this.tipoLuz = tipoLuz;
        this.caracteristicas = caracteristicas;
        this.potencia = potencia;
        this.ligada = ligada;
    }

    public Lampada() {
    }

    // Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    // Métodos
    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("Lâmpada está ligada!");
        } else {
            System.out.println("Lâmpada está desligada!");
        }
    }

    public void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }

}
