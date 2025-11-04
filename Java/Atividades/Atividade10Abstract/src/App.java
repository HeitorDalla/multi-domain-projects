import br.edu.unicesumar.classes.Corrente;
import br.edu.unicesumar.classes.Acao;
import br.edu.unicesumar.classes.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Acao(); // NÃO É POSSIVEL CRIAR UM OBJETO DA CLASSE ABSTRATA, POR ISSO, CRIAMOS COM A CLASSE QUE REALMENTE IMPLEMENTA O MÉTODO
        conta.sacar();

        Conta contaCorrent = new Corrente();
        contaCorrent.sacar();
    }
}