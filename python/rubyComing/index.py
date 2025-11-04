# Você receberá uma matriz de objetos (matrizes associativas em PHP) representando dados sobre desenvolvedores que se inscreveram para participar do próximo encontro de codificação que você estiver organizando.

# Sua tarefa é retornar:

# true se pelo menos um desenvolvedor Ruby tiver se inscrito; ou
# falsese não houver desenvolvedores Ruby.

def is_ruby_coming(lst):
    for obj in lst:
        if obj['language'] == 'Ruby':
            return True
        
    return False

list1 = [
    { 'firstName': 'Sofia', 'lastName': 'I.', 'country': 'Argentina', 'continent': 'Americas', 'age': 35, 'language': 'Java' },
    { 'firstName': 'Lukas', 'lastName': 'X.', 'country': 'Croatia', 'continent': 'Europe', 'age': 35, 'language': 'Python' },
    { 'firstName': 'Madison', 'lastName': 'U.', 'country': 'United States', 'continent': 'Americas', 'age': 32, 'language': 'Ruby' } 
]

print(is_ruby_coming(list1))