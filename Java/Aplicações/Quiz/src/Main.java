import br.edu.unicesumar.classes.QuestionService;

public class Main {
    public static void main(String[] args) throws Exception {
        QuestionService questions = new QuestionService();

        questions.playQuiz();
        questions.printScore();
    }
}