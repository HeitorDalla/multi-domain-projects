import br.edu.unicesumar.classes.Cliente;
import br.edu.unicesumar.classes.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        // INSTANCIAR O CLIENTE
        Cliente cliente = new Cliente();

        cliente.setNome("Marcio");
        cliente.setTelefone("4399999999");
        cliente.setEndereco("Rua Pamonha 7890");

        System.out.println(cliente.imprimirDados());

        System.out.println("-----------------------");

        // INSTANCIAR A PESSOA JURIDICA
        PessoaJuridica pj = new PessoaJuridica();

        pj.setNome("Heitor");
        pj.setTelefone("Exemplo de telefone");
        pj.setEndereco("Exemplo de endereco");

        System.out.println(pj.imprimirDados());
    }
}