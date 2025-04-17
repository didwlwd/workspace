import React from 'react'


const imgUrl = "data:image/webp;base64,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";


const text = "Hello, JSX";
const num = 10;

const loginUser = {
    name : "양동민",
    id : "qwe11",
    age : 22
}

function getImg(){
    return <img src={imgUrl} alt="이미지"/>
}

const numbers = [1,2,3];

const JavaScript = () => {
  return (
    <div>
        <h2>변수 표현 방법</h2>
        <ul>
            <li>{text}</li>
            <li>{text + " Test"}</li>
        </ul>
        <h2>숫자및 계산식 사용</h2>
        <ul>
            <li>{num}</li>
            <li>{num + 20}</li>
        </ul>

        <h2>Boolean 값</h2>
        <ul>
            <li>{true}</li>
            <li>{false}</li>
            <li>{undefined}</li>
            <li>{null}</li>
        </ul>

        <h2>Object, Array</h2>
        <ul>
            {
                Object.keys(loginUser).map((key) => 
                <li key={key}> {/* 반복되는 요소안에는 무조건 key라는 속성이 필요함 */}
                    {key} : {loginUser[key]}
                </li>
                )
            }
            <li>{numbers}</li> {/* 배열 그대로 출력(문자열로 자동 변환) */}
            {[<li key={1}>111</li>, <li key={2}>222</li>,<li key={3}>333</li>]}
        </ul>

        <h2>태그 속성에 값 넣기</h2>
        <ul>
            <li>
                <img src={imgUrl} alt="이미지"/>
            </li>
        </ul>

        <h2>조건부 랜더링</h2>
        <ul>
            <li>{num > 10 ? "10보다 큼" : "10보다 작음"}</li>
            <li>{num > 10 && "조건이 true일때 안보임"}</li>
            <li>{num > 10 || "조건이 true일때 보임"}</li>
        </ul>

        <h2>함수호출로 태그가 올 수 있음</h2>
        <ul>
            <li>{getImg()}</li>
        </ul>
    </div>
  )
}

export default JavaScript