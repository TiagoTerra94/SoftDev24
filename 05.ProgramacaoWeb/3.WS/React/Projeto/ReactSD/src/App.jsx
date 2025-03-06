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


function App() {
  function handleSelect(myContent){
    console.log(myContent)
  }

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
        <TabButton onSelect={()=> handleSelect('js')}>Matéria JS</TabButton>
        <TabButton onSelect={()=> handleSelect('react')}>Matéria React</TabButton>
        <TabButton onSelect={()=> handleSelect('sql')}>Matéria SQL</TabButton>
      </menu>
      <div>
        
      </div>
    </>
  )
}

export default App
