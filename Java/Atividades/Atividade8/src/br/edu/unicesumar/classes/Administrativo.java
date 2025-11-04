package br.edu.unicesumar.classes;

public class Administrativo extends Assistente {
    private boolean noturno;
    private double adicionalNoturno;

    public Administrativo () {}

    public Administrativo (String nome, double salario, String matricula, boolean noturno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.noturno = noturno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public String exibeDados () {
        return "Nome do funcionario: " + this.getNome() + "\n"
                + "Salario: "+ (getSalario() + this.adicionalNoturno) + "\n";
    }
}
