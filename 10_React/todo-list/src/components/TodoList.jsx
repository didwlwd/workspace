import React, {useState} from 'react'
import styled from 'styled-components'

const Container = styled.div`
    width: 100%;
    margin: 0 auto;
    padding: 24px;
    background: white;
    max-width: 500px;
    border-radius: 12px;
    box-shadow: 0 4px 4px #acacac;
`

const Title = styled.h1`
    font-size : 48px;
    font-weight: bold;
    margin-bottom:24px;
`

const InputContainer = styled.div`
    display: flex;
    margin-bottom: 24px;
`

const Input = styled.input`
    flex: 1;
    padding: 12px;
    border: 1px solid #e2e2e2;
    outline: none;
    border-radius: 4px 0 0 4px;

    &:focus{
        border-color: #64c0c4;
    }
`

const AddButton = styled.button`
    padding: 12px 24px;
    background: #64c0c4;
    color: white;
    border: none;
    border-radius: 0 4px 4px 0;
    cursor: pointer;

    &:hover{
        background-color: #64c0c4dd;
    }
`

const TodoListContainer = styled.ul`
    list-style: none;
`

const TodoList = () => {
    const [newTodo, setNewTodo] = useState('');

  return (
    <Container>
        <Title>TodoList</Title>
        <InputContainer>
            <Input 
                type="text" 
                value={newTodo}
                onChange={(e) => setNewTodo(e.target.value)}
            />
            <AddButton>추가</AddButton>
        </InputContainer>
        <TodoListContainer>
            <li>밥먹기 <button>x</button></li>
        </TodoListContainer>
    </Container>
  )
}

export default TodoList