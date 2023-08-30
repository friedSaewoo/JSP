<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"/> <!-- ++ -->
	<!-- 1. index.jsp에서 사용자에게 나이를 입력받고 result.jsp에 나이를 출력하기  -->
	<!-- 2. 서블릿을 수정하여 나이를 만 나이로 출력하기(-1을 한다) -->
	<!-- 3. 선택안함, 남자, 여자 라디오 버튼을 3개 만들어서 result 페이지에 결과 출력하기 -->
	<h1><%=request.getAttribute("userName") + "님 환영합니다!!" %></h1>
	<h1><%="만" + request.getAttribute("userAge") + "살 입니다." %></h1>
	<h1><%=request.getAttribute("userGender")%></h1>
	<jsp:include page="footer.jsp"/><!-- ++ --><!-- ++ -->
</body>
</html>