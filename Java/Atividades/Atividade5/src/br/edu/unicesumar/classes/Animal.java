public class Animal {
    public String nome_animal;
    public double peso_animal;

    public void cadastrar_animal (String nome_animal, double peso_animal) {
        this.nome_animal = nome_animal;
        this.peso_animal = peso_animal;
        
        System.out.println("Animal cadastrado: " + nome_animal + " - Peso: " + peso_animal);
    }
}