package aula36.exercicios.exercicio01;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Métodos
    public String obterInfo(){
        return "Nome = " + nome + " Telefone = "+ telefone + " E-mail = " + email;
    }
}
