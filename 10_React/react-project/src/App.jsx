import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import styled from 'styled-components'
import CounterDisplay from './components/CounterDisplay'
import CounterControls from './components/CounterControls'
import TotoList from './components/TotoList'

const Appcontainer = styled.div`
  display: flex;
  flex-direction : column;
  align-items: center;
  justify-content: center;
  min-height: 100vh;
  width: 100vw;
  padding: 24px;
  text-align: center;
  transition: all 0.3s;
`

const Section = styled.section`
  width: 100%;
  margin: 0 auto;
  max-width: 800px;
  padding: 18px;
  border-radius: 8px;
  margin-bottom: 20px;
`

function App() {

  return (
    <>
      <Appcontainer>
        <Section>
          <h2>Zustand 전역 상태 관리</h2>
          <CounterDisplay />
          <CounterControls />
        </Section>
        <Section>
          <h2>Zustand TodoList</h2>
          <TotoList />
        </Section>
      </Appcontainer>
    </>
  )
}

export default App
