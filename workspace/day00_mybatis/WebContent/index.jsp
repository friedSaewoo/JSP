<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="MyServlet" method="get">
	아이디 : <input type="text" name="userId">
	<br>
	비밀번호 : <input type="password" name="userPassword">
	<br>
	이름 : <input type="text" name="userName">
	<br>
	나이 : <input type="number" name ="userAge">
	<br>
	성별 : 
	남성 <label><input type="radio" value="남성" name="userGender" checked></label>
	여성	<label><input type="radio" value="여성" name="userGender"></label>
	<br>
	<button>로그인</button>
	</form>
</body>
</html>