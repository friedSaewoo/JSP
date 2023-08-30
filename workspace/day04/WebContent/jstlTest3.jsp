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
	<form action ="JstlServlet">
		<input type="hidden" name ="id" value="admin">
		<button>admin</button>
	</form>
	
	<form action ="JstlServlet" method="get">
		<button type="submit" name ="id" value="member">member</button>
	</form>
	
	<c:set var ="id" value="${requestScope.id}"/>

	<c:choose>
		<c:when test="${id=='admin' }">
			<h1>
				<c:out value="${id }"/>
			</h1>
		</c:when>
		<c:when test="${id=='member' }">
			<h1>
				<c:out value="${id }"/>
			</h1>
		</c:when>
		<c:otherwise>
			<h1>
				<c:out value="없다"/>
			</h1>
		</c:otherwise>
	</c:choose>
	
	<%--
	<c:if test="${id=='admin' }">
		<h3>현재 로그인된 계정은 <c:out value="${id}"/></h3>
	</c:if>
	<c:if test="${id == 'member'}">
		<h3>현재 로그인된 계정은 일반 계정입니다.</h3>
	</c:if>
	--%>
</body>
</html>