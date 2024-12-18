const nome = document.getElementById("nome")
const registarBTN = document.getElementById("registarBTN")
const form = document.getElementsByClassName("form")
registarBTN.disabled = true

function defineActions(){
    /* //register
    registarBTN.addEventListener('click', function(e){
        console.log(nome.value)//e.target.value
    })*/
    // input
    nome.addEventListener('input', function(e){
        if(nome.value.length >2) registarBTN.disabled = false
    }) 

    form.addEventListener('submit', function (e){
        e.preventDefault()
        if(nome.value === ''){
            alert("Campo Vazio")
            return
        }
        else{
            alert(`Nome: ${nome.value}`)
        }
    })
}

defineActions()
