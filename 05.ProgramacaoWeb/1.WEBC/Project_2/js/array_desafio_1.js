/* const prompt = require('prompt-sync')()
let vect =[]

let soma = 0;
let i = 0;
let num

console.log("Insira um numero: (0 para Sair)")
do{  
    num = prompt("Valor: ")
    if(isNaN(num)) console.log("\n Erro: valor inserido inválido")
    else if(num != 0){
      vect.push(Number(num)) //temos que converter em numero    
    }
}while(num != 0)

for(let i in vect){
    soma += vect[i]
}

console.log(vect)

let media = soma / vect.length

console.log(`O Máximo do Vetor é: ${Math.max(...vect)}`)
console.log(`O Minimo do Vetor é: ${Math.min(...vect)}`)
console.log(`A Média é:  ${media.toFixed(2)}`)
console.log(`O tamanho do Array é:  ${vect.length}`) */


//versao 2
/* const prompt = require('prompt-sync')()
 
// globals
values = []
 
// define functions
function fillValues(vec) {
    console.log("\nIntroduza valores. Digite 0 para terminar\n")
    do {
        val = prompt("Valor: ")
        if(isNaN(val)) console.log("\nErro: valor inserido inválido!\n")
        else {
            if(val !== '0') values.push(Number(val))
        }
    } while (val !== '0')
}
 
function total(vec) {
    let sum = 0
    for (elem of vec) {
        sum += elem
    }
    return sum
}
 
function printData(vec) {
    console.log(`Conteúdo do vetor: ${vec}`)
    console.log(`Máximo: ${Math.max(...vec)} Mínimo: ${Math.min(...vec)}`)
    console.log(`Média: ${(total(vec)/vec.length).toFixed(2)}`)
    console.log(`N.º de elementos: ${vec.length}`)
}
 
// call functions
fillValues(values)
printData(values)
 
const prompt = require('prompt-sync')()
 
// globals
values = [2,8,1,3,4]
 
function maximo(vec) {
    let max = undefined
    if(vec.length > 0) {
        for(let i in vec) { // problema: no for in qd fazemos let i ele guarda o valor como texto - key
            if(i == 0) max = vec[i]
            else {
                if(vec[i] > max) max = vec[i]
            }
            console.log(`i:${i} vec:${max}`)
        }
    }
    return max
}
 
function maximoV2(vec) {
    let max = undefined
    if(vec.length > 0) {
        for(let value of vec) {
           if(max === undefined || value > max) max = value
        }
    }
    return max
}
 
function maximoV3(vec) {
    let max = undefined
    if(vec.length > 0) {
        for(let i = 0; i < vec.length; i++) {
            if(i === 0) max = vec[i]
            else {
                if(vec[i] > max) max = vec[i]
            }
        }
    }
    return max
}
 
console.log(maximo(values))
console.log(maximoV2(values))
console.log(maximoV3(values)) */
 