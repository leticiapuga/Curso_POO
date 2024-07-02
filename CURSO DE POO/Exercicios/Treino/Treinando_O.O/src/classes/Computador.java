package classes;

public class Computador {
    public static void main(String[] args) {
        Lenovo comp_1 = new Lenovo();
        comp_1.wifi = true;
        comp_1.camera = true;
        comp_1.placa_De_Video = "nvidia";
        comp_1.memoria = "16GB";
        comp_1.navegador = "Edge";
        comp_1.versao = 10.2f;

        comp_1.conectar();
        comp_1.filmar();
        comp_1.pesquisar();
        comp_1.jogar();

        Lenovo comp_2 = new Lenovo();
        comp_2.wifi = false;
        comp_2.camera = false;
        comp_2.placa_De_Video = "outra";
        comp_2.memoria = "8GB";
        comp_2.navegador = "Firefox";
        comp_2.versao = 10.2f;

        comp_2.conectar();
        comp_2.filmar();
        comp_2.pesquisar();
        comp_2.jogar();
    }
}
