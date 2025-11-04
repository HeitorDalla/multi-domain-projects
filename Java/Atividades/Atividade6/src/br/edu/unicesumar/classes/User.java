package br.edu.unicesumar.classes;

public class User {

    //ENCAPSULANDO OS ATRIBUTOS
    private String email;
    private String password;
    private String name;

    //CONSTRUTOR VAZIO
    public User(){}

    //CONSTRUTOR COM TODAS AS INFORMAÇÕES
    public User(String email, String password, String name){
        this.email = email;
        this.password = password;
        this.name = name;
    }

    //DISPONIBILIZAÇÃO DO ATRIBUTO
    public String getEmail () {
        return this.email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPassword (){
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
