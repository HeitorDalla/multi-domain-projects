import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Animal animal = new Animal();
        Medico medico = new Medico();

        int opcao;
        
        do {
            System.out.println("-- Opções --");
            System.out.println("1 - Agendamento");
            System.out.println("2 - Cadastro de Animal");
            System.out.println("3 - Cadastro de Médico");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao != 0) {
                configuracao(opcao, animal, medico);
            }

        } while (opcao != 0);
    }

    public static void configuracao (int opcao, Animal animal, Medico medico) {
        Scanner scanner = new Scanner(System.in);

        switch (opcao) {
            case 1:
                // Validação antes de agendar
                if (animal.nome_animal == null || medico.nome_medico == null) {
                    System.out.println("Antes de agendar, cadastre um animal ou um médico!");
                    break;
                }

                System.out.println("Qual o dia voce deseja fazer a consulta? ");
                String dia = scanner.nextLine();

                System.out.println("Qual animal voce deseja ver? ");
                String nome_animal_ver = scanner.nextLine();

                // Validação se o animal ja foi cadastrado
                if (!nome_animal_ver.equalsIgnoreCase(animal.nome_animal)) {
                    System.out.println("Esse animal não esta cadastrado!");
                } else {
                    System.out.println("Agendamento feito.");
                }

                break;
            case 2:
                System.out.println("Qual vai ser o nome do animal? ");
                String nome_animal = scanner.nextLine();

                System.out.println("Qual é o peso do animal? ");
                double peso_animal = scanner.nextDouble();
                scanner.nextLine();

                animal.cadastrar_animal(nome_animal, peso_animal);

                break;
            case 3:
                System.out.println("Qual vai ser o nome do médico? ");
                String nome_medico = scanner.nextLine();

                System.out.println("Qual a licença do médico? ");
                double licenca_medico = scanner.nextDouble();
                scanner.nextLine();

                medico.cadastrar_medico(nome_medico, licenca_medico);

                break;
            default:
                throw new AssertionError();
        }
    }
}