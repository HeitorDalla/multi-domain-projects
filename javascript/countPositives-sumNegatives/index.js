/* Retornar uma matriz, onde o primeiro elemento é a contagem de números positivos e o segundo elemento é a soma de números negativos. 0 não é positivo nem negativo */

function countPositivesSumNegatives(numbers) {
    if (!Array.isArray(numbers) || numbers.length === 0) {
        return [];
    }
    
    let sum = 0;
    let cont = 0;

    numbers.forEach((number) => {
        if (number > 0) {
            cont ++;
        } else if (number < 0) {
            sum += number;
        }
    });

    return [cont, sum];
};

console.log(countPositivesSumNegatives([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])) // [10, -65]