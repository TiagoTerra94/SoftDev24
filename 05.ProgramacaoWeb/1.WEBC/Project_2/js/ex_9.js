const arr = []
const arr2 = ["Text", 12,13.14, true,[1,2,3,4]]

console.log(arr2[0].toLowerCase())
console.log(arr2[4][0])

arr2[0] = "mudaste?"//supostamente constantes sao imutaveis
//o conteudo em si é mutavel
console.log(arr2)