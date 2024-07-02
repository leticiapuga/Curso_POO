package classes;

public class Mamifero extends Animal{
    protected String corPelo;

    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }

    public String getCorPelo(){
        return this.corPelo;
    }

    public void setCorPelo(String c){
        this.corPelo = c;
    }
}
