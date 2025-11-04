package br.edu.unicesumar.classes;

public class Tecnico extends Assistente {
    // CRIANDO VARIAVEIS
    private double bonusSalarial;

    // CONSTRUTOR VAZIO
    public Tecnico(){}

    // CONSTRUTOR COM TODAS AS INFORMAÇÕES
    public Tecnico (String nome, double salario, String matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    // CONSTRUIR GET E SET APENAS DA CLASSE FILHA
    public void setBonusSalarial (double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial () {
        return this.bonusSalarial;
    }

    @Override
    public String ganhoAnual() {
        return "O seu ganho anual é: " + (getSalario() * 12) + this.bonusSalarial;
    }
}