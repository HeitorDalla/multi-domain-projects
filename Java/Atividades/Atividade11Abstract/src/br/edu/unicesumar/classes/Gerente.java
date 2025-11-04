package br.edu.unicesumar.classes;

public class Gerente extends Funcionario {

    @Override
    public double bonificacao()
    {
        return this.salario + 2000;
    }
    
}
