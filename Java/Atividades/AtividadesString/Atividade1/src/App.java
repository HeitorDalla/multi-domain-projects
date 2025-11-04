public class App {
    public static void main(String[] args) throws Exception {
        // As string são imutáveis - depois de criar o objeto, não tem mais como altera-lo
        String name = "Heitor";

        System.out.println(name);

        // o que acontece aqui é a criação de um novo objeto na memória head, não a alteração de um endereço de objeto
        name = name + " Gilmar"; 

        System.out.println(name);
    }
}