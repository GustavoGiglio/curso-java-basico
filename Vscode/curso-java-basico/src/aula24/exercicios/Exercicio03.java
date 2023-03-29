package aula24.exercicios;

import java.util.Date;

public class Exercicio03 {

    public static void main(String[] args) {

        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.codigo = 2131412;
        livro.nome = "A Droga da obediência";
        livro.idioma = "pt-br";
        livro.editora = "gente";
        livro.isbn = 32121412;
        livro.autor = "Pedro Bandeira";
        livro.numeroPaginas = 192;
        livro.edicao = 4;
        livro.thema = "Aventura";

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Gustavo";
    }
}
