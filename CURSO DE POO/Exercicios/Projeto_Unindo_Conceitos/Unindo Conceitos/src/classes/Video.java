package classes;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int a) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int v) {
        this.views = v;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public void setCurtidas(int l) {
        this.curtidas = l;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean r) {
        this.reproduzindo = r;
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }

    @Override
    public String toString() {
        return "Vídeo{" + "título: " + titulo + ", avaliação: " + avaliacao + ", views: " + views + ", curtidas: " + curtidas + ", reproduzindo: " + reproduzindo + "}";
    }
}
