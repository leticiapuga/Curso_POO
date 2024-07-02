package classes;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){

    }

    public String getSetor(){
        return this.setor;
    }

    public void setSetor(String se){
        this.setor = se;
    }

    public boolean getTrabalhando(){
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trab){
        this.trabalhando = trab;
    }


}
