<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>* EL(Expression languae)</h1>

    <p>
        기존에 사용하던 표현식 &lt;=name&gt;와 같이 <br>
        JSP상에서 표현하고자하는 값을 ${name}의 형식으로 표현해서 작성하는 것
    </p>
    
    <h4><a href="cl">01_EL의 기본구문</a></h4>
    <h4><a href="wl">02_EL의 연산자</a></h4>
    
    <h1>JSP Action Tag</h1>
    <%--
    	*JSP를 이루는 구성
    	1. 스크립팅 원소 : jsp페이지내에서 자바코드를 사용할 수 있는 기술
    	ex) 스크립틀릿, 표현식...
    	
    	2. 지시어 : jsp페이지 정보에대한 내용을 표현한다거나 또 다른페이지를 포함할때 사용
    			  jsp기능을 확장시키는 라이브러리를 등록할 때 사용
    			  
    	3. 액션태그 : jsp페이지에서 어떤 동작을 하도록 지시하는 태그
    				xml기술을 이용하여 기존의 jsp문법을 확장하는 기술을 제공하는 태그
    	   >> 표준액션태그 : jsp페이지에서 바로 사용이 가능(별도의 연동이 필요x)
    	   			-> 모든 태그명 앞에 jsp: 접두어를 붙여서 사용 <jsp:태그명>
    	   >> 커스텀액션태그 : jsp페이지에서 바로사용 불가능(별도의 라이브러리 연동이 필요)
    	   			-> 접두어에 jsp:이 아닌 모든 액션태그(가장많이 사용하는 라이브러리 jstl)
     --%>
     
     <h3>*표준액션태그</h3>
     <a href="views/2_standard_action_tag/01_include.jsp">01_jsp:include</a>
     <a href="views/2_standard_action_tag/02_forward.jsp">02_jsp:forward</a>
</body>
</html>