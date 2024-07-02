package classes;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do(a) aluno(a): " + this.getNome());
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int mat){
        this.matricula = mat;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String cur){
        this.curso = cur;
    }
}
