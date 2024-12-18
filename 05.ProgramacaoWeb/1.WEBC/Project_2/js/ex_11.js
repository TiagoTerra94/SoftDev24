const pessoa = {
    nome :"Maria",
    idade : 44,
    salario : 1234.56,
    morada: {
        localidade: "Ovar",
        cod_postal: "3880-123",
        porta: 2
    }
}

//console.log(pessoa.nome)
//console.log(pessoa.morada.localidade)

const arrPessoas =[]
arrPessoas.push(pessoa)
console.log(arrPessoas)

/* for(let key in pessoa) {
    console.log(`índice: ${key} Valor: ${pessoa[key]}`)
} */