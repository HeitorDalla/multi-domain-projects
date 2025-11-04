/* Escrever uma função que aceite uma matriz de 10 números inteiros (entre 0 e 9) e que retorne uma sequência desses números no formato de um número de telefone */

function createPhoneNumber(numbers){
    let string = numbers.join('');
    return `(${string.slice(0, 3)}) ${string.slice(3, 6)}-${string.slice(6)}`;
}

console.log(createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0])) // (123) 456-7890