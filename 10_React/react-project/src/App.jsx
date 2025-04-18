import './App.css'
import Hello from './components/Hello';
import Heading from './components/Heading';

function App() {
  return (
    <>
      <Heading type="h2"/>
      <Heading/>
      <Heading>
        무엇을 도와드릴까요?
      </Heading>
      <Hello/>
    </>
  )
}

export default App
