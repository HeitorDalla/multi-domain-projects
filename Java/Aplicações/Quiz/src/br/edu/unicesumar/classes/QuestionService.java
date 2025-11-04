package br.edu.unicesumar.classes;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selections = new String[5];

    public QuestionService () {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of int", "2", "6", "4", "8", "4");
        questions[2] = new Question(3, "size of int", "2", "6", "4", "8", "4");
        questions[3] = new Question(4, "size of int", "2", "6", "4", "8", "4");
        questions[4] = new Question(5, "size of int", "2", "6", "4", "8", "4");
    }

    public void playQuiz () {
        int i = 0;

        for (Question question : questions) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Numero da questão: " + question.getId());
            System.out.println("Pergunta: " + question.getQuestion());
            System.out.println("Opcao 1: " + question.getOpt1());
            System.out.println("Opcao 2: " + question.getOpt2());
            System.out.println("Opcao 3: " + question.getOpt3());
            System.out.println("Opcao 4: " + question.getOpt4());

            System.out.println("Qual vai ser a sua resposta? ");
            selections[i] = sc.nextLine();

            i ++;
        }

        System.out.println("As suas respostas das perguntas são: \n");
        for (String selection : selections) {
            System.out.println(selection);
        }
    }

    public void printScore () {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            String actualAnswer = question.getAnswer();
            String userAnswer = selections[i];

            if (actualAnswer.equals(userAnswer)) {
                score ++;
            }
        }

        System.out.println("O seu score é: " + score);
    }
}
