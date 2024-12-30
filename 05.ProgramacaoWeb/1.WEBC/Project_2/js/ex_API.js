const prompt = require("prompt-sync")();
//const prompt = require(`prompt-sync`)
//Desafio API, retornar todos os utilizados q tenham
//um determinado nome (prompt), no maximo terá que retornar
//5 utilizadores

nome = prompt("Nome: ")
fetch(`https://dummyjson.com/users/search?q=${nome}&limit=5`)
    .then(response => {
        if(response.ok) {
            return response.json()
        }
    })
    .then(data => console.log(data))
    .catch(error => console.log(`Erro: ${error}`))