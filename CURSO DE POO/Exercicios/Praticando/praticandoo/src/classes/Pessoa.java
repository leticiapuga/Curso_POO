package classes;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("Idade deve ser um número positivo.");
        }
        if (sexo != 'm' && sexo != 'f' && sexo != 'M' && sexo != 'F') {
            throw new IllegalArgumentException("Sexo deve ser 'm' para masculino ou 'f' para feminino.");
        }
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo (char sexo) {
        if (sexo == 'm' || sexo == 'f' || sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        } else {
            throw new IllegalArgumentException("Sexo deve ser 'm' para masculino ou 'f' para feminino.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pessoa pessoa = (Pessoa) obj;
        return idade == pessoa.idade &&
               sexo == pessoa.sexo &&
               nome.equals(pessoa.nome);
    }

    
}
