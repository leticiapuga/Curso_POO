package classes;

public class Programa {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Leo&Leo", "Amarela", 1.0f, 6, true);
        c1.setModelo("Faber-Castell");
        c1.cor = "Azul";
        c1.setPonta(0.5f); // USO O SET AQUI PORQUE PONTA É PRIVADO, COM O SET EU TENHO ACESSO!
        c1.destampar();
        c1.status(); // AO CHAMAR UM MÉTODO DEVEMOS COLOCAR UM PARÊNTES.
        c1.rabiscar();

        Caneta c2 = new Caneta("BIC", "Preta", 3.0f, 10, true);
        c2.status();

    }
}
