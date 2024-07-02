package classes;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido!";
        }
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    public void apresentar() {
        System.out.println("-----------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura());
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " Vitórias ");
        System.out.println(this.getDerrotas() + " Derrotas ");
        System.out.println(this.getEmpates() + " Empates ");
    }

    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes\n");


    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

}
