import br.edu.unicesumar.classes.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta(); 
        
        /* Nome */
        System.out.println("Digite  no nome do titular: ");
        conta.nomeTitular = scanner.nextLine();

        /* Número da conta */
        System.out.println("Digite o número da sua conta: ");
        conta.numeroConta = scanner.nextLine();

        /* Saldo da conta */
        System.out.println("Digite o saldo atual da conta: ");
        conta.saldoConta = scanner.nextDouble();

        int opcao;

        do {
            System.out.println("-- Opções: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            if (opcao != 0) {
                realizarMovimentacao(opcao, conta);
            }
        } while (opcao != 0); 
    }

    public static void realizarMovimentacao (int opcao, Conta conta) {
        Scanner sc = new Scanner(System.in);

        switch (opcao) {
            case 1:
                System.out.println("Informe o valor a ser depositado: ");
                double deposito = sc.nextDouble();

                conta.depositar(deposito);
                break;
            case 2:
                System.out.println("Qual valor voce deseja sacar? ");
                double valorSacar = sc.nextDouble();

                conta.sacar(valorSacar);

                break;
            default:
                throw new AssertionError();
        }
    }
}