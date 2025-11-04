// # Você receberá uma matriz de objetos representando dados sobre desenvolvedores que se inscreveram para participar do encontro de codificação que você está organizando pela primeira vez.

// Sua tarefa é retornar o número de desenvolvedores JavaScript vindos da Europa

function contagem (lista) {
    let cont = 0
    
    lista.forEach(obj => {
        if ((obj.continent == 'Europe') & (obj.language == 'JavaScript')) {
            cont ++
        }
    });

    return cont
}

const lista = [
    { 'firstName': 'Noah', 'lastName': 'M.', 'country': 'Switzerland', 'continent': 'Europe', 'age': 19, 'language': 'JavaScript' },
    { 'firstName': 'Maia', 'lastName': 'S.', 'country': 'Tahiti', 'continent': 'Oceania', 'age': 28, 'language': 'JavaScript' },
    { 'firstName': 'Shufen', 'lastName': 'L.', 'country': 'Taiwan', 'continent': 'Asia', 'age': 35, 'language': 'HTML' },
    { 'firstName': 'Sumayah', 'lastName': 'M.', 'country': 'Tajikistan', 'continent': 'Asia', 'age': 30, 'language': 'CSS' }
]

console.log(contagem(lista))