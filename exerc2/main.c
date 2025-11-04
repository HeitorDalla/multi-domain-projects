#include <stdio.h>
#include <stdlib.h>

struct aluno
{
    int codigo[5], tempoServico[5];
    float salario[5];
};

void relatorioNaoAumento(struct aluno funcionario) {
    printf("\nTodos os funcionários que NÃO terão um aumento:\n");
    for (int i = 0; i < 5; i++) {
        if ((funcionario.tempoServico[i] < 5) && (funcionario.salario[i] > 800)) {
            printf("\n O funcionário de código %d NÃO terá um aumento.\n", funcionario.codigo[i]);
        }
    }
}

void relatorioAumento(struct aluno funcionario) {
    printf("\nTodos os funcionários que TERÃO um aumento:\n");
    for (int i = 0; i < 5; i++) {
        float salarioAtual = funcionario.salario[i];
        float novoSalario;

        if (funcionario.tempoServico[i] > 5 && funcionario.salario[i] < 800) {
            novoSalario = salarioAtual + (salarioAtual * 0.35);
        } else if (funcionario.tempoServico[i] > 5) {
            novoSalario = salarioAtual + (salarioAtual * 0.25);
        } else if (funcionario.salario[i] > 800) {
            novoSalario = salarioAtual + (salarioAtual * 0.15);
        } else {
            continue;
        }

        printf("\n O funcionário de código %d terá um novo salário: %.2f\n", funcionario.codigo[i], novoSalario);
    }
}

void sair ()
{
    printf("\n Saindo ...");
}

int main()
{
    struct aluno funcionario;

    int opcao=0;

    for (int i=0; i<5; i++) {
        printf("\n Digite o codigo do funcionario: ");
        scanf("%d", &funcionario.codigo[i]);
        printf("\n Digite o salario do funcionario: ");
        scanf("%f", &funcionario.salario[i]);
        printf("\n Digite o tempo de servico do funcionario: ");
        scanf("%d", &funcionario.tempoServico[i]);
        printf("\n");
    }

    printf("\n ----- Menu -----");
    printf("\n A - Relatório com os códigos dos funcionarios que nao terao aumento");
    printf("\n B - Relatório com os códigos e os novos salarios dos funcionarios que terao aumento");
    printf("\n C - SAIR");

    printf("\n Qual sera a sua opcao? ");
    scanf(" %c", &opcao);

    switch (opcao)
    {
        case 'A':
            relatorioNaoAumento(funcionario);
            break;
        case 'B':
            relatorioAumento(funcionario);
            break;
        case 'C':
            sair();
            break;
    }

    return 0;
}
