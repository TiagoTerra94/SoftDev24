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

//Crie uma função que retorne 1 valor numerico gerado valido entre x e y

function valorNumerico(min,max){
    return console.log(Math.floor(Math.random()*(max-min) + (min+1)))
}


//exercicio, somar dois numero com prompt
n1 = parseInt(prompt ("Numero 1: "))
n2 = parseInt(prompt ("Numero 2: "))
alert(n1+n2)

//texto e vetores
let texto = "Vamos programar"

//indice 0 até N-1 (N é o nr de elementos)
console.log(texto[0])
console.log(texto.charAt(6))
console.log(texto.charAt(texto.length-1))
console.log(texto.indexOf('a'))

//fatiar texto
let texto = "Vamos programar"

console.log(texto.slice(0,5)) //retorna string
console.log(texto.slice(-3))//vai à volta

palavras = texto.split(" ")
console.log(palavras)
console.log(palavras[1].toLowerCase())
console.log(palavras[0].toUpperCase())
*/

//Exercicio, funcao a receber string e retorne todas as vogais em maiusculas
const text = "Eu sou o maior da minha aldeia"
    vowels= "aeiou"

function replaceVowels(){
    temp = ""
    for (let i = 0; i< text.length; i ++){
        //busca a vogal no array text e adiciona na temp em maiuscula
        if(vowels.includes(text[i])) temp += text[i].toUpperCase()
            else temp += text[i]
    }
    return temp
}

console.log(replaceVowels(text))
