import { shopList } from "../data/data"

export default function ShoppingList(){
    return(
        <div>
          <h3>Lista Compras</h3>
          <ul>
          {shopList.map((item)=>
           <li key= {item.unidade}> {item.title}: {item.unidade}</li>
          )}
          </ul>
        </div>
    ) 
}