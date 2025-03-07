<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>

<style>
    .outer{
		background: #4b89fc;
		color: white;
		width: 1000px;
		margin: auto;
		margin-top: 50px;
		padding: 10px 0px 50px ;
	}
    
    .list-area{
        border: 1px solid white;
        text-align: center;
    }

    .list-area tbody tr:hover{
        background: #8fb4fa;
        cursor: pointer;
        font-size: 18px;
    }

    .list-area td, .list-area th{
        border: 1px solid white;
    }

    
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>

    <div class="outer"> 
        <br>
        <h2 align="center">공지사항</h2>
        <br>

        <table align="center" class="list-area">
            <thead>
                <th width="120">공지사항번호</th>
                <th width="120">공지사항제목</th>
                <th width="300">공지사항내용</th>
                <th width="70">조회수</th>
                <th width="100">작성일</th>
            </thead>
            <tbody>
               <c:forEach var="b" items="${nlist}">
	               <tr>
	                    <td>${b.noticeNo }</td>
	                    <td>${b.noticeTitle}</td>
	                    <td>${b.noticeContent}</td>
	                    <td>${b.count}</td>
	                    <td>${b.createDate}</td>
	                </tr>
               </c:forEach>
                
            </tbody>
        </table>

        <br><br>

        <div align="center">
        	<c:if test="${pi.currentPage > 1 }">
            	<button class="btn btn-sm btn-primary"onclick="location.href='${pageContext.request.contextPath}/list.bo?cpage=${pi.currentPage - 1}'">&lt;이전</button>
            </c:if>
            
            <c:forEach var="p" begin="${pi.startPage}" end="${pi.endPage}">
            	<c:choose>
            		<c:when test="${p == pi.currentPage }">
            			<button class="btn btn-sm btn-primary" disabled>${p}</button>
            		</c:when>
            		<c:otherwise>
            			<button class="btn btn-sm btn-primary" onclick="location.href='${pageContext.request.contextPath}/list.bo?cpage=${p}'">${p}</button>
            		</c:otherwise>
            	</c:choose>
            </c:forEach>
            
            <c:if test="${pi.currentPage < pi.maxPage}">
            	<button class="btn btn-sm btn-primary" onclick="location.href='${pageContext.request.contextPath}/list.bo?cpage=${pi.currentPage + 1}'">다음&gt;</button>
            </c:if>
            
            
        </div>
    </div>
</body>
</html>