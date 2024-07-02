package classes;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    // MÉTODO CONSTRUTOR
    public Professor(){

    }

    public void receberAumento(float aum){
        this.salario += aum;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setEspecialidade(String e){
        this.especialidade = e;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setSalario(float s){
        this.salario = s;
    }
}
