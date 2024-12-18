/* const prompt = require(`prompt-sync`)

function msg(){
    console.log("Hello")
}

msg()

function ePar(vall){
    return vall%2 == 0
}

function multiplos(){
    const val1 = 3
    const val2 = 5
    return [val1, val2]
}

//destruturação
const [n1,n2] =multiplos()
console.log(n1) */

//arrow functions
const ePar = (num) =>{
    return num%2 == 0
}
console.log(ePar(2))