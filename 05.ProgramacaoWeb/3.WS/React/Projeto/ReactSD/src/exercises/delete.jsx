import { useState } from "react"
import { TabButton } from "../components/TabButton"

export default function Delete(){
  const [showAlert, setShowAlert] = useState(false)

  function HandleShowAlert(show){
    setShowAlert(show)
  }

    return (
    <div>
      {showAlert &&//se o showAlert estiver a true, ele mostra a seguinte mensagem
            (
              <div data-testid="alert" id="alert">
                <h2>Are you sure?</h2>
                <p>These changes can't be reverted!</p>
                <button onClick={()=>HandleShowAlert(false)}> Proceed</button> 
              </div> 
            )}
            <TabButton onSelect={()=>HandleShowAlert(true)}>Delete</TabButton>
    </div>
 )
 //quando temos argumentos temos que utilizar arrowfunctions no onClick
}