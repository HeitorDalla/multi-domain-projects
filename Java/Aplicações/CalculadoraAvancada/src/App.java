import java.util.Scanner;

import br.edu.unicesumar.classes.Calculator;
import br.edu.unicesumar.classes.Result;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--- Opções ---");
            System.out.println("--- 1 - Somar ---");
            System.out.println("--- 2 - Subtrair ---");
            System.out.println("--- 3 - Multiplicar ---");
            System.out.println("--- 4 - Dividir ---");
            System.out.println("--- 0 - Sair ---");

            System.out.println("Qual opção voce deseja? ");
            int opcao = sc.nextInt();

            if (opcao == 0) break;

            System.out.println("Digite o primeiro numero: ");
            double num1 = sc.nextDouble();

            System.out.println("Digite o segundo numero: ");
            double num2 = sc.nextDouble();

            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = Calculator.add(num1, num2);
                    break;

                case 2:
                    resultado = Calculator.sub(num1, num2);
                    break;

                case 3:
                    resultado = Calculator.multi(num1, num2);
                    break;

                case 4:
                    resultado = Calculator.divi(num1, num2);
                    break;
            
                default:
                    System.out.println("Não existe essa opção!");
                    break;
            }

            Result r = new Result(resultado);
            System.out.println("O resultado da operação é: " + r.getValue());

            System.out.println("Voce deseja continuar? [S/N] ");
            sc.nextLine();
            String pergunta = sc.nextLine();


            if (pergunta.equalsIgnoreCase("n")) {
                System.out.println("Programa encerrando... ");
                break;
            }
        }

        sc.close();
    }
}