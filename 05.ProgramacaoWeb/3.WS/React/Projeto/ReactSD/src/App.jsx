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
import { EXAMPLES, CORE_CONCEPTS } from './data/coreConcepts'
import Delete from './exercises/delete'
import ComponentCard from './components/ComponentCard'
import{createBrowserRouter, RouterProvider} from 'react-router-dom'
import HomePage from './pages/HomePage'
import ShoppingList from './pages/ShoppingList'
import Contacts from './pages/Contacts'
import LayoutMaster from './components/LayoutMaster'
import ErrorPage from './pages/ErrorPage'
import EasterGifts from './pages/EasterGifts'

//Variavel inicial do content que vai surgir
//let initialContent = 'Ainda não selecionaste nada'

//Constante que chama a função rotas com Layout Master
const router = createBrowserRouter([
  {
    path: "/",
    element: <LayoutMaster />,
    errorElement: <ErrorPage/>,
    children: [
      { path: "/", element: <HomePage /> },
      { path: "/shopping", element: <ShoppingList /> },
      { path: "/contacts/:name", element: <Contacts /> },
      { path: "/eastergifts", element: <EasterGifts/>}
    ],
  },
]);


function App() {

  return <RouterProvider router={router}/>

  //Hook useState para alterar valor da variavel
  const [content, setContent] = useState("components");

  //Função que executa  o useState
  function handleSelect(myContent) {
    setContent(myContent);
  }

  

  //Retorno que vai surgir na página
  return (
    <>
      <div>
        <Header />
        {/* <div className='container'>
          {CORE_CONCEPTS.map((item)=>//mapeia/faz um array de items, neste caso de props relacionados aos CoreConcepts
          <ComponentCard
          key = {item.title}//usamos a key para cada uma dos item seja unico e nao dê erro
          {...item}
          />
          )}
        </div> */}
        <MainGoal myGoal="O meu objetivo é aprender React e construir aplicações incríveis!" />
        <MainGoal myGoal="Fazer interfaces user friendly" />
        <MainGoal myGoal="Ter código otimizado" />
        <a href="https://vite.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Software Developer: React</h1>
      <CourseGoal />
      <CourseGoal title="Laravel" description="Fazer rotas engraçadas" />

      <Card firstName="Tiago" lastName="Terra" title="Software Developer" />
      <Card firstName="Rui" lastName="Cruz" title="QA Dev" />
      <Card firstName="Ruben" lastName="Pereira" title="Software Developer" />
      <Card firstName={userData.firstName} title={userData.title} />
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>

      <h3>Eventos Dinâmicos</h3>
      <menu>
        <TabButton
          active={content == "jsx"}
          onSelect={() => handleSelect("jsx")}
        >
          JSX
        </TabButton>
        <TabButton
          active={content == "props"}
          onSelect={() => handleSelect("props")}
        >
          Props
        </TabButton>
        <TabButton
          active={content == "state"}
          onSelect={() => handleSelect("state")}
        >
          State
        </TabButton>
        <div>{content}</div>
      </menu>
      {!content ? (
        <p>Pf seleciona um topico</p>
      ) : (
        <div id="tab-content">
          <h3>{EXAMPLES[content].title}</h3>
          <p>{EXAMPLES[content].description}</p>
          <pre>
            <code>{EXAMPLES[content].code}</code>
          </pre>
        </div>
      )}
    </>
  );
}

export default App
