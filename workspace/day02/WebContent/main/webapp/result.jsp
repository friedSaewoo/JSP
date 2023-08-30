<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>이름이 들어갈 위치</h1>
	<!-- jsp파일의 <% %>영역은 자바 명령어를 작성할 수 있으며 스크립틀릿이라고 부른다 -->
	<h1><%=request.getAttribute("userName") + "님 환영합니다" %></h1>
	<!-- 서블릿에서 저장한 키를 이용하여 데이터를 사용한다. -->
</body>
</html>