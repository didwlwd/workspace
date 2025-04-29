import React from 'react'
import { Link } from 'react-router-dom'
import styled from 'styled-components'
import { Container } from '../components/styled/common'
import PostList from '../components/PostList'

const Header = styled.div`
  display: flex;
  justify-content: space-between;
  align-items: center;
`

const NewPostButton = styled(Link)`
  display: inline-block;
    background-color: #8cc2ff;
    color: white;
    padding: 12px 24px;
    border-radius: 4px;
    text-align: none;
    text-decoration: none;
    margin: 12px;

    &:hover{
        opacity: 0.9;
        color: white;
    }
`

const PostListPage = () => {
  return (
    <Container>
        <Header>
            <h1>게시글 목록</h1>
            <NewPostButton to=''>게시글 작성</NewPostButton>
        </Header>
        <PostList />
    </Container>
  )
}

export default PostListPage