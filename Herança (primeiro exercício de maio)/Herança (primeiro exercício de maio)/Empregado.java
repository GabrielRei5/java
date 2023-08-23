public class Empregado extends Pessoa{
    double salario;
    String matricula;
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }
    public String getMatricula() {
        return matricula;
    }
    
}
