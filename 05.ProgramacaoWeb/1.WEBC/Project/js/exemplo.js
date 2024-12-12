/*
//variaveis e constantes

//nao recomendavel, mas da para redeclarar
var x = 3
//recomendavel
let y = 3



const nome = "Pedro"

let age = 12
console.log("O " + nome + " tem " + age + " anos.")

//Template String
console.log(`O ${nome} tem ${age} anos`)

console.log(typeof nome)
*/

/*EX01
const name1 = "Maria"
const surname = "Pereira"
const weight = 55
const height = 1.67

const IMC = (weight / (height * height)).toFixed(2)

console.log(`O IMC do(a) ${name1} ${surname} é de ${IMC}`)
*/

/*SABER SE É INTEIRO OU FLOAT
num1 = 3.13
 
console.log(Number.isInteger(num1))

if (typeof num1 == "number"){
    console.log("Number!")
}

MATH
const pi= 3.1415

console.log(Math.floor(pi))
console.log(Math.ceil(pi))
console.log(Math.random())

//EX02 Gerar 10 nums inteiros entre 1 e 100


function generateRandomNumbers(number){
    for(let i=0; i<number;i++){
        console.log(Math.floor(Math.random()*100))
    }
}

generateRandomNumbers(5)
*/
//Crie uma função que retorne 1 valor numerico gerado valido entre x e y

function valorNumerico(min,max){
    return console.log(Math.floor(Math.random()*(max-min) + (min+1)))
}

val = numericValueInterval(10, 20)