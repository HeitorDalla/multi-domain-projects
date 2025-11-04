import br.edu.unicesumar.classes.Funcionario;
import br.edu.unicesumar.classes.Diretor;
import br.edu.unicesumar.classes.Gerente;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Gerente();
        System.out.println(funcionario.bonificacao());
    }
}