import br.edu.unicesumar.classes.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u = new User("email@email.com", "123", "Admin");
        User u2 = new User();

        u2.setEmail("user2@email.com");
        u2.setPassword("password");
        u2.setName("User 2");

        System.out.println("INFORMAÇÕES DO USER 1:");
        System.out.println("E-mail: " + u.getEmail());
        System.out.println("Name: " + u.getName());

        System.out.println("==============================");
        System.out.println("INFORMAÇÕES DO USER 2:");
        System.out.println("E-mail: " + u2.getEmail());
        System.out.println("Name: " + u2.getName());

    }
}
