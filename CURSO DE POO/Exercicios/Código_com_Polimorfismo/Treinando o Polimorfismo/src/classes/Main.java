package classes;
public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        p.locomover();  // ISSO É POLIMORFISMO!
        r.locomover();

        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
        j.locomover();
        t.locomover();
        g.locomover();
        e.locomover();




    }
}
