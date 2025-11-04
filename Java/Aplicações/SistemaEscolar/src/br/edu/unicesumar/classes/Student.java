package br.edu.unicesumar.classes;

public class Student extends Pessoa {
    private String ra;
    private Grades notasDoAluno; //objeto que vai armazenar o objeto de Grades

    public Student () {
        this.notasDoAluno = new Grades();
    }

    public Student (String nome, int idade, String ra) {
        super(nome, idade);
        this.ra = ra;

        this.notasDoAluno = new Grades();
    }

    public String getRa () {
        return this.ra;
    }

    public void setRa (String ra) {
        this.ra = ra;
    }

    // método para mostrar as informacoes do aluno
    @Override
    public String showInfo () {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", RA: " + getRa();
    }

    // método para adicionar a nota do aluno ao objeto de instancia da classe Grades
    public void addGrade (double nota) {
        this.notasDoAluno.addGrade(nota);
    }

    // método para pegar a média do aluno
    public double getAverage () {
        return this.notasDoAluno.calculateAverage();
    }
}
