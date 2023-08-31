<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test = "${not empty sessionScope.memberNumber}">
			<h1>${sessionScope.memberName} 님 환영합니다!</h1>
			<form action = "member/logoutOk.me">
				<button>logout</button>
			</form>
		</c:when>
		<c:otherwise>
			<form action = "http://localhost:8888/mvcTest/member/join.me">
				<button>회원가입</button>
			</form>
			<a href="http://localhost:8888/mvcTest/member/login.me">로그인</a>
		</c:otherwise>
	</c:choose>
<!--
   <form action="member/join.me">
      <button>회원가입!!</button>
   </form>
   <a href="http://localhost:8888/mvcTest/member/login.me">로그인하러가기!!</a>
  -->
</body>
</html>