package br.edu.unicesumar.classes;

public class Calculator {
    public static int add(int num1, int num2) {
        System.out.println("Voce esta no método de adicao");
        return num1 + num2;
    }
    public static double add(double num1, double num2) {
        System.out.println("Voce esta no método de adicao");
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        System.out.println("Voce esta no método de subtracao");
        return num1 - num2;
    }
    public static double sub(double num1, double num2) {
        System.out.println("Voce esta no método de subtracao");
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        System.out.println("Voce esta no método de mutliplicacao");
        return num1 * num2;
    }
    public static double multi(double num1, double num2) {
        System.out.println("Voce esta no método de mutliplicacao");
        return num1 * num2;
    }

    public static int divi(int num1, int num2) {
        System.out.println("Voce esta no método de divisao");
        if (num2 == 0) {
            System.out.println("Erro de divisão por zero!");
            return 0;
        }

        return num1 / num2;
    }
    public static double divi(double num1, double num2) {
        System.out.println("Voce esta no método de divisao");
        if (num2 == 0) {
            System.out.println("Erro de divisão por zero!");
            return 0;
        }
        
        return num1 / num2;
    }
}