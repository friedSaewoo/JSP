<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <!-- jstl에서 제공하는 ${pageContext.request.contextPath}를 루트경로를 의미한다 -->
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/login.css">
   
</head>
<body>
   <main>
      <form action="${pageContext.request.contextPath}/member/loginOk.me" method ="post">
         <div class = "id">
         id : <input type="text" name="memberId"/>
         </div>
         <div class = "password">
         password : <input type="password" name="memberPassword"/>
         </div>
      
         <div class = "btn">
               <button>로그인</button>
            </div>
      </form>
   </main>   
</body>
</html>