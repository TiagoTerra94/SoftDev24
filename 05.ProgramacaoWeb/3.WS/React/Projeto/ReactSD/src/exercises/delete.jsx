import { useState } from "react"
import { TabButton } from "../components/TabButton"

export default function Delete(){
  const [content, setAlert] = useState("")

  function showAlert(){
    setAlert(content)
  }

    return (
    <div>
      {!content ? (<TabButton onSelect={showAlert}>Delete</TabButton>) :
            (
              <div data-testid="alert" id="alert">
                <h2>Are you sure?</h2>
                <p>These changes can't be reverted!</p>
                <button>Proceed</button>
              </div> 
            )}
            
    </div>
      )
}