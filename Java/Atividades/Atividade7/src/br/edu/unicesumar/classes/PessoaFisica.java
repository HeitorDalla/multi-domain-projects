package br.edu.unicesumar.classes;

public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica (){}

    public PessoaFisica (String nome, String telefone, String endereco, String cpf) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }

    // CONSTRUIR GET E SET APENAS DA CLASSE FILHA
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getCpf (String cpf) {
        return this.cpf;
    }

    // PARA SOBRESCREVER O MÉTODO DA CLASSE PAI
    @Override
    public String imprimirDados () {
        return super.imprimirDados() + "\n"
                + "CPF: " + this.cpf;
    }
}