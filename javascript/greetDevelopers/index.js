// Você receberá uma matriz de objetos (matrizes associativas em PHP, tabelas em COBOL) representando dados sobre desenvolvedores que se inscreveram para participar do próximo encontro de codificação que você estiver organizando.

// Sua tarefa é retornar uma matriz onde cada objeto terá uma nova propriedade 'greeting' com o seguinte valor de string:

// Olá < firstName aqui >, o que você mais gosta em < language here >?

function cumprimento (lista) {
    const cumprimentos = lista.map((obj) => {
        obj.greeting = `Hi ${obj.firstName}, what do you like the most about ${obj.language}?`
        return obj
    })

    return cumprimentos
}

let list1 = [
    { 'firstName': 'Sofia', 'lastName': 'I.', 'country': 'Argentina', 'continent': 'Americas', 'age': 35, 'language': 'Java' },
    { 'firstName': 'Lukas', 'lastName': 'X.', 'country': 'Croatia', 'continent': 'Europe', 'age': 35, 'language': 'Python' },
    { 'firstName': 'Madison', 'lastName': 'U.', 'country': 'United States', 'continent': 'Americas', 'age': 32, 'language': 'Ruby' } 
]

const pessoas = cumprimento(list1)

pessoas.forEach((pessoa) => {
    console.log(pessoa)
});