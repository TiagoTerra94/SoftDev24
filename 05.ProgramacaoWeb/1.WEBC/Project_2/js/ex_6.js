const nome = prompt("Nome do Utilizador: ")
document.body.innerHTML += `<p>Chamo-me ${nome}</p>`
document.body.innerHTML += `<p>O ${nome} tem ${nome.length} letras</p>`
document.body.innerHTML += `<p>A segunda letra do meu nome é: ${nome.charAt(1)}</p>`
document.body.innerHTML += `<p>O último indice da letra "g" do meu nome é ${nome.indexOf('g')}</p>`
document.body.innerHTML += `<p>As últimas 3 letras do meu nome são: ${nome.slice(-3)}</p>`
document.body.innerHTML += `<p>As palavras do meu nome são ${nome.split(" ")} </p>`
document.body.innerHTML += `<p>Nome em minusculas ${nome.toLowerCase(" ")} e maiusculas ${nome.toUpperCase(" ")}</p>`


const n1 = 4.135456
console.log(n1.toFixed(3))

if(Number.isInteger(n1)) console.log("Inteiro")
else console.log("NOT inteiro")

console.log(typeof n1)
if(typeof n1 == "number") console.log("Numero")
else console.log("NOT numero")//NaN



/* let n1 = "5"
let n2 = 5

if(n1 === n2) console.log("Iguais")
else console.log("Diferentes")      */

// = (atribuir) == comparar valor === comparar valor E Tipo (recomendavel)
//!= diff de !== diff de tipo



