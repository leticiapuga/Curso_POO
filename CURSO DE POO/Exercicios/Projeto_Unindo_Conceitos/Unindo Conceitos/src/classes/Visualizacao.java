package classes;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int total = 0;
        if (porc <= 20) {
            total = 3;
        }else if (porc <= 50) {
           total = 50; 
        }else if (porc <=90) {
            total = 8;
        }else{
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }

    public Gafanhoto getEspesctador() {
        return this.espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return this.filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualização{" + "espectador: " + espectador + ", filme: " + filme + "}";
    }

}
