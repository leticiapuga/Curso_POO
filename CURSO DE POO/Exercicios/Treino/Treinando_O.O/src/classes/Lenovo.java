package classes;

public class Lenovo {
    String cor;
    boolean wifi;
    boolean camera;
    String placa_De_Video;
    String memoria;
    String navegador;
    int portas_USB;
    float versao;

    void conectar() {
        if (this.wifi == true) {
            System.out.println("Wifi ligado, você está conectado!");
        } else {
            System.out.println("Erro ao conectar, seu wifi está desligado!");
        }
    }

    void filmar() {
        if (this.camera == true) {
            System.out.println("Sua câmera está ligada, vamos iniciar a filmagem em 3 segundos!");
        } else {
            System.out.println("Erro ao iniciar a gravação, sua câmera está desligada!");
        }

    }

    void pesquisar() {
        if (this.navegador.equals("Edge") || this.navegador.equals("Chrome")) { // O MÉTODO equals() É UMA FORMA COMUM
                                                                                // DE COMPARAR STRINGS EM JAVA PARA
                                                                                // VERIFICAR SE ELAS TÊM O MESMO
                                                                                // CONTEÚDO.
            System.out.println("Você já pode iniciar a pesquisa!");

        } else {
            System.out.println("Erro ao iniciar a pesquisa, entre em um dos navegadores, Edge ou Chrome!");
        }
    }

    void jogar() {
        if (this.placa_De_Video.equals("nvidia") && this.memoria.equals("16GB") && this.versao == 10.2f) {
            System.out.println("O seu computador é gamer, pode iniciar o jogo!");
        } else {
            System.out.println("Seu computador não é gamer e pode ser danificado!");
        }

    }
}
