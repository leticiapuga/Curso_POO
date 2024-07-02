package classes;

public class Caneta {
    private String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public Caneta(String m, String c, float p, int ca, boolean t) // ESTE É O MÉTODO CONSTRUTOR.
    {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.carga = ca;
        this.tampada = t;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public int getCarga(){
        return this.carga;
    }

    public void setCarga(int ca){
        this.carga = ca;
    }

    public boolean getTampada(){
        return this.tampada;
    }

    public void setTampada(boolean t){
        this.tampada = t;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("carga: " + this.getCarga());
        System.out.println("Está tampada? " + this.getTampada());
        System.out.println("kkkkk");

    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! A caneta está tampada, logo, não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando!");
        }

    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
    
}

