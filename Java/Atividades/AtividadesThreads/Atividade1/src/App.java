public class App {
    public static void main(String[] args) throws Exception {
        // TRABALHAR COM PRIORIDADES (VAI DE 1 À 10) - definir prioridades diferentes paras as threads
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(1);

        obj1.start();
        obj2.start();
    }
}

class A extends Thread { // no momento em que extendo de Thread, a classe não é mais uma classe comum, é uma Thread
    public void run () {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1); // definir o tempo que voce quer que essa thread fique em pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run () {
        for (int i = 0; i < 100; i++) {
            System.out.println("Ola");
            try {
                Thread.sleep(1); // definir o tempo que voce quer que essa thread fique em pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}