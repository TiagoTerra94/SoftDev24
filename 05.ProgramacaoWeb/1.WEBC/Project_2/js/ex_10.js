/* let texto = "Aqui está um texto"
const textoArray = texto.split(" ")//faz split
textoArray[0] = "X"//adiciona ao array e substitui o primeiro elemento

texto = textoArray.join("")//faz join
console.log(textoArray)
console.log(texto) */

const pessoas = ["Ana","Diogo","Carlos","Filipe","Alberto"]

let i=0
while(i<pessoas.length){
    console.log(pessoas[i])
    i++
}

do{
    if(i===9)break
    console.log(i**2)
    i++
}while(true)

while(true){
    //condiçao paragem
    if(i===9)break
    console.log(i**2)
    i++
}    

/* for(let i= 0; i < pessoas.length;i++){
    console.log(pessoas[i])
}

for(let i in pessoas){
    console.log(pessoas[i])
} 

for (let pessoa of pessoas){//recomendado para sem indices
    console.log(pessoa)
}*/
