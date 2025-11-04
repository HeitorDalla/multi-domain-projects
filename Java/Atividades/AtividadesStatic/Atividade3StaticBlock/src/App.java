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

    // toda vez que o programa compilar, o método estatico ira ser executado apenas uma vez
    // se tiver um objeto em instancia, ele (metodo estatico) vira primeiro que qualquer um
    // caso nao tenha nenhum objeto instanciado, ele pode chamar o método estatico 'forName' para carregar uma classe dinamicamente em tempo de execução
    static {
        limiteVelocidade = 80;
        System.out.println("é um bloco estatico!");
        System.out.println(limiteVelocidade);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Carro c1 = new Carro();

        // c1.nome = "Lambor";
        // c1.price = 450000;
        // c1.limiteVelocidade = 120; // errado - não posso relacionar ao objeto, e sim, com a classe
        // Carro.limiteVelocidade = 120;

        Class.forName("Carro"); 
    }
}