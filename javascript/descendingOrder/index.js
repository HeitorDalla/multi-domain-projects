/* Criar uma função que possa receber qualquer número inteiro não negativo como argumento e retorná-lo com seus dígitos em ordem decrescente */

function descendingOrder(n) {
    return parseInt(n.toString().split('').sort((a, b) => b - a).join(''));
}

console.log(descendingOrder(42145)) // 54421