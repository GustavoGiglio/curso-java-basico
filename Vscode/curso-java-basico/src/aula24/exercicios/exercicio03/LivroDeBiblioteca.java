package aula24.exercicios.exercicio03;

import java.util.Date;

/* ----------------------------------------------------------------------------------- 
 * Usando o	resultado do modelo	“Livro”	como base, crie	uma classe “LivroDeBiblioteca”	
 * que represente os dados básicos de um livro de uma biblioteca, que pode ser 
 * emprestado a leitores.
-----------------------------------------------------------------------------------*/

public class LivroDeBiblioteca {

    int codigo;
    String nome;
    String idioma;
    String editora;
    int isbn;
    String autor;
    int numeroPaginas;
    int edicao;
    String thema;

    boolean emprestado;
    Date dataEntrega;
    String emprestadoA;
}
