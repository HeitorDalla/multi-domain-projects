package br.edu.unicesumar.classes;

public abstract class Funcionario {

    protected double salario;

    public Funcionario(){}

    public Funcionario (double salario) {
        this.salario = salario;
    }

    public double getSalario()
    {
        return this.salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public abstract double bonificacao();
}