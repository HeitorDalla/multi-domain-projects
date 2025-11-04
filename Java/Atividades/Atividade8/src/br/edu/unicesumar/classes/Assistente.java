package br.edu.unicesumar.classes;

public class Assistente extends Funcionario {
    // ENCAPSULANDO OS ATRIBUTOS
    private String matricula;

    // CONSTRUTOR VAZIO
    public Assistente (){}

    // CONSTRUTOR COM TODAS AS INFORMAÇÕES
    public Assistente (String nome, double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    // CONSTRUIR GET E SET APENAS DA CLASSE FILHA
    public void setMatricula (String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula () {
        return this.matricula;
    }

    // PARA SOBRESCREVER O MÉTODO DA CLASSE PAI
    @Override
    public String exibeDados () {
        return super.exibeDados() + "\n" +
                "Matricula: " + this.matricula;
    }
}