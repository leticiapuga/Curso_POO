package classes;

public class Main {
    public static void main(String[] args)  {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        // c.desligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
