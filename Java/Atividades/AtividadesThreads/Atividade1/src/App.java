public class App {
    public static void main(String[] args) throws Exception {
        // TRABALHAR COM PRIORIDADES (VAI DE 1 À 10) - definir prioridades diferentes paras as threads
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        // PARA USAR O 'RUNNABLE', PODE-SE CRIAR DUAS DIFERENTES THREADS
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

class A implements Runnable { // no momento em que extendo de Thread, a classe não é mais uma classe comum, é uma Thread
    public void run () {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1); // definir o tempo que voce quer que essa thread fique em pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run () {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ola");
            try {
                Thread.sleep(1); // definir o tempo que voce quer que essa thread fique em pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}