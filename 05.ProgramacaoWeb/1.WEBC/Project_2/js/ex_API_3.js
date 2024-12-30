
const recipeSelect = document.getElementById("recipeSelect")
const resultado = document.querySelector("#resultado")
const recipes =[]    
const {name, ingredients, instructions, cookTimeMinutes, difficulty, cuisine,image} = recipes


    const addRecipe = (data) => {
        resultado.innerHTML=`
        <h2>${data.name}</h2>

        <p><strong>Cuisine:</strong> ${data.cuisine}</p>
        <p>
        <strong>Instructions:</strong> 
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
        </p>
        <p><strong>Image:</strong> <img src='${data.image}' alt=img ></p>
        `
    }


    const populateSelect = () =>{
        fetch(`https://dummyjson.com/recipes?limit=10&select=name`)
            .then (res => res.json())
            .then(data => {
                 const defaultOption = document.createElement("option")
                 defaultOption.value = 0
                 defaultOption.textContent = "Escolha a Receita"
                 recipeSelect.appendChild(defaultOption)

                 //popular com receitas da api
                 data.recipes.forEach(recipe =>{
                    const option = document.createElement("option")
                    option.value = recipe.id 
                    option.textContent = recipe.name 
                    recipeSelect.appendChild(option)
                 })
            })
    }

    function defineActions() {
        recipeSelect.addEventListener('change', function(e) {
            const selectedID = recipeSelect.value
            if(selectedID !== "0") {
                fetch(`https://dummyjson.com/recipes/${selectedID}`)
                    .then(res => res.json())
                    .then(data => {
                        addRecipe(data)
                    })
                    .catch(error => {
                        console.log(`Error fetching API DATA: ${error}`)
                    })            
            }
            else {
                resultado.innerHTML = ""
            }
        })
    }
    window.addEventListener('DOMContentLoaded',()=>{
        populateSelect()
        defineActions()
    })
    