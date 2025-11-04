# Você receberá uma matriz de objetos (matrizes associativas em PHP, tabelas em COBOL, dicionários em Python) representando dados sobre desenvolvedores que se inscreveram para participar do próximo encontro de codificação que você estiver organizando.

# Sua tarefa é retornar um objeto (matriz associativa em PHP, tabela em COBOL, dicionário em Python) que inclui a contagem de cada linguagem de codificação representada no encontro .

def count_languages(lst):
    objeto = {}

    for obj in lst:
        linguagem = obj['language']

        if (linguagem not in objeto):
            objeto[linguagem] = 1
        else:
            objeto[linguagem] += 1

    return objeto

list1 = [
    { 'firstName': 'Noah', 'lastName': 'M.', 'country': 'Switzerland', 'continent': 'Europe', 'age': 19, 'language': 'C' },
    { 'firstName': 'Anna', 'lastName': 'R.', 'country': 'Liechtenstein', 'continent': 'Europe', 'age': 52, 'language': 'JavaScript' },
    { 'firstName': 'Ramon', 'lastName': 'R.', 'country': 'Paraguay', 'continent': 'Americas', 'age': 29, 'language': 'Ruby' },
    { 'firstName': 'George', 'lastName': 'B.', 'country': 'England', 'continent': 'Europe', 'age': 81, 'language': 'C' },
]

print(count_languages(list1))