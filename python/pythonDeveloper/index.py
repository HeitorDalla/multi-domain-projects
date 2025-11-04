# Você receberá um conjunto de objetos (conjuntos associativos em PHP) representando dados sobre desenvolvedores que se inscreveram para participar do próximo encontro de programação que você está organizando. A lista é ordenada de acordo com quem se inscreveu primeiro.

# Sua tarefa é retornar uma das seguintes strings:

# < firstName here >, < country here > do primeiro desenvolvedor Python que se inscreveu; ou
# There will be no Python developersse nenhum desenvolvedor Python estiver inscrito.

def get_first_python(users):
    for user in users:
        if (user['language'] == 'Python'):
            return "{}, {}" .format(user['first_name'], user['country'])
    
    return "There will be no Python developers"

list1 = [
  { "first_name": "Mark", "last_name": "G.", "country": "Scotland", "continent": "Europe", "age": 22, "language": "JavaScript" },
  { "first_name": "Victoria", "last_name": "T.", "country": "Puerto Rico", "continent": "Americas", "age": 30, "language": "Python" },
  { "first_name": "Emma", "last_name": "B.", "country": "Norway", "continent": "Europe", "age": 19, "language": "Clojure" }
]

print(get_first_python(list1))