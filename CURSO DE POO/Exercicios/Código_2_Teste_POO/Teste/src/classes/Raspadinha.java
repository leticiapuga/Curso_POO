package classes;

import java.util.Arrays;

class Raspadinha {
    private int[] numeros;
    private String empresa;
    private long codigoRaspadinha;
    private boolean raspada;

    // Construtor
    Raspadinha(String empresa) {
        this.empresa = empresa;
        this.raspada = false;
    }

    // Método para raspar a raspadinha
    String raspar() {
        if (!raspada) {
            raspada = true;
            StringBuilder result = new StringBuilder();
            for (int num : numeros) {
                result.append(num).append(" - ");
            }
            return result.delete(result.length() - 3, result.length()).toString();
        } else {
            return "Raspadinha já foi raspada.";
        }
    }

    // Getter para os números da sorte
    int[] getNumeros() {
        if (raspada) {
            return numeros;
        } else {
            return null;
        }
    }

    // Setter para os números da sorte
    void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    // Getters e Setters
    String getEmpresa() {
        return empresa;
    }

    long getCodigoRaspadinha() {
        return codigoRaspadinha;
    }

    boolean isRaspada() {
        return raspada;
    }

    void setCodigoRaspadinha(long codigoRaspadinha) {
        this.codigoRaspadinha = codigoRaspadinha;
    }
}

class SorteGrande {
    private static int totalPremios = 0;
    private static int valoresPagos = 0;

    // Método para calcular o prêmio
    static int calcularPremio(Raspadinha raspadinha) {
        int[] numeros = raspadinha.getNumeros();
        if (numeros == null) {
            return 0; // Raspadinha não foi raspada
        }

        Arrays.sort(numeros);
        for (int i = 0; i <= 3; i++) {
            if (numeros[i] == numeros[i + 1] && numeros[i] == numeros[i + 2]) {
                int premio = numeros[i];
                totalPremios++;
                valoresPagos += premio;
                return premio;
            }
        }
        return 0; // Nenhum prêmio
    }

    // Getters
    static int getTotalPremios() {
        return totalPremios;
    }

    static int getValoresPagos() {
        return valoresPagos;
    }
}

// public class Main {
//     public static void main(String[] args) {
//         int[] numeros = { 1, 3, 4, 4, 4, 6 };
//         Raspadinha rasp = new Raspadinha("Ceara");
//         rasp.setNumeros(numeros);
//         rasp.raspar();
//         System.out.println(SorteGrande.calcularPremio(rasp));

//         int[] numeros2 = { 1, 2, 3, 4, 4, 8 };
//         Raspadinha rasp2 = new Raspadinha("Ceara");
//         rasp2.setNumeros(numeros2);
//         rasp2.raspar();
//         System.out.println(SorteGrande.calcularPremio(rasp2));

//         int[] numeros3 = { 10, 2, 3, 10, 4, 10 };
//         Raspadinha rasp3 = new Raspadinha("Ceara");
//         rasp3.setNumeros(numeros3);
//         System.out.println(SorteGrande.calcularPremio(rasp3));

//         int[] numeros4 = { 10, 2, 3, 10, 4, 10 };
//         Raspadinha rasp4 = new Raspadinha("Ceara");
//         rasp4.setNumeros(numeros4);
//         rasp4.raspar();
//         System.out.println(SorteGrande.calcularPremio(rasp4));

//         Raspadinha rasp5 = new Raspadinha("Ceara");
//         System.out.println(rasp5.isRaspada());

//         Raspadinha rasp6 = new Raspadinha("Ceara");
//         System.out.println(rasp6.getNumeros());

//         Raspadinha rasp7 = new Raspadinha("CearaSorte");
//         System.out.println(rasp7.getEmpresa());

//         int[] numeros5 = { 10, 200, 201, 200, 200, 10 };
//         Raspadinha rasp8 = new Raspadinha("Ceara");
//         rasp8.setNumeros(numeros5);
//         rasp8.raspar();
//         SorteGrande.calcularPremio(rasp8);

//         int[] numeros6 = { 100, 20, 21, 100, 2, 100 };
//         Raspadinha rasp9 = new Raspadinha("Ceara");
//         rasp9.setNumeros(numeros6);
//         rasp9.raspar();
//         SorteGrande.calcularPremio(rasp9);

//         System.out.println(SorteGrande.getTotalPremios());
//         System.out.println(SorteGrande.getValoresPagos());

//         int[] numeros7 = { 10, 200, 200, 200, 200, 10 };
//         Raspadinha rasp10 = new Raspadinha("Ceara");
//         rasp10.setNumeros(numeros7);
//         System.out.println(rasp10.raspar());
//     }
// }
