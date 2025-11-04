package br.edu.unicesumar.classes;

public abstract class Poupanca extends Conta {
    // CONSTRUTOR
    public Poupanca () {};

    public Poupanca (int numeroConta) {
        super(numeroConta);
    }

    // SE A CLASSE FILHA A UMA CLASSE ABSTRACT NAO HERDAR TODOS OS MÉTODOS ABSTRATOS DA CLASSE PAI, ELE DEVE SER ABSTRATO TAMBEM
    // MAS AI ELE NAO PODE SER INSTANCIADO, SENDO NECESSARIO CRIAR UMA OUTRA CLASSE, A 'ACAO'

    // MÉTODOS
    @Override
    public void sacar () {
        System.out.println("Voce acabou de sacar 2000 da sua conta poupança.");
    }
}