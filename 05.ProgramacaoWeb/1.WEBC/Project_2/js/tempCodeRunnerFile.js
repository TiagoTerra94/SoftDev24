fetch('https://dummyjson.com/products?limit=10')
    .then(response =>{//espero pela resposta
        if(response.ok){//
            return response.json()
        }
    })
    .then(data => console.log(data)) //apos a resposta guardo os dados
    .catch(error => console.log(`Erro: ${error}`)) //caso der erro