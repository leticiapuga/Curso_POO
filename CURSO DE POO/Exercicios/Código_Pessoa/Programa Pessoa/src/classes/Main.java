package classes;

public class Main {
    public static void main(String[] args) {
       Pessoa[] p = new Pessoa[2];
       Livro[] l = new Livro[3];

       p[0] = new Pessoa ("Pedro", 22, "M");
       p[1] = new Pessoa ("Maria", 25, "F");

       l[0] = new Livro ("Java para iniciantes", "Gustavo Ganabara", 300, p[1]);
       l[1] = new Livro ("Pai Rico Pai Pobre", "Robert Kiyosaki", 480, p[0]);
       l[2] = new Livro ("Poder do hábito", "Charles Duhigg", 600, p[1]);

       l[0].abrir();
       l[0].folhear(45);
       l[0].avancarPag();
       l[0].detalhes();
      

    }
}
