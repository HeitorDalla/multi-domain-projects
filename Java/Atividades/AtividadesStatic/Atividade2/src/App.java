class Carro {
    // variavies de cada objeto instanciado (variavel de instancia)
    String nome;
    double price;

    // variavel estatica (variavel de classe - não pertence aos objetos) (comum a todos o objetos)
    static double limiteVelocidade;

    public void show () {
        System.out.println(nome + price + limiteVelocidade);
    }

    // Demonstrando que não podemos usar DIRETAMENTE uma variavel não estatica dentro de um método estatico
    // public static void show1 () {
    //     System.out.println("Isso é um método estatico!"); // Não precisa da instancia da classe
    //     System.out.println(nome + price + limiteVelocidade); // não posso usar variavies não estaticas dentro de um metodo estatico, apenas variaveis estaticas
    // }

    // Demonstrando que podemos passar como referencia para o método, que assim, podemos utilizar variaveis não estaticas dentro de metodos estaticos
    public static void show2 (Carro obj) {
        System.out.println("Isso é um método estatico!"); // Não precisa da instancia da classe
        System.out.println(obj.nome + obj.price + limiteVelocidade); // não posso usar variavies não estaticas dentro de um metodo estatico, apenas variaveis estaticas
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro();

        c1.nome = "Lambor";
        c1.price = 450000;
        c1.limiteVelocidade = 120; // errado - não posso relacionar ao objeto, e sim, com a classe
        Carro.limiteVelocidade = 120;

        Carro c2 = new Carro();
        c2.nome = "Jaguar";
        c2.price = 80000;
        c2.limiteVelocidade = 150;
        Carro.limiteVelocidade = 150; // esta sobreescrevendo pois é o delimitador comum
        
        c1.show();
        c2.show();

        // Carro.show(); // eu nao posso chamar um método não estatico sem instancia-lo

        Carro.show2(c1);
    }
}