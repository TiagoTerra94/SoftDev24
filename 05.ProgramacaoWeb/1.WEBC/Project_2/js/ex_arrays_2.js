const prompt = require('prompt-sync')()

notas = []

do{

    console.log("*MENU*")
    console.log("1-Visualizar")
    console.log("2-Inserir")
    if(notas.length>0){
        console.log("3-Pesquisar")
        console.log("4-Remover")
        console.log("5-Estatisticas")
    }
    console.log("6-Sair")

    op = parseInt(Number(prompt("Opção: ")))

    switch(op){
        case 1:
            visualizar(notas)
            break
        case 2:
            inserir(notas)
            break
        case 3:
            pesquisar(notas)
            break
        case 4:
            remover(notas)
            break
        case 5:
            estatisticas(notas)
            break
        case 6:
            break
        default:
            console.log("Opção Inválida")
            break              

    }

}while(op!=6)

function visualizar(vet){
    if(vet.length > 0 ) console.log(vet)
        else{
            console.log("Ainda não foram inseridas notas.")
        }
}

function inserir(vet){
    console.log("*OPÇÃO 2: INSERIR NUMERO*")
    let num = parseInt(Number(prompt("Que número quer inserir no vetor:")))
        if(numExists(num, vet)) console.log("O número já existe no array")
            else{
                vet.push(Number(num))
            }
     
}

function pesquisar(vet){
    console.log("*OPÇÃO 3: PESQUISAR*")
    pos = parseInt(Number(prompt("Que elemento procura:")))
    console.log(vet[pos])
}

function remover(vet){
    console.log("*OPÇÃO 4: REMOVER NUMERO*")
    let pos = parseInt(prompt("Qual é o elemento que deseja remover?"))
    if(pos > vet.length || pos < 0) console.log ("Elemento inexistente")
        else{
            const deleted = delete vet[pos]//remover elemento
            console.log(deleted)
            console.log(vet)
        }
}

function estatisticas(vet){
    console.log("*OPÇÃO 5: ESTATISTICAS*")
    printData(vet)
}

function printData(vec) {
    console.log(`Conteúdo do vetor: ${vec}`)
    console.log(`Máximo: ${Math.max(...vec)} Mínimo: ${Math.min(...vec)}`)
    console.log(`Média: ${(total(vec)/vec.length).toFixed(2)}`)
    console.log(`N.º de elementos: ${vec.length}`)
}

/*VERSAO 2
const prompt = require('prompt-sync')()
 
vecNotas = []
 
function notaExists(nota, vecNotas) {
    return vecNotas.includes(nota)
}
 
function insertNota(vecNotas) {
    while(true) {
        nota = Number(prompt("Nota: "))
        if(!isNaN(nota) && Number.isInteger(nota)) {
            if(notaExists(nota, vecNotas)) console.log("\nErro: nota já existe!\n")
            else return nota
        }
        else console.log("\nErro: nota inválida!\n")
    }
}
 
function menu(vecNotas) {
    while(true) {
        console.log("1 - Visualizar")
        console.log("2 - Inserir")
        if(vecNotas.length > 0) {
            console.log("3 - Pesquisar")
            console.log("4 - Remover")
            console.log("5 - Estatísticas")
        }
        console.log("6 - Sair")
        // ler opção
        op = Number(prompt("Opção: "))
        switch(op) {
            case 1:
                if(vecNotas.length > 0) console.log(vecNotas)
                else console.log("\nAinda não foram inseridas notas\n")
                break
            case 2:
                vecNotas.push(insertNota(vecNotas))
                break
            case 3:
                if(vecNotas.length > 0) {
                    if(notaExists(Number(prompt("Nota: ")), vecNotas)) console.log("A nota existe")
                    else console.log("A nota não existe")
                }
                else console.log("\nErro: não tem permissão para executar esta operação\n")
                break
            case 4:
                if(vecNotas.length > 0) {
                    nota = Number(prompt("Nota: "))
                    if(notaExists(nota, vecNotas)) {
                        const index = vecNotas.indexOf(nota)
                        vecNotas.splice(index, 1)
                        console.log("\nElemento removido!\n")
                    }
                    else console.log("\nErro: Elemento não encontrado!\n")
                }
                else console.log("\nErro: não tem permissão para executar esta operação\n")                
                break
            case 5:
                if(vecNotas.length > 0) {
                    console.log("Estatisticas")
                }
                else console.log("\nErro: não tem permissão para executar esta operação\n")                
                break
            case 6:
                return
            default:
                console.log("\nERRO!\n")
        }
 
    }
}
 
menu(vecNotas)*/