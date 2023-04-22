package aula39.teste;

import aula39.Pessoa;

public class Aluno extends Pessoa {

    private String curso;
    private String[] notas;

    public void verificarAcesso(){
        this.nomeVisibilidade = "sdeadada";
        super.nomeVisibilidade = "sdadad";
    }

    // construtor
    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }


    // Getters and Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getNotas() {
        return notas;
    }

    public void setNotas(String[] notas) {
        this.notas = notas;
    }

    // Metodos
    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

}
