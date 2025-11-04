package br.edu.unicesumar.classes;

public abstract class Conta {
    // ATRIBUTO CONCRETO (COMUM A TODOS)
    protected int numeroConta;

    // CONSTRUTOR
    public Conta () {}

    public Conta (int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // MÉTODOS GET E SET
    public int getNumeroConta () {
        return this.numeroConta;
    }

    public void setNumeroConta (int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // MÉTODO ABSTRATO - ESTOU DANDO APENAS A IDEIA ABSTRATA, MAS NÃO IMPLEMENTANDO
    // OBRIGA AS CLASSES FILHAS IMPLEMENTAREM A LÓGICA, 
    // POIS É DIFERENTE PARA CADA TIPO
    // OU SEJA, TODA CLASSE QUE EXTENDA A CLASSE DE 'Conta', TEM QUE POSSUIR O MÉTODO 'sacar' e 'depositar'
    // NÃO É POSSIVEL CRIAR UM OBJETO DE UMA CLASSE ABSTRATA
    public abstract void sacar ();

    public abstract void depositar();
}