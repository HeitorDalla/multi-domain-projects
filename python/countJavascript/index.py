# Você receberá uma matriz de objetos representando dados sobre desenvolvedores que se inscreveram para participar do encontro de codificação que você está organizando pela primeira vez.

# Sua tarefa é retornar o número de desenvolvedores JavaScript vindos da Europa .

def count_developers(lst):
    cont = 0
    
    for i in lst:
        if (i['continent'] == 'Europe') and (i['language'] == 'JavaScript'):
            cont += 1
        else:
            continue
                
    return cont

lst1 = [
    { 'firstName': 'Noah', 'lastName': 'M.', 'country': 'Switzerland', 'continent': 'Europe', 'age': 19, 'language': 'JavaScript' },
    { 'firstName': 'Maia', 'lastName': 'S.', 'country': 'Tahiti', 'continent': 'Oceania', 'age': 28, 'language': 'JavaScript' },
    { 'firstName': 'Shufen', 'lastName': 'L.', 'country': 'Taiwan', 'continent': 'Asia', 'age': 35, 'language': 'HTML' },
    { 'firstName': 'Sumayah', 'lastName': 'M.', 'country': 'Tajikistan', 'continent': 'Asia', 'age': 30, 'language': 'CSS' }
]

print(count_developers(lst1))