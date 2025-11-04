package br.unicesumar.edu.classes;

import java.util.Scanner;

public class Student extends User {

    private String academicRegister;

    public Student(){}

    public Student (String firstName, String lastName, int age, String academicRegister){
        super(firstName, lastName, age);
        this.academicRegister = academicRegister;
    }
    
    public void setAcademicRegister(String academicRegister) {
        this.academicRegister = academicRegister;
    }

    public String getAcademicRegister(){
        return this.academicRegister;
    }

    @Override
    public void cadastrarUser(Scanner s){
        System.out.println("Informe o nome do estudante:");
        setFirstName(s.nextLine());

        System.out.println("Informe o sobrenome do estudante:");
        setLastName(s.nextLine());

        System.out.println("Informe a idade do estudante:");
        setAge(s.nextInt());
        
        s.nextLine();

        System.out.println("Informe o RA do estudante:");
        this.academicRegister = s.nextLine();
    }

    @Override
    public String toString(){
        return getFirstName() + " "
            + getLastName() + " - " 
            + getAge() + " - " + 
            getAcademicRegister();
    }
}
