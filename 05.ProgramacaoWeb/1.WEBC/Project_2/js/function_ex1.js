const prompt = require(`prompt-sync`)

//Numero Random
function randomNumber(min, max){
    return Math.floor(Math.random() * (max-min) + min)
}

const vet = []
//Multiplos de 5
function gerarNumeros(vet){
    for(let i = 0; i< 5;i++){
        num = randomNumber(1,51)
        if(num%5 == 0) vet.push(num)
    }
}


const vet2 =[]
function valorInt(vet2){
    console.log("Insira um numero inteiro: (De 1 a 30)")
    for(let i= 0; i<vet2.length;i++){
        num = parseInt(Number(prompt("Valor: ")))
        if(Number.isInteger(num)){
            if(num < 1 || num >30) console.log("Valor inválido")
                else{
                vet2.push(num)   
            }
        }
    } 
}

//imprimir conteudo
gerarNumeros(vet)
console.log(vet)

valorInt(vet2)
console.log(vet2)
