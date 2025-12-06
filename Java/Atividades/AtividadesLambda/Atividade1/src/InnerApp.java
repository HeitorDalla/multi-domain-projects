@FunctionalInterface // para dizer explicitamente que e uma interface funcional (1 metodo)
 interface App {
    void show();
}

public class InnerApp {
    public static void main (String a[]) {
        App obj = () -> {
            System.out.println("in show");
        };

        obj.show();
    }    
}