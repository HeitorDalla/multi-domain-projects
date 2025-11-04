package br.edu.unicesumar.classes;

public class Acao extends Poupanca {
    @Override
    public void sacar () {
        System.out.println("Voce acabou de sacar 2000 da sua conta de acoes.");
    }

    public void depositar () {
        System.out.println("Voce acabou de depositrar 2000 da sua conta de acoes.");
    }
}
