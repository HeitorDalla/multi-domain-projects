package br.edu.unicesumar.classes;

public class Teacher extends Pessoa {
    private String cargaHoraria;

    public Teacher () {}

    public Teacher (String nome, int idade, String cargaHoraria) {
        super(nome, idade);
        this.cargaHoraria = cargaHoraria;
    }

    public String getCargaHoraria () {
        return this.cargaHoraria;
    }

    public void setCargaHoraria (String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String showInfo () {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Carga horaria: " + getCargaHoraria();
    }

    // método para avaliar a média
    public void evaluateStudent (Student aluno) {
        double mediaAluno = aluno.getAverage();

        if (mediaAluno < 6) {
            System.out.println("O aluno: " + aluno.getNome() + " foi REPROVADO com média de: " + mediaAluno);
        } else {
            System.out.println("O aluno: " + aluno.getNome() + " foi APROVADO com média de: " + mediaAluno);
        }
    }
}