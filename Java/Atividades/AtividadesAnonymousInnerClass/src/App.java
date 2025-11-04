public class App {
    public static void main(String[] args) throws Exception {
        // ISSO É USADO CASO EU QUEIRA MODIFICAR O COMPORTAMENTO DE UM MÉTODO, 
        // MAS NÃO QUEIRA CRIAR OUTRA CLASSE PARA ISSO

        A object = new A()
        {
            public void show () {
                System.out.println("in new show");
            }
        };

        object.show();
    }
}

class A {
    int age;

    public void show () {
        System.out.println("in show");
    }
}