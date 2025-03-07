<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.kh.model.vo.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>연습중인데요 이게 EL로 쓰는 방식과 스트립틀릿으로 쓰는방식이 나뉜데요</h4>
	<h3>이건 스트립틀릿이에요</h3>
	<%
		//session scope값 가져오기
		String scope = (String)session.getAttribute("scope");
		Person teacher = (Person)session.getAttribute("teacher");
		String academy = (String)session.getAttribute("academy");
		
		//request scope값 가져오기
		String scope1 =(String)request.getAttribute("scope");
		Person student = (Person)request.getAttribute("student");
	%>
	
	<p>
		session은 아이디가 남아서 브라우저가 끝나기 전까지 값이 남는데요<br>
		근데 맞는지는 잘모르겠어요. <br><br>
		
		스코프 어디야 : <%=scope %><br>
		선생님 누구셔 : <%=teacher.getName() %><br>
		학원 어디야 : <%=academy %><br><br>
		
		이번 스코프 어디야 : <%=scope1 %> <br>
		학생 누구야 : <%=student.getName() %><br>
	</p>
	
	<h3>이번엔 EL로 만들어서 값을 보여줄게요</h3>
	
	<p>
		EL은 위에 스트립틀릿처럼 값을 불러오지 않아도되요. <br><br>
		
		스코프 어디야 : ${scope} <br>
		선생님 누구셔 : ${teacher.name}<br>
		선생님 나이 : ${teacher.age }<br>
		학원 어디야 : ${academy }<br><br>
		
		EL에서 scope의 키값이 동일하면 <br>
		page -> request -> session -> application 순으로 돌면서 동일한 키값을 찾는데요. <br><br>
		
	</p>
	
	<h3>직접 스코프에 연결해볼게요!</h3>
		<%pageContext.setAttribute("scope","page"); %>
		
		pageScope : ${scope }, ${pageScope.scope }<br>
		requestScope : ${requestScope.scope }<br>
		sessionScope : ${sessionScope.scope }<br>
		applicationScope : ${applicationScope.scope}<br>
</body>
</html>