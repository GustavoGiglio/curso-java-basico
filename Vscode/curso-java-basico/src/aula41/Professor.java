package aula41;

public class Professor extends Pessoa {

    private String departamento;
    private String nomeCurso;
    private double salario;

    // Getters and Setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Métodos
    public double calcularSalarioLiquido(){
        return 0;
        
    }

    //Métodos
    public String obterEtiquetaEndereco(){
        String s = "Endereço do Professor: ";
        s += super.getEndereco();
        return s;
    }

    public void imprimirEtiquetaEndereco(){
        
        System.out.println("Imprimindo endereço professor");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
