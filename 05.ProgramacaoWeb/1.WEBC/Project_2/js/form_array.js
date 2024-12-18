const prompt = require('prompt-sync')()

function getData(){
    //variables
    const pessoas = []
    const registarBTN = document.getElementById("registarBTN")
    const form = document.getElementsByClassName("form")
    const resultado = document.querySelector("#resultado")

    removePerson = function(index) {
        pessoas.splice(index, 1); // Remove the person from the array
        addPersonToResult(); // Update the list display
        console.log(pessoas)
    }

    function addPersonToResult(){
        resultado.innerHTML
        pessoas.forEach((pessoa,index) => {
            resultado.innerHTML +=`
            <div>
                <button onclick="removePerson(${index})">Remover</button>
                <span>${pessoa.nome}</span>
                <span>${pessoa.apelido}</span>
                <span>${pessoa.peso}</span>
                <span>${pessoa.altura}</span>
            </div>
            `
        })
    }

    function removePersonToResult(){
        const elemento = parseInt(prompt("Que elemento quer remover?"))
        const deleted = delete pessoas[elemento]//remover elemento
        console.log(deleted)
        console.log(pessoas)
    }

    function cleanInput(){
        form.querySelector("#nome").value = ""
        form.querySelector("#apelido").value = ""
        form.querySelector("#peso").value = ""
        form.querySelector("#altura").value = ""
    }

    function submitHandler(e){
        e.preventDefault()
        const nome = document.querySelector("#nome").value
        const apelido = document.querySelector("#apelido").value
        const peso = document.querySelector("#peso").value
        const altura = document.querySelector("altura").value
        if(nome && apelido && peso && altura){
            pessoas.push({nome,apelido,peso,altura})
        }
        console.log(pessoas)
        cleanInput()
        addPersonToResult()
    }

    form.addEventListener('submit', submitHandler)
}

getData()


