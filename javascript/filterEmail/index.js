/* Escrever uma função que recebe um array de pares de nomes de login e e-mails e gera um array com todos os pares de nomes de login e e-mails dos nomes de login que terminam em "_" */

function searchNames( logins ){
  return logins.filter((login) => login[0].endsWith("_"));
}

console.log(searchNames([ [ "foo", "foo@foo.com" ], [ "bar_", "bar@bar.com" ] ])); // [ [ "bar_", "bar@bar.com" ] ]