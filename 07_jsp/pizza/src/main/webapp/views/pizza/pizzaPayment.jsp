<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String username = (String)request.getAttribute("name");
    	String phone = (String)request.getAttribute("phone");
    	String address = (String)request.getAttribute("address");
    	String message = (String)request.getAttribute("message");
    	
    	String pizza = (String)request.getAttribute("pizza");
    	String []topping = (String[])request.getAttribute("topping");
    	String []side = (String[])request.getAttribute("side");
    	String payment = (String)request.getAttribute("payment");
    	int price = (int)request.getAttribute("price");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>피자 결제 페이지</h1>
	<h3>주문내역</h3>
	<h4>[ 주문자 정보 ]</h4>
	<ul>
		<li>이름 : <%=username %></li>
		<li>전화번호 : <%=phone %></li>
		<li>주소 : <%=address %></li>
		<li>요청메세지 <%=message %></li>
	</ul>
	
	<h4>[ 주문 정보 ]</h4>
	<ul>
		<li>피자 : <%= pizza%></li>
		<%if(topping == null){ %>
		<li>토핑 : 선택한 토핑없음</li>
		<%}else { %>
		<li>토핑 : <%=String.join(",", topping) %></li>
		<%} %>
		
		<%if(side == null){ %>
		<li>사이드 : 선택한 사이드없음</li>
		<%}else{ %>
		<li>사이드 : <%=String.join(",",side) %></li>
		<%} %>
		
		<li>결제방식 : <%=payment %></li>
		
	</ul>
	<h1>총 금액 : <%=price %>원</h1>
</body>
</html>