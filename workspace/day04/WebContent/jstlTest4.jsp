<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> step은 양수만 가능함 음수, 0은 불가</p>
	<p> end를 포함한다!!</p>
	<c:forEach var="i" begin ="1" end="10" step="1">
		<c:out value="${i}"/>
	</c:forEach>
</body>
</html>