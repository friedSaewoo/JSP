<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/task/MyServlet" method="get">
		<input type="text" name="userId" placeholder="아이디를 입력하세요">
		<input type="password" name="userPassword" placeholder="비밀번호를 입력하세요">
		<button>로그인</button>
	</form>
</body>
</html>