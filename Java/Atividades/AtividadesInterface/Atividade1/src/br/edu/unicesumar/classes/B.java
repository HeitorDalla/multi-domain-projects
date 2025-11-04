package br.edu.unicesumar.classes;

public class B implements A{
    @Override
    public void show () {
        System.out.println("in a show");
    }

    @Override
    public void config() {
        System.out.println("in a config");        
    }
}