public class App {
    public static void main(String[] args) throws Exception {
        // Setar apenas 1 enum
        int i = 404;
        Status status = Status.Failed;

        System.out.println(status);

        // Armazenar todos os ENUMS
        Status[] todosStatus = Status.values();

        for (Status status2 : todosStatus) {
            System.out.println(status2 + " " + status2.ordinal()); // vai imprimir o status e a sua posicao
        }

        // Usar com if else
        Status statusComparacao = Status.Failed;

        if (statusComparacao == Status.Running) {
            System.out.println("Esta rodando...");
        } else if (statusComparacao == Status.Failed) {
            System.out.println("Falhou...");
        } else if (statusComparacao == Status.Pending) {
            System.out.println("Aguarde...");
        } else if (statusComparacao == Status.Success) {
            System.out.println("Sucesso...");
        } else {
            System.out.println("Nenhum status");
        }

        // Usar com switch
        Status statusComparacaoSwitch = Status.Success;

        switch (statusComparacaoSwitch) {
            case Running:                
                System.out.println("Esta rodando...");
                break;

            case Failed:
                System.out.println("Falhou...");
                break;

            case Pending:
                System.out.println("Aguarde...");
                break;

            case Success:
                System.out.println("Sucesso...");
                break;
        
            default:
                System.out.println("Nenhum status");
                break;
        }

    }
}

enum Status {
    Running, Failed, Pending, Success // São constantes
}