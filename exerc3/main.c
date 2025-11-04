#include <stdio.h>
#include <stdlib.h>


float mediaNumeros (int vetor[5])
{
    float soma=0;
    for (int i=0; i<5; i++) {
        soma += vetor[i];
    }
    return soma;
}

void contadorMedia (float mediaValores, int vetor[5])
{
    for (int i=0; i<5; i++) {
        if (vetor[i] > mediaValores) {
            printf("\n %d", vetor[i]);
        }
    }
}


int main()
{
    int numero[5];

    for (int i=0; i<5; i++) {
        printf("\n Digite um numero? ");
        scanf("%d", &numero[i]);
    }

    float soma = mediaNumeros(&numero);

    float media = soma / 5.0;

    printf("\n A media dos valores é: %f", media);

    printf("\n Os numeros que sao maiores do que a media é: ");

    contadorMedia(media, &numero);

    return 0;
}
