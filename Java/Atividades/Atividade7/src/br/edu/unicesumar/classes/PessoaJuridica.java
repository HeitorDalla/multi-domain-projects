package br.edu.unicesumar.classes;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String nomeFantasia;

    // CRIAÇÃO DO CONSTRUTOR
    public PessoaJuridica (){}

    public PessoaJuridica (String nome, String telefone, String endereco, String cnpj, String nomeFantasia) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    // CRIACAO DOS GETS E SETS
    public void setCNPJ (String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNomeFantasia (String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCNPJ (String cnpj) {
        return this.cnpj;
    }

    public String getNomeFantasia (String nomeFantasia) {
        return this.nomeFantasia;
    }

    // SOBRESCREVER MÉTODO DE IMPRESSAO DE DADOS (POLIMORFISMO)
    @Override
    public String imprimirDados () {
        return super.imprimirDados() + '\n' + 
                "CNPJ: " + this.cnpj + '\n' + 
                "Nome Fantasia: " + this.nomeFantasia;
    }
}