import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map <String, Integer> students = new HashMap<>();

        students.put("Heitor", 9);
        students.put("Marli", 7);
        students.put("Gilmar", 4);

        // System.out.println(students);

        // Para iterar sobre um Map, existe diferentes formas
        for (String name : students.keySet()) {
            System.out.println("Chave: " + name + "/ Valor: " + students.get(name));
        }
    }
}