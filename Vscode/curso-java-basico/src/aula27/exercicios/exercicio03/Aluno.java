package aula27.exercicios.exercicio03;

/* ------------------------------------------------------------------------------------------------------
 * Escreva uma class para representar um Aluno.	Adicione atributos relacionados	às caracteristicas de um
 * Aluno, como nome, matricula,	curso que está matriculado, nome de	3 disciplinas que está cursando e as
 * notas dessas 3 disciplinas. Desenvolva um método	para verificar se o	aluno está aprovado	(nota maior	ou	
 * igual a 7) em uma determinada disciplina. Escreva um	programa para testar essa classe, que pede as 
 * informações do aluno	ao usuário e ao	final informa o	nome das disciplinas, mostra as notas e	mostra se	
 * o aluno foi aprovado	ou não.
--------------------------------------------------------------------------------------------------------*/
public class Aluno {

    String nome;
    int matricula;
    String nomeCurso;
    String[] discimplinas = new String[3];
    double[][] notas = new double[3][4];
    boolean aprovado;

    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < discimplinas.length; i++) {
            System.out.print("Notas da disciplina " + discimplinas[i] + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice){
        if(obterMedia(indice) >= 7){
            return true;
        } else {
            return false;
        }
    }

    double obterMedia(int indice){
        
        double soma = 0;
        
        for(int i=0; i < notas[indice].length; i++){
            soma += notas[indice][i];
        }

        double media = soma/4;
        return media;
    }

}
