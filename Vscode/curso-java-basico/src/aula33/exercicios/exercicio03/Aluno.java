package aula33.exercicios.exercicio03;

public class Aluno {
    
    private String nome;
    private int matricula;
    private String nomeCurso;
    private String[] disciplinas;
    private double[][] notas;
    private boolean aprovado;

    
    //Construtor
    public Aluno() {
        disciplinas = new String[3];
        notas = new double[3][4];
    }

    public Aluno(String nome, int matricula, String nomeCurso, String[] discimplinas, double[][] notas,
            boolean aprovado) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.disciplinas = new String[3];
        this.notas = new double[3][4];
        this.aprovado = aprovado;
    }


    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] discimplinas) {
        this.disciplinas = discimplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    //Métodos
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < disciplinas.length; i++) {
            System.out.print("Notas da disciplina " + disciplinas[i] + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice){
        if(obterMedia(indice) >= 7){
            return true;
        } else {
            return false;
        }
    }

    private double obterMedia(int indice){
        
        double soma = 0;
        
        for(int i=0; i < notas[indice].length; i++){
            soma += notas[indice][i];
        }

        double media = soma/4;
        return media;
    }

    public void setDisciplinaPos(int pos, String disciplina){
        this.disciplinas[pos] = disciplina;
    }

    public void setNotaPosIJ(int posI, int posj, double nota){
        this.notas[posI][posj] = nota;
    }

}
