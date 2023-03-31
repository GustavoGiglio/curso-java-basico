package aula27.exercicios.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = input.next();
        
        System.out.println("Informe o nome do curso: ");
        aluno.nomeCurso = input.next();

        System.out.println("Informe a matricula: ");
        aluno.matricula = input.nextInt();

        aluno.discimplinas = new String[3];
        for(int i = 0; i < aluno.discimplinas.length; i++){
            System.out.println("Informe o nome da disciplina " + (i+1) + "º :");
            aluno.discimplinas[i] = input.next();
        }
        
        for(int i = 0; i < aluno.notas.length; i++ ){
            System.out.println("Obtendo notas da disciplina " + aluno.discimplinas[i]);
            for(int j =0; j < aluno.notas[i].length; j++){
                System.out.println("Informe a nota " + (j+1) + "º: ");
                aluno.notas[i][j] = input.nextDouble();
            }
        }
        
        aluno.mostrarInfo();

        for(int i =0; i < aluno.discimplinas.length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.discimplinas[i] + " foi APROVADO");
            } else {
                System.out.println("Disciplina " + aluno.discimplinas[i] + " foi REPROVADO");
            }
        }
    }
}
