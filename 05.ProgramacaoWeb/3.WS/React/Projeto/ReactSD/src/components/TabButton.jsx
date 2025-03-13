import './TabButton.css'

//O children trata-se do nome do botão
//O onSelect é apenas o nome que foi dado à função onClick
export function TabButton({children, onSelect}){
    
    return <button onClick={onSelect} className="btnColor">{children}</button>
}