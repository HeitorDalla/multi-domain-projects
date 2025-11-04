class Carro {
    // variavies de cada objeto instanciado (variavel de instancia)
    String nome;
    double price;

    // variavel estatica (variavel de classe - não pertence aos objetos) (comum a todos o objetos)
    static double limiteVelocidade;

    public void show () {
        System.out.println(nome + price + limiteVelocidade);
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
        c2.price = 80000; // errado - não posso relacionar ao objeto, e sim, com a classe
        c2.limiteVelocidade = 150;
        Carro.limiteVelocidade = 150; // esta sobreescrevendo pois é o delimitador comum
        

        c1.show();
        c2.show();
    }
}