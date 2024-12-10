function somar(){
    //operaçoes para passar de String a Int
    let valorA = parseInt(document.getElementById('inputValorA').value)
    let valorB = parseInt(document.getElementById('inputValorB').value)

    soma = valorA + valorB
    
    return soma
    
}

function sub(){
    let valorA = parseInt(document.getElementById('inputValorA').value)
    let valorB = parseInt(document.getElementById('inputValorB').value)

    sub = valorA - valorB

    return sub
}

function multiply(){
    let valorA = parseInt(document.getElementById('inputValorA').value)
    let valorB = parseInt(document.getElementById('inputValorB').value)

    mult = valorA * valorB

    return mult
}

function divisao(){
    let valorA = parseInt(document.getElementById('inputValorA').value)
    let valorB = parseInt(document.getElementById('inputValorB').value)

    div = valorA / valorB

    return div
}

document.getElementById("textoResultado").innertext = "Resultado: " + resultado

function tipoOperador(){
    let op = document.getElementById('tipoOperador').value
    return op
}

function calcular(){

    if(tipoOperador() === "+"){
        somar()
    }else if(tipoOperador() === "-"){
        sub()
    }else if(tipoOperador() === "/"){
        divisao()
    }else if(tipoOperador() === "*"){
        multiply()
    }
   
}


