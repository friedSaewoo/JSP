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
	<%
		pageContext.setAttribute("name","홍길동");
	%>
	<h1>${name}</h1>
	<h1>${requestScope.name}</h1>
	<h1>${param.name}</h1>
	
	<%-- <c:set var="num">123</c:set> --%>
	<c:set var="num" value="1234" />
	<h3><c:out value="${num}"></c:out></h3>
</body>
</html>