package classes;

public class Livro implements Publicacao {
    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // CONSTRUTOR
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    // MÉTODO
    public void detalhes() {
        System.out.println("---------------------------------------");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Você está na página: " + this.getPagAtual() + "!");
        System.out.println("O livro atualmente está: " + this.getAberto());
        System.out.println("Olá, " + leitor.getNome() + "!" + " faça uma boa leitura!");
        System.out.println("Idade: " + leitor.getIdade());
        System.out.println("Sexo: " + leitor.getSexo());

    }

    // MÉTODOS ESPECIAIS
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int t) {
        this.totPaginas = t;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int p) {
        this.pagAtual = p;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aber) {
        this.aberto = aber;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa l) {
        this.leitor = l;
    }

    public void abrir() {
        this.aberto = true;
        if (this.getAberto() == true) {
            System.out.println("Este livro possui: " + this.getTotPaginas() + " páginas!");
            System.out.println("Você está na página : " + this.getPagAtual());
        } else {
            System.out.println("Abra o livro para apreciar uma boa leitura!");
        }
    }

    public void fechar() {
        this.aberto = false;
        if (this.getAberto() == false) {
            System.out.println("Você fechou o livro: " + this.getTitulo() + " do autor " + this.getAutor());
        } else {
            System.out.println("Ao finalizar sua leitura, feche o livro e guarde-o!");
        }
    }

    public void folhear(int p) {
        if (this.getAberto() == true) {
            if (p > this.getTotPaginas()) {
                this.pagAtual = 0;
            } else {
                this.pagAtual = p;
            }
            System.out.println("Você está folheando o livro!");
        } else {
            System.out.println("O livro está fechado!");
        }
    }

    public void avancarPag() {
        if (this.getAberto() == true || this.getAberto() == false) {
            this.pagAtual = this.pagAtual + 1;
            System.out.println("Você avançou para a página: " + this.getPagAtual() + "!");
        } else {
            System.out.println("Você continua na mesma página!");
        }
    }

    public void voltarPag() {
        if (this.getAberto() == true) {
            this.pagAtual = this.pagAtual - 1;
            System.out.println("Você voltou para a página: " + this.getPagAtual() + "!");
        } else {
            System.out.println("O livro está fechado!");
        }
    }

}
