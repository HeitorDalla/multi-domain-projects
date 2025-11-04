package br.edu.unicesumar.classes;

public class Corrente extends Conta {
    // CONSTRUTOR
    public Corrente () {};
    
    public Corrente (int numeroConta) {
        super(numeroConta);
    }

    // MÉTODOS
    @Override
    public void sacar () {
        System.out.println("Voce acabou de sacar R$1000 da conta corrente!!");
    }

    @Override
    public void depositar() {
        System.out.println("Voce acabou de depositare na conta corrente");
    }
}