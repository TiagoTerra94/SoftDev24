console.log("Hello")
console.log("O meu nome é Tiago")

//constantes e imprimir no console da pagina
const nome = "Maria"
const peso = 55.5
const altura = 1.65

const imc = peso / (altura * altura)
console.log("O IMC do/da " + nome + " é: " + imc)

//Com template String
console.log(`A/O ${nome} possui um imc total de: ${imc}`)

//numeros e operaçoes
let num1 = 2
let num2 = 5

let res = num1 + num2
console.log(`O resultado da soma do ${num1} + ${num2} é: ${res}`)

//confirmaçao pop up
//const action = confirm("Confirma?")

//Inserção de nome a partir de  um pop up
const nome1 = prompt("Indique o seu nome: ")