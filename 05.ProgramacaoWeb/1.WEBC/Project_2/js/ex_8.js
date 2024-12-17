const prompt = require('prompt-sync')()



do{
    console.log("MENU")
    console.log("1- Ler Valores")
    console.log("2- Ver Valores")
    console.log("3- Media")
    console.log("4- Maximo")
    console.log("5- Minimo")
    console.log("6- Sair")

    op = parseInt(prompt("Insira a opção: "))

    switch(op){
        case 1:
            console.log("Opção desejada: 1")
            break
        case 2:
            console.log("Opção desejada: 2")
            break
        case 3:
            console.log("Opção desejada: 3")
            break
        case 4:
            console.log("Opção desejada: 4")
            break
        case 5:
            console.log("Opção desejada: 5")
            break
        case 6:
            return  
        default:
            console.log("Erro: operação inválida")                    
    }

}while(op!=6)

