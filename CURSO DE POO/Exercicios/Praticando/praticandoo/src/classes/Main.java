package classes;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private Pessoa[] pessoas;

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public void ordenarPessoas() {
        Arrays.sort(pessoas, Comparator.comparingInt(Pessoa::getIdade).reversed());
    }

    public void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(
                    "Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Sexo: " + pessoa.getSexo());
        }
    }

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[5];

        Pessoa p1 = new Pessoa("Huguinho", 13, 'm');
        Pessoa p2 = new Pessoa("Zezinho", 14, 'm');
        Pessoa p3 = new Pessoa("Luizinho", 15, 'm');
        Pessoa p4 = new Pessoa("Luluzinha", 15, 'f');
        Pessoa p5 = new Pessoa("Carlinhos", 4, 'm');
        Pessoa p6 = new Pessoa("Mariazinha", 2, 'f');

        pessoas = new Pessoa[] { p1, p2, p3, p4, p5, p6 };
        Main m = new Main();
        m.setPessoas(pessoas);
        m.ordenarPessoas();
        m.listarPessoas();

    }
}
