package br.edu.unicesumar.classes;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Double> gradesList;

    public Grades () {
        // Cria uma nova instancia vazia quando o objeto Grades é instanciado
        this.gradesList = new ArrayList<>();
    }

    // retornar a lista completa de notas
    public List<Double> getGradesList () {
        return this.gradesList;
    }

    // adicionar notas à lista
    public void addGrade (double grade) { //receber a entrada da nota
        this.gradesList.add(grade);
    }

    // calcular a média das notas
    public double calculateAverage () { // nao precisa receber nada, pois ele pega do estado da variavel
        // Verificar se ele esta vazio
        if (this.gradesList.isEmpty()) {
            return 0.0;
        }
        
        // soma todas as notas
        double somaNotas = 0;
        for (double nota : gradesList) {
            somaNotas += nota;
        }

        // retorna a média
        return somaNotas / this.gradesList.size();
    }
}