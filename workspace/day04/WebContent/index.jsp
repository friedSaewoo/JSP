<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jsp태그</h1>
	<%!
		int num1 = 10;
		int num2 = 20;
		
		int addNum(){
			return num1 + num2;
		}
	%>
	
	<h3><%= num1 %></h3>
	<h3><%= num2 %></h3>
	<h3><%= addNum() %></h3>
	
	<%
		int num3 = 20;
	%>
	<h3><%=num3 %></h3>
	
	<%
		for(int i=0; i<10; i++){
			out.println(i+"번째");
		}
	%>
	
	<br>
	<span>=====================</span>
	<br>
	<% 
		for(int i=0; i<10; i++)
		{ 
	%>
		<h3><%=i %></h3>
	<% } %>
	
</body>
</html>


















