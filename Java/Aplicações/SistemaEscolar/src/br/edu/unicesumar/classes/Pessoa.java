package br.edu.unicesumar.classes;

public class Pessoa {
    private String nome;
    private int idade;
    
    private static int contPessoa = 0;

    public Pessoa () {
        contPessoa ++;
    }

    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

        contPessoa ++;
    }

    public String getNome () {
        return this.nome;
    }

    public int getIdade () {
        return this.idade;
    }

    public static int getCount () {
        return contPessoa;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public String showInfo () {
        return "Nome: " + getNome() + ", Idade: " + getIdade();
    }
}
