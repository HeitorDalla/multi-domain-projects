public class App {
    public static void main(String[] args) throws Exception {
        A object = new A();
        object.show();

        // PARA ACESSAR MÉTODOS DE CLASSES ANINHADAS QUANDO '''NÃO É UM MÉTODO ESTÁTICO'''
        A.B object2 = object.new B();
        object2.config();

        // PARA ACESSAR MÉTODOS DE CLASSES ANINHADAS QUANDO '''É UM MÉTODO ESTÁTICO'''
        A.C object3 = new A.C();
        object3.settings();
    }
}

class A {
    // COMPORTAMENTOS
    int age;

    public void show () {
        System.out.println("in show");
    }

    class B {
        public void config () {
            System.out.println("in config");
        }
    }

    static class C {
        public void settings () {
            System.out.println("in settings");
        }
    }
}