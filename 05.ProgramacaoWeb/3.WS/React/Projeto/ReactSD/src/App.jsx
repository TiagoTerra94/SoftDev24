import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Card from './components/Card'
import Header from './components/Header'
import MainGoal from './components/MainGoal'
import {userData} from './data/data'
import CourseGoal from './components/CourseGoal'
import {TabButton} from './components/TabButton'
import Discount from './components/Discount'
import { EXAMPLES } from './data/coreConcepts'
import Delete from './exercises/delete'

//Variavel inicial do content que vai surgir
//let initialContent = 'Ainda não selecionaste nada'

function App() {
  //Hook useState para alterar valor da variavel
  const [content, setContent] = useState('components')

  //Função que executa  o useState
  function handleSelect(myContent){
    setContent(myContent)
  }

  //Retorno que vai surgir na página
  return (
    <>
      <div>
        <Header/>
        <MainGoal
        myGoal = "O meu objetivo é aprender React e construir aplicações incríveis!"/>
        <MainGoal
        myGoal= "Fazer interfaces user friendly"/>
        <MainGoal
        myGoal= "Ter código otimizado"/>
        <a href="https://vite.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Software Developer: React</h1>
      <CourseGoal/>
      <CourseGoal
      title = 'Laravel'
      description='Fazer rotas engraçadas'/>

      <Card
      firstName = "Tiago"
      lastName =  "Terra"
      title = 'Software Developer'/>
      <Card
      firstName = "Rui"
      lastName = "Cruz"
      title = "QA Dev"/>
      <Card
      firstName = "Ruben"
      lastName = "Pereira"
      title = "Software Developer"/>
      <Card 
      firstName = {userData.firstName}
      title = {userData.title}/>

      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>

      <h3>Eventos Dinâmicos</h3>
      <menu>
        <TabButton onSelect={()=>handleSelect('jsx')}>JSX</TabButton>
        <TabButton onSelect={()=>handleSelect('props')}>Props</TabButton>
        <TabButton onSelect={()=>handleSelect('state')}>State</TabButton>
        <div>{content}</div>
      </menu>
      {!content ?(<p>Pf seleciona um topico</p>) :
      ( <div id='tab-content'>
        <h3>{EXAMPLES[content].title}</h3>
          <p>{EXAMPLES[content].description}</p>
          <pre>
            <code>{EXAMPLES[content].code}</code>
          </pre>
      </div> )}
      <Delete/>
    </>
  )
}

export default App
