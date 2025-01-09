const loadBTN = document.getElementById("loadBTN")
const resultado = document.querySelector("#resultado")

    const addRecipe = (data) => {
        resultado.innerHTML=`
        <h2>${data.name}</h2>
            <ul>
            ${data.instructions.map(instruction => `<li>${instruction}</li>`).join('')}
            </ul>
        </p>
        <p><strong>Cook Time:</strong> ${data.cookTimeMinutes} minutos</p>
        <p><strong>Difficulty:</strong> ${data.difficulty}</p>
        <p>
            <strong>Ingredients:</strong>
            <ul>
                ${data.ingredients.map(ingredient => `<li>${ingredient}</li>`).join('')}
            </ul>
        
        `
    }


    function defineActions(){//ao clicar executa
        loadBTN.addEventListener('click',function(e){
            fetch(`https://dummyjson.com/recipes/1/${recipes}`)
                .then(res => res.json())
                .then(data=>{
                    addRecipe(data)
                })
                .catch(error =>{
                    console.log(`Erro: fetching API data ${error}`)
                })
        })
    }

    defineActions()
    
    const recipes =[]    
    const {name, ingredients, instructions, cookTimeMinutes, difficulty, cuisine,image} = recipes