// Você receberá uma matriz de objetos (matrizes associativas em PHP, tabelas em COBOL) representando dados sobre desenvolvedores que se inscreveram para participar do próximo encontro de codificação que você estiver organizando.

//Sua tarefa é retornar:

// truese todos os desenvolvedores da lista codificarem na mesma linguagem; ou
// falsede outra forma.

function isSameLanguage(list) {
    let linguagens = []

    list.forEach((person) => {
        linguagens.push(person.language)
    });
    
    const filter = linguagens.every((linguagem) => {
        return linguagem === linguagens[0]
    })

    return filter
}

var list1 = [
    { firstName: 'Daniel', lastName: 'J.', country: 'Aruba', continent: 'Americas', age: 42, language: 'JavaScript' },
    { firstName: 'Kseniya', lastName: 'T.', country: 'Belarus', continent: 'Europe', age: 22, language: 'JavaScript' },
    { firstName: 'Hanna', lastName: 'L.', country: 'Hungary', continent: 'Europe', age: 65, language: 'JavaScript' },
];

console.log(isSameLanguage(list1))