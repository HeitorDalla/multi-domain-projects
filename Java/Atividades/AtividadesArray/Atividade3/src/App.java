import java.text.NumberFormat.Style;

class Student {
    String name;
    int mark;
    String cpf;
}

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.name = "Heitor";
        s1.cpf = "1234567";

        Student s2 = new Student();
        s2.name = "Gilmar";
        s2.cpf = "1234567w745723";

        Student s3 = new Student();
        s3.name = "Marli";
        s3.cpf = "1234567243362465";

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println(student.name + " : " + student.cpf);
        }

    }
}