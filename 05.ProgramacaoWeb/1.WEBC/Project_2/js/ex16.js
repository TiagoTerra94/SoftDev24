/* //destruturuação
const arr = [1,2,3,4,5]
const [n1,n2,n3,n4,n5] = arr
console.log(n3)

const pessoa = {
    nome : "Paula",
    idade : 23,
    morada: {
        rua: "Rua Sei Mil",
        localidade: 'Porto'
    }
}

const {nome, idade, morada: {localidade} } = pessoa //destruturar
console.log(localidade) //busca com este identificador */

/* //Tratamento de erros

const val = 3
try{
    console.log(val/0)
}
catch(error){
    console.log(error)
}finally{
    console.log("Terminou")
} */

/* //Timers

let count = 0

const timer = setInterval(() =>{
    count++
    console.log(count)
},1000)//por milesimos

setTimeout(()=>{
    clearInterval(timer)
    console.log("Terminei!")
},6000) */

/* //funçoes avançadas

function multiple(){//funciona só qd usamos a keyword function
    console.log(arguments[2])
}
//multiple(1,2,3,4,5,6)

const multipleV2 = (...args) => {
    for (val of args){
        console.log(val)
    }
}
multipleV2(1,2,3,4,5,6) */

/* //assincronismo

function sendMessage(msg, time){
    setTimeout(() =>{
        console.log(msg)
    }, time)
}

sendMessage("Hello", 2000)//executa na hora, mas só retorna apos o tempo definido
sendMessage("All Good?",1500)
sendMessage("Byeeee",800) */

/* 
Promise 
     resolve(reposta) -> then / async
     Reject (erro) -> catch 
*/

