import React from 'react';
import { Container, FlexContainer, Section } from '../styles/common/Container';
import { Title } from '../styles/common/Typography';
import { CardContent } from '../styles/common/Card';
import { AuthContainer, Button } from '../styles/Auth.styles';

const Profile = () => {
  return (
    <>
      <AuthContainer>
        <Title>마이페이지</Title>
        <Section>
          <CardContent>이메일 : ???</CardContent>
          <CardContent>이름 : ???</CardContent>
          <CardContent>역할 : ???</CardContent>
        </Section>
        <Button>수정하기</Button>
        <Button>탈퇴하기</Button>
      </AuthContainer>
    </>
  );
};

export default Profile;
