# # Você receberá uma matriz de objetos (matrizes associativas em PHP, tabelas em COBOL) representando dados sobre desenvolvedores que se inscreveram para participar do próximo encontro de codificação que você estiver organizando.

# # Sua tarefa é retornar uma matriz onde cada objeto terá uma nova propriedade 'greeting' com o seguinte valor de string:

# # Olá < firstName aqui >, o que você mais gosta em < language here >?

def cumprimento (lista):
    for i in lista:
        i['greeting'] = f"Hi {i['firstName']}, what do you like the most about {i['language']}?"
        
    return lista
        
list1 = [
    { 'firstName': 'Sofia', 'lastName': 'I.', 'country': 'Argentina', 'continent': 'Americas', 'age': 35, 'language': 'Java' },
    { 'firstName': 'Lukas', 'lastName': 'X.', 'country': 'Croatia', 'continent': 'Europe', 'age': 35, 'language': 'Python' },
    { 'firstName': 'Madison', 'lastName': 'U.', 'country': 'United States', 'continent': 'Americas', 'age': 32, 'language': 'Ruby' } 
]

cumprimentos = cumprimento(list1)

for i in cumprimentos:
    print(i)