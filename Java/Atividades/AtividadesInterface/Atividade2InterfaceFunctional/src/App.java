public class App {
    public static void main(String[] args) throws Exception {
        A obj = new A () {
            public void show() {
                System.out.println("in a show");
            }
        };
    }
}

@FunctionalInterface // anotação para uma interface functional
interface A {
    void show ();
}