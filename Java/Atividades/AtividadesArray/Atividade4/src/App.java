import java.text.NumberFormat.Style;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        String again = "y";
        String repeat;

        do {
            System.out.println("Digite um numero: ");
            int numero = input.nextInt();
        
            System.out.println("Digite outro numero: ");
            int numero2 = input.nextInt();
            
            input.nextLine(); // consumir a quebra de linha pendente
            
            System.out.println("Qual operação voce deseja realizar? ");
            System.out.println("+ - para adição");
            System.out.println("- - para subtração");
            System.out.println("x - para multiplicação");
            System.out.println("/ - para divisão");
            
            String opcao = input.nextLine();
            
            switch (opcao) {
                case "+":
                    System.out.println("A soma dos numeros: " + numero + " e do numero " + numero2 + " é: " + (numero + numero2));
                    break;
                    
                case "-":
                    System.out.println("A subtracao dos numeros: " + numero + " e do numero " + numero2 + " é: " + (numero - numero2));
                    break;
                    
                case "x":
                    System.out.println("A multiplicacao dos numeros: " + numero + " e do numero " + numero2 + " é: " + (numero * numero2));
                    break;
                    
                case "/":
                    if (numero2 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("A divisao dos numeros: " + numero + " e do numero " + numero2 + " é: " + ((double) numero / numero2));
                    }
                    
                    break;
                default:
                    System.out.println("Nenhum opção válida escolhida!");
                    break;
            }
            
            System.out.println("Do you want to calculate again? (y/n) ");
            repeat = input.nextLine().toLowerCase();
            
        } while (repeat.equals("s"));
    }
}