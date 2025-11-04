package br.edu.unicesumar.classes;

public class Conta {
    public String nomeTitular;
    public String numeroConta;
    public double saldoConta;

    /**
     * Método para retornar o depósito
     * @param deposito
     * @return
     */

    public void depositar (double deposito) {
        saldoConta += deposito;

        System.out.println(String.format("Novo saldo: %.2f", saldoConta));
    }

    /**
     * Método que vai retornar o saque
     * @param valorSaque
     * @return
     */

    public void sacar (double valorSaque) {
        if (valorSaque > saldoConta) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        saldoConta -= valorSaque;

        System.out.println("O valor do novo saldo é: " + saldoConta);
    }
}