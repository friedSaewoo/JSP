<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp" /> <!-- ++ -->
	<!-- 1. index.jsp에서 사용자에게 나이를 입력받고 result.jsp에 나이를 출력하기 -->
	<!-- 2. 서블릿을 수정하여 나이를 만 나이로 출력하기 (-1을 한다) -->
	<!-- 3. 선택안함, 남자, 여자 라디오 버튼을 3개 만들어서 result 페이지에 결과 출력하기 -->
	<form action="/day03/MyServlet" method="post">
		<input type="text" name ="userName" placeholder="이름을 입력하세요">
       	<input type="text" name ="userAge" placeholder="나이를 입력하세요">

   		<br>
   		무응답 <input type="radio" name="userGender" value ="N">
   		<br>
   		남자  <input type="radio" name="userGender" value ="M">
   		<br>
   		여자 <input type="radio" name="userGender" value ="F">
   		<br>
   		검정 <input type = "checkbox" name = "color" value = "black">
		파랑 <input type = "checkbox" name = "color" value = "blue">
		빨강 <input type = "checkbox" name = "color" value = "red">
   		<button>전송</button>
   		</form> 
	<jsp:include page="footer.jsp"></jsp:include> <!-- ++ -->
</body>
</html>