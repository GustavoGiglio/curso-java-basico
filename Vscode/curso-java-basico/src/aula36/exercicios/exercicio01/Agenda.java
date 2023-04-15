package aula36.exercicios.exercicio01;

public class Agenda {

    private String nome;
    private Contato[] contatos;

    // Construtores
    public Agenda() {
    }

    public Agenda(String nome) {
        this.nome = nome;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo(){
        String info = "Nome = " + nome + "\n";

        if(contatos != null){
            for(Contato c : contatos){
                info += c.obterInfo() + "\n";
            }
        }

        return info;
    }
}
