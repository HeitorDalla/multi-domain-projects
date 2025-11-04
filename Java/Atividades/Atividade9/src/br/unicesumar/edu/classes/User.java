package br.unicesumar.edu.classes;

import java.util.Scanner;

public class User {

    // VARIÁVEIS PRIVADAS
    private String firstName;
    private String lastName;
    private int age;

    // CONSTRUTOR VAZIO
    public User (){}

    public User(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void cadastrarUser(Scanner s){
        System.out.println("Informe o nome do usuário:");
        this.firstName = s.nextLine();

        System.out.println("Informe o sobrenome do usuário:");
        this.lastName = s.nextLine();
        
        System.out.println("Informe a idade do usuário:");
        this.age = s.nextInt();

        s.nextLine();
    }

    public String toString(){
        return this.firstName + " "
            + this.lastName + " - " 
            + this.age;
    }
}
