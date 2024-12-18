const prompt = require('prompt-sync')()

/* const nums = [1,2,3,4,6,8,9,8,6,5,12,15,20]
//filtrar pares
const pares = nums.filter((val) => val%2 ==0)
console.log(pares)

//filtrar mais que 10
const maiores = nums.filter((val2) => val2>10 )
console.log(maiores) 



const pessoas = [
    {nome: "Pedro", idade: 23},
    {nome: "Afonseca", idade: 41},
    {nome: "Ana", idade: 19}
]

/* //filtrar pessoas com idade < 30
const trinta = pessoas.filter((person) => person.idade < 30)
console.log(trinta)
//filtrar todas as pessoas cujo nome em menos que 4 caracteres
const nameChar = pessoas.filter((person) => person.nome.length <4)
console.log(nameChar)
//filtrar todas as pessoas cujo nome começa pela letra A
const nameA = pessoas.filter((person) => person.nome.toLowerCase().startsWith("a"))
console.log(nameA) 

//Caso nao exista a chave job na primeira pessoa defini-la com o valor de Formador
if(!("Job" in pessoas [0])) pessoas[0].job = "Formador"
console.log(pessoas[0])*/


const numeros = [1,2,3,4,6,8,9,8,6,5,12,15,20]

const double = numeros.map((val)=>val*2)
console.log(double)
 
const pessoa = {
    name : "Maria",
    job : "Secretary",
    city : "Coimbra",
    salary : 3220.89,
    print() {
        console.log(`${this.name} ganha ${this.salary}€!`)
    }
}
 
pessoa.print()