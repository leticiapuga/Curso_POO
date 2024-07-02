package classes;
public class Main {
    public static void main(String[] args) {
        int[] numeros = { 1, 3, 4, 4, 4, 6 };
        Raspadinha rasp = new Raspadinha("Ceara");
        rasp.setNumeros(numeros);
        rasp.raspar();
        System.out.println(SorteGrande.calcularPremio(rasp));

        int[] numeros2 = { 1, 2, 3, 4, 4, 8 };
        Raspadinha rasp2 = new Raspadinha("Ceara");
        rasp2.setNumeros(numeros2);
        rasp2.raspar();
        System.out.println(SorteGrande.calcularPremio(rasp2));

        int[] numeros3 = { 10, 2, 3, 10, 4, 10 };
        Raspadinha rasp3 = new Raspadinha("Ceara");
        rasp3.setNumeros(numeros3);
        System.out.println(SorteGrande.calcularPremio(rasp3));

        int[] numeros4 = { 10, 2, 3, 10, 4, 10 };
        Raspadinha rasp4 = new Raspadinha("Ceara");
        rasp4.setNumeros(numeros4);
        rasp4.raspar();
        System.out.println(SorteGrande.calcularPremio(rasp4));

        Raspadinha rasp5 = new Raspadinha("Ceara");
        System.out.println(rasp5.isRaspada());

        Raspadinha rasp6 = new Raspadinha("Ceara");
        System.out.println(rasp6.getNumeros());

        Raspadinha rasp7 = new Raspadinha("CearaSorte");
        System.out.println(rasp7.getEmpresa());

        int[] numeros5 = { 10, 200, 201, 200, 200, 10 };
        Raspadinha rasp8 = new Raspadinha("Ceara");
        rasp8.setNumeros(numeros5);
        rasp8.raspar();
        SorteGrande.calcularPremio(rasp8);

        int[] numeros6 = { 100, 20, 21, 100, 2, 100 };
        Raspadinha rasp9 = new Raspadinha("Ceara");
        rasp9.setNumeros(numeros6);
        rasp9.raspar();
        SorteGrande.calcularPremio(rasp9);

        System.out.println(SorteGrande.getTotalPremios());
        System.out.println(SorteGrande.getValoresPagos());

        int[] numeros7 = { 10, 200, 200, 200, 200, 10 };
        Raspadinha rasp10 = new Raspadinha("Ceara");
        rasp10.setNumeros(numeros7);
        System.out.println(rasp10.raspar());
    }
}

