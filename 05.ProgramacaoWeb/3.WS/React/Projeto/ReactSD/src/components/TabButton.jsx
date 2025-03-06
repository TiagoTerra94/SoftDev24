import './TabButton.css'

export function TabButton({children, onSelect}){
    
    return <button onClick={onSelect} className="btnColor">{children}</button>
}