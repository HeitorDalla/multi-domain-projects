import br.edu.unicesumar.classes.Funcionario;
import br.edu.unicesumar.classes.Assistente;
import br.edu.unicesumar.classes.Tecnico;

public class App {
    public static void main(String[] args) throws Exception {
        // INSTANCIAR O CLIENTE
        Funcionario funcionario = new Funcionario();
        System.out.println(funcionario.exibeDados());
        System.out.println(funcionario.ganhoAnual());
    }
}