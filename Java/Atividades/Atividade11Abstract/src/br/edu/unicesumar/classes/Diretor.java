package br.edu.unicesumar.classes;

public class Diretor extends Funcionario {
    
    @Override
    public double bonificacao()
    {
        return this.salario + 2500;
    }
}
