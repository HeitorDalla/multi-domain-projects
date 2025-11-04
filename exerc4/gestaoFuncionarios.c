#include <stdio.h>
#include <stdlib.h>

int main()
{
    struct Funcionario{
        int idFuncionario;
        char nome[50];
        char cargo[30];
        float salario;
        int idade;
    };

    struct Funcionario funcionarios[20];
    int quantidadeFuncionarios = 0;
    char pergunta;
    int i, idBuscado, index;
    float somaSalarios = 0;

    while (1) {
        printf("\n --- Menu de opções ---\n ");
        printf("1 - Cadastrar funcionário\n");
        printf("2 - Listar funcionários");
        printf("3 - Pesquisar funcionário\n");
        printf("4 - Atualizar dados\n");
        printf("5 - Excluir funcionário\n");
        printf("6 - Calcular Média Salarial\n");
        printf("7 - Sair do programa\n");

        printf("Escolha uma das opções: ");
        scanf(" %c", &pergunta);

        switch (pergunta)
        {
        case '1': { // Cadastrar funcionário
            if (quantidadeFuncionarios < 20) {
                printf("Digite o que voce quiser")
                printf("Digite o ID do funcionário: ");
                scanf(" %d", &funcionarios[quantidadeFuncionarios].idFuncionario);
                printf("Digite o nome do funcionário: ");
                fflush(stdin);
                gets(funcionarios[quantidadeFuncionarios].nome);
                printf("Qual o cargo do funcionário: ");
                fflush(stdin);
                gets(funcionarios[quantidadeFuncionarios].cargo);
                printf("Qual vai ser o salário do funcionario: ");
                scanf(" %f", &funcionarios[quantidadeFuncionarios].salario);
                printf("Digite a idade do funcionário: ");
                scanf(" %d", &funcionarios[quantidadeFuncionarios].idade);

                quantidadeFuncionarios += 1;

                printf("Funcionario cadastrado!");
            } else {
                printf("Limite de funcionarios atingidos!");
            }
            break;
        }
        case 2: { // Listagem dos funcionarios cadastrados
            if (quantidadeFuncionarios == 0) {
                printf("Não ha nenhum funcionario cadastrado!");
            } else {
                printf("Todos os funcionários cadastrados: ");
                for (int i = 0; i < quantidadeFuncionarios; i++) {
                    printf("Id: %d, Nome: %s, Cargo: %s, Salário: %f, Idade: %d", funcionarios[i].idFuncionario, funcionarios[i].nome, funcionarios[i].cargo, funcionarios[i].salario, funcionarios[i].idade);
                }
            }
            break;
        }
        case 3: { // Pesquisar informações de um usuário
            printf("Digite o Id do funcionário que deseja buscar informações: ");
            scanf(" %d", &idBuscado);
            for (i = 0; i < quantidadeFuncionarios; i++) {
                if (funcionarios[i].idFuncionario == idBuscado) {
                    printf("Id: %d, Nome: %s, Cargo: %s, Salário: %f, Idade: %d", funcionarios[i].idFuncionario, funcionarios[i].nome, funcionarios[i].cargo, funcionarios[i].salario, funcionarios[i].idade);
                    break;
                }
            }
            if (i == quantidadeFuncionarios) {
                printf("Funcionário não encontrado!");
            }
            break;
        }
        case 4: { // Atualização de dados cadastrados
            printf("Digite o id do funcionário o qual deseja atualizar: ");
            scanf(" %d", &idBuscado);
            for (i = 0; i < quantidadeFuncionarios; i++) {
                if (funcionarios[i].idFuncionario == idBuscado) {
                    printf("Digite o novo salário: ");
                    scanf(" %f", &funcionarios[i].salario);
                    printf("Salario atualizado!");
                    break;
                }
            }
            if (i == quantidadeFuncionarios) {
                printf("Funcionário não encontrado!");
            }
            break;
        }
        case 5: { // Excluir funcionário ja cadastrado
            printf("Digite qual o id de funcionario voce quer excluir: ");
            scanf(" %d", &idBuscado);
            int encontrado = 0;
            for (i = 0; i < quantidadeFuncionarios; i++) {
                if (funcionarios[i].idFuncionario == idBuscado) {
                    for (int j = i; j < quantidadeFuncionarios - 1; j++) {
                        funcionarios[j] = funcionarios[j + 1];
                    }
                    quantidadeFuncionarios--;
                    printf("Funcionário excluído com sucesso!\n");
                    encontrado = 1;
                    break;
                }
            }
            if (!encontrado) {
                printf("Funcionário não encontrado!");
            }
            break;
        }
        case 6: { // Definir média salarial de todos os funcionários
            if (quantidadeFuncionarios == 0) {
                printf("Não ha nenhum funcionario cadastrado.");
            } else {
                somaSalarios = 0.0;
                for (i = 0; i < quantidadeFuncionarios; i++) {
                    somaSalarios += funcionarios[i].salario;
                }
                printf("A média salarial de todos os funcionários cadastrados é: %f", somaSalarios / quantidadeFuncionarios);
            }
            break;
        }
        case 7: {
            printf("Saindo do programa...");
            return 0;
        }
        default:
            printf("Opção nao localizada. Tente novamente");
        }
    }
    return 0;
}
