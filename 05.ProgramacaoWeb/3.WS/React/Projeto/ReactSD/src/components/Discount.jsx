import { useState } from "react"
import { TabButton } from "./TabButton"

export default function Discount(){
    //Usar useState para fazer alteração de uma variavel
    const [price,setPrice] = useState("100$")

    //Função que vai alterar o price para um novoPrice
    function changePrice(){
        setPrice('75$')
    }

    //O retorno que vai surgir na App
    //Se a operação possuir argumento: ()=>changePrice
    return(
        <div>
            <p data-testid="price">{price}</p>
            <TabButton onSelect={changePrice}>Alterar</TabButton>
        </div>
    )
}