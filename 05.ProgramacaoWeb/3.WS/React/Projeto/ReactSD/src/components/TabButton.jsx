import './TabButton.css'

//O children trata-se do nome do botão
//O onSelect é apenas o nome que foi dado à função onClick
export function TabButton({children, onSelect, active}){
    
    //se estiver ativo muda a classe para active, senao é a default
    return <button className={active? 'activeBtn': 'btnColor'} onClick={onSelect}>{children}</button>

}