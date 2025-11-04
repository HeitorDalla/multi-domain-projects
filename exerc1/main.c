#include <stdio.h>
#include <stdlib.h>

void listagemPares (int numeros[])
{
    printf("A listagem dos numeros pares é: ");
    for (int i=0; i<10; i++) {
        if (numeros[i] % 2 == 0) {
            printf("O numero %d é par.", numeros[i]);
            printf("\n");
        }
    }
    printf("\n");
}

void listagemImpares (int numeros[])
{
    for (int i=0; i<10; i++) {
        if (numeros[i] % 2 != 0) {
            printf("\n O número %d é impar.", numeros[i]);
            printf("\n");
        }
    }
    printf("\n");
}

void somaPares (int numeros[])
{
    float somaPar=0;
    printf("\n A soma dos numeros pares é: ");
    for (int i=0; i<10; i++) {
        if (numeros[i] % 2 == 0) {
            somaPar += numeros[i];
        }
    }
    printf("\n %f", somaPar);
}

void somaImpares (int numeros[])
{
    float somaImpar=0;
    printf("\n A soma dos numeros impares é: ");
    for (int i=0; i<10; i++) {
        if (numeros[i] % 2 != 0) {
            somaImpar += numeros[i];
        }
    }
    printf("\n %f", somaImpar);
}

int main()
{
    int numeros[10];

    int opcao=0;

    for(int i=0; i<10; i++) {
        printf("\n Digite um número: ");
        scanf("%d", & numeros[i]);
    }

    printf("\n ----- Menu -----");
    printf("\n 11 - Listagem dos numeros pares");
    printf("\n 22 - Listagem dos numeros impares");
    printf("\n 33 - A soma dos numeros pares");
    printf("\n 44 - A soma dos numeros impares");

    printf("\n Qual das operacoes voce deseja? ");
    scanf("%d", & opcao);

    switch (opcao) {
        case 11:
            listagemPares(numeros);
            break;
        case 22:
            listagemImpares(numeros);
            break;
        case 33:
            somaPares(numeros);
            break;
        case 44:
            somaImpares(numeros);
            break;
    }

    return 0;
}
