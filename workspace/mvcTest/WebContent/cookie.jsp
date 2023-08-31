<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("cookieName","cookieValue");
		//cookie.setMaxAge(60*60);    //쿠키 유효기간 설정(1시간)
		cookie.setMaxAge(600);    //쿠키 유효기간 설정(초 단위)
		response.addCookie(cookie);
	%>
	<input type ="button" value= "getcookie" onclick="location.href='getcookie.jsp'">
</body>
</html>