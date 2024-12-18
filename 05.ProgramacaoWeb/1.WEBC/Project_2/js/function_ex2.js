const prompt = require('prompt-sync')()
 
const peopleVec = []
 
function insertPerson() {
    console.log("\nInserir pessoa:\n")
    // nome idade localidade
    name = prompt("Nome: ")
    city = prompt("Localidade: ")
    while(true) {
        const age = prompt("Idade: ")
        if(!isNaN(age) && Number.isInteger(parseInt(age))) return {name, city, age}
        else console.log("\nErro: Por favor insira um valor inteiro!\n")
    }
}
 
function insertPersons(vec) {
    while(true) {
        op = prompt("Deseja inserir mais uma pessoa? (s/n) ")
        if (op.toLowerCase() === "s") {
            vec.push(insertPerson())
        }
        else if (op.toLowerCase() === "n") {
            break
        }
        else console.log("\nErro: operação inválida!\n")
 
    }
}
 
function printPeople(peopleVec) {
    console.log("\nListagem de Pessoas\n")
    if(peopleVec.length > 0) {
        peopleVec.forEach(person => {
            console.log(`Nome: ${person.name}\nIdade: ${person.age} anos\tLocalidade: ${person.city}`)
        });
    }
    else console.log("Não foram adicionadas pessoas")
}
 
insertPersons(peopleVec)
printPeople(peopleVec)