package br.edu.unicesumar.classes;

public class Cliente {

    // ENCAPSULANDO OS ATRIBUTOS
    private String nome;
    private String telefone;
    private String endereco;

    // CONSTRUTOR VAZIO
    public Cliente(){}

    // CONSTRUTOR COM TODAS AS INFORMAÇÕES
    public Cliente(String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // CONSTRUINDO OS SETERS
    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco (String endereco) {
        this.endereco = endereco;
    }

    // CONTRUINDO OS GETTERS
    public String getNome () {
        return this.nome;
    }

    public String getTelefone () {
        return this.telefone;
    }

    public String getEndereco () {
        return this.endereco;
    }

    public String imprimirDados () {
        return "Nome do cliente: " + this.nome + "\n"
                + "Endereço: "+ this.endereco + "\n"
                + "Telefone: "+ this.telefone + "\n";
    }
}