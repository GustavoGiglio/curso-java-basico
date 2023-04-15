package aula36.exercicios.exercicio02;

public class Professor {

    private String nome;
    private String departamento;
    private String email;

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Métodos
    public String obterinfo(){
        return "Professor = " + nome + "\n Departamento = " + departamento + "\n E-mail = " + email;
    }

}
