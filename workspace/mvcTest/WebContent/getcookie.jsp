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
		Cookie[] cookies=request.getCookies();
	
	for(int i = 0; i < cookies.length; i++){
		String str = cookies[i].getName();
		//getName() : 쿠키 이름을 얻어오는 메소드
		//getValue() : 쿠키 값을 얻어오는 메소드
		if(str.equals("cookieName")){
			out.println("cookies" + i + "name : " + cookies[i].getName() +"<br>");
			out.println("cookies" + i + "value : " + cookies[i].getValue() +"<br>");
			out.println("------------------------------------------------------------<br>");
		}
	}
	%>
</body>
</html>