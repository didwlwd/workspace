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
		background: black;
		color: black;
		width: 1000px;
		margin: auto;
		margin-top: 50px;
		padding: 10px 0px 50px ;
	}
	.outer table{
		margin: auto;
	}

	#update-pwd-modal{
		margin: auto;
	}

	#update-pwd-modal .modal-body form{
		display: flex;
		align-items: flex-end;
	}

	#delete-user-modal{
		margin: auto;
	}
	
	#delete-pwd-btn{
		width:100%;
	}
	
</style>

</head>
<body>
<%@include file="../common/menubar.jsp" %>
<div class="outer">
		<br>
		<h2 align="center">내 정보</h2>
		<form action="${pageContext.request.contextPath}/update.me" method="post" id="update-form">
			<table>
				<tr>
					<td>* 아이디</td>
					<td><input type="text" name="userId" maxlength="15" readonly value="${sessionScope.loginUser.userId }"></td>
					<td></td>
				</tr>
				
				<tr>
					<td>* 이름</td>
					<td><input type="text" name="userName" maxlength="8" readonly value="${sessionScope.loginUser.userName }"></td>
					<td></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="Phone" placeholder="- 포함해서 입력" value="${loginUser.phone }"></td>
					<td></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="email" name="email" value="${loginUser.email }"></td>
					<td></td>
				</tr>

				<tr>
					<td>주소</td>
					<td><input type="text" name="address" value="${loginUser.address }"></td>
					<td></td>
				</tr>

				<tr>
					<td>관심분야</td>
					<td colspan="2">
						<label>
							<input type="checkbox" name="interest" value="운동">운동
						</label>
						<label>
							<input type="checkbox" name="interest" value="등산">등산
						</label>
						<label >
							<input type="checkbox" name="interest" value="낚시">낚시
						</label>
						<br>
						<label >
							<input type="checkbox" name="interest" value="요리">요리
						</label>
						<label >
							<input type="checkbox" name="interest" value="게임">게임
						</label>
						<label >
							<input type="checkbox" name="interest" value="영화">영화
						</label>
						<label >
							<input type="checkbox" name="interest" value="기타">기타
						</label>
					</td>
					<td></td>
				</tr>
			</table>
	
			<!-- <script>
				const interest = "${loginUser.interest}"; //"낚시 , 등산"
				const inputArr = document.querySelectorAll("input[name=interest]");
				
				for(let input of inputArr){ 
					if(interest.includes(input.value)){//interest에 input.value의 값이 포함되어 있다면
						input.checked = true;
					}
				}
			</script>
 -->
			<br><br>

			<div align="center">
				<button type="submit" class="btn btn-sm btn-success">정보수정</button>
				<button type="button"  class="btn btn-sm btn-warning" data-bs-toggle="modal" data-bs-target="#update-pwd-modal">비밀번호 변경</button>
				<button type="button" class="btn btn-sm btn-danger" data-bs-toggle="modal" data-bs-target="#delete-user-modal">회원탈퇴</button>
			</div>

		</form>
	</div>
</body>
</html>