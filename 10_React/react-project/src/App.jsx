import './App.css'
import JavaScript from './components/JavaScript';
import Style from './components/Style'
import Products from './components/Products';
import Hello from './components/Hello';
import Heading from './components/Heading';

function App() {
  return (
    <>
      {/*<JavaScript/>*/}
      {/* <Style/> */}
      {/* <Products/> */}
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
