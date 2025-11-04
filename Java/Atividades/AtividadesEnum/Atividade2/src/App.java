public class App {
    public static void main(String[] args) throws Exception {        
        Laptop laptop = Laptop.Macbook;

        System.out.println(laptop);
        System.out.println(laptop.getPrice());

        // Percorrer todos os precos dos laptops
        for (Laptop cadaLaptop : Laptop.values()) {
            System.out.println(cadaLaptop + " : " + cadaLaptop.getPrice());
        }
    }
}

enum Laptop {
    // DEFINIÇÃO DAS CONSTANTES
    Macbook(2000),
    Dell(2200),
    Surface(),
    ThinkPad(1000);

    // DEFINIÇÃO DOS CAMPOS
    private int price;

    // DEFINIÇÃO DO CONSTRUTOR (SEMPRE PRIVADO)
    private Laptop () {};
    
    private Laptop(int price) {
        this.price = price;
    }
    // O CONSTRUTOR SEMPRE SERÁ PRIVADO POR ESTAMOS CRIANDO OS OBJETOS DESSA CLASSE DENTRO DA PRÓPRIA CLASSE

    // DEFINIÇÃO DOS MÉTODOS
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}