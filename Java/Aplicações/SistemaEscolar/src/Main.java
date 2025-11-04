import java.util.Scanner;

import br.edu.unicesumar.classes.Student;
import br.edu.unicesumar.classes.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Avaliação de notas ---");

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        Student aluno = new Student();
        aluno.setNome(nome);
        aluno.setIdade(idade);

        System.out.println("BEM VINDO!!!!");

        System.out.println("Deseja adicionar quantas notas para avaliação? ");
        int quantidadeNotas = sc.nextInt();

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Digite sua nota: ");
            double nota = sc.nextDouble();

            aluno.addGrade(nota);
        }

        Teacher professora = new Teacher();
        professora.setNome("Larissa");
        professora.setIdade(70);

        professora.evaluateStudent(aluno);

        sc.close();        

        System.out.println("No momento, tem: " + Student.getCount() + " objetos instanciados");
    }
}