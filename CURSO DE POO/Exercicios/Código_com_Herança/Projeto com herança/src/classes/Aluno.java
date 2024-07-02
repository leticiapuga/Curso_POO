package classes;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    // MÉTODO CONSTRUTOR
    public Aluno(){

    }

    public void cancelarMatricula(){
        System.out.println("A matrícula será cancelada!");
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int m){
        this.matricula = m;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String c){
        this.curso = c;
    }
}
