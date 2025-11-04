package Atividade3;

import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arrayNumeros;
        float soma = 0;
        float media = 0;
        int contador = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o valor gasto no mês: ");
            float numeroRecebido = scanner.nextFloat();
            soma += numeroRecebido;
            contador += 1;

            // Zerar o numero guardado
            numeroRecebido = 0;
        }

        media = soma / 9;

        System.out.println("A soma total de: " + soma);
        System.out.println("A media do trimestre é: " + media);        
    }
}