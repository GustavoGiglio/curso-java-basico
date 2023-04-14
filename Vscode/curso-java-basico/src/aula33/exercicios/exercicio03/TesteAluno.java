package aula33.exercicios.exercicio03;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno.setNome(input.next());

        System.out.println("Informe o nome do curso: ");
        aluno.setNomeCurso(input.next());

        System.out.println("Informe a matricula: ");
        aluno.setMatricula(input.nextInt());

        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            System.out.println("Informe o nome da disciplina " + (i + 1) + "º :");
            aluno.setDisciplinaPos(i,input.next());
        }

        for (int i = 0; i < aluno.getNotas().length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.getDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotas()[i].length; j++) {
                System.out.println("Informe a nota " + (j + 1) + "º: ");
                aluno.setNotaPosIJ(i, j, input.nextDouble());
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " foi APROVADO");
            } else {
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " foi REPROVADO");
            }
        }
    }
}
