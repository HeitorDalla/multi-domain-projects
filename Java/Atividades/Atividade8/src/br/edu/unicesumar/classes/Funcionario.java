package br.edu.unicesumar.classes;

public class Funcionario {
    // ENCAPSULANDO OS ATRIBUTOS
    private String nome;
    private double salario;

    // CONSTRUTOR VAZIO
    public Funcionario(){}

    // CONSTRUTOR COM TODAS AS INFORMAÇÕES
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    // CONSTRUINDO OS SETERS
    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setSalario (double salario) {
        this.salario = salario;
    }

    // CONTRUINDO OS GETTERS
    public String getNome () {
        return this.nome;
    }

    public double getSalario () {
        return this.salario;
    }

    // CONSTRUINDO OS MÉTODOS DA CLASSE
    public void addAumento(double valor) {
        this.salario = this.salario + valor;
    }

    public String ganhoAnual() {
        return "O ganho anual desse funcionário é: " + (this.salario * 12);
    }

    public String exibeDados () {
        return "Nome do cliente: " + this.nome + "\n"
                + "Salario: "+ this.salario + "\n";
    }
}