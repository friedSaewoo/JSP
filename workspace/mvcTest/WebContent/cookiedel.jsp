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
		//1. 쿠키 가져오기(지울 쿠키가 있는지 체크)
		Cookie[] cookies = request.getCookies();
		String cName = "";
		String cValue = "";
		
		//2. 쿠키 값이 있을 때에만 삭제
		if(cookies != null){
			for(int i = 0; i < cookies.length; i++){
				//3. 쿠키 전체 유효시간을 0으로 설정 만료
				cookies[i].setMaxAge(0);
				//4. 변경된 쿠키 정보를 클라이언트에 전달
				response.addCookie(cookies[i]);
			}
		}
	%>
<scirpt type ="text/javascript">
	alert("쿠키값 삭제 성공")
	location.href="cookie.jsp"
</scirpt>
</body>
</html>


