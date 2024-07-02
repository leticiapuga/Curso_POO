package classes;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return this.volume;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private boolean getTocando() {
        return this.tocando;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado() == true) {
            System.out.println("-------MENU-------");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
        } else {
            System.out.println("Você só pode abrir o menu se a tv estiver ligada!");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar o volume, pois a tv está desligada!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir o volume, pois a tv está desligada!");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() == true && this.getTocando() == true) {
            this.setTocando(false);
        }
    }

}
