import java.util.Scanner;

import br.unicesumar.edu.classes.Student;
import br.unicesumar.edu.classes.User;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        User u = new User();
        u.cadastrarUser(sc);
        System.out.println(u);

        Student s = new Student();
        s.cadastrarUser(sc);
        System.out.println(s);

        User u2 = new Student();
        u2.cadastrarUser(sc);
        System.out.println(u2);

        sc.close();
    }
}