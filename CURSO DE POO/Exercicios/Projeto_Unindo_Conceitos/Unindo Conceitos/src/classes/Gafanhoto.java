package classes;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totalAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String l) {
        this.login = l;
    }

    public int getTotalAssistido() {
        return this.totalAssistido;
    }

    public void setTotalAssistido(int t) {
        this.totalAssistido = t;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin: " + login + ", total assistido: " + totalAssistido + "}";
    }

}
