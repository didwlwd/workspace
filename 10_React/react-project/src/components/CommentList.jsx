import React, { Component } from 'react'
import Comment from './Comment';


const serverCommnents = [
    {
        id : 1,
        message : "안녕하세요. 양동민입니다.",
    },{
        id : 2,
        message : "이제 여름이 시작하나요?",
    },{
        id : 3,
        message : "냉면먹고 싶습니다.",
    }
]

class CommentList extends Component {
    constructor(props){
        super(props);
        this.state = {
            commentList : [],
        }
    }

    componentDidMount() {
        setInterval(() => {//setInterval : 일정시간마다 반복해서 동작하는 비동기 함수
        const { commentList } = this.state;

        if (commentList.length < serverCommnents.length) {
            const nextComment = serverCommnents[commentList.length];

            this.setState({
            commentList: [...commentList, nextComment],
            });
        } else {
            this.setState({
            commentList: [],
            });
        }
        }, 3000);
    }

    componentWillUnmount() {
        clearInterval(this.interval); // 컴포넌트가 언마운트될 때 interval 정리
      }

  render() {
    const { commentList } = this.state;
    return (
      <div>
        {commentList.map((c) => 
            <Comment key={c.id}
                id = {c.id}
                message = {c.message}
            />)
        }
      </div>
    )
  }
}

export default CommentList