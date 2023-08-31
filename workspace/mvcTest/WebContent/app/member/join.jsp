<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <!-- jstl에서 제공하는 ${pageContext.request.contextPath}를 루트경로를 의미한다 -->
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/join.css">
   
</head>
<body>
   <main>
      <form action="joinOk.me" method ="post">
         <div class = "id">
         id : <input type="text" name="memberId"/>
         </div>
         <div class="checkId-result"></div>
         <div class = "password">
         password : <input type="password" name="memberPassword"/>
         </div>
         <div class = "name">
         name : <input type="text" name="memberName"/>
         </div>
         <div class = "age">
         age : <input type="text" name="memberAge"/>
         </div>
         <div class = "gender">
            <div>
               남자 : <input type="radio" name="memberGender" value="M"/>
            </div>
            <div>
               여자 : <input type="radio" name="memberGender" value="F"/>
            </div>
         </div>
         <div class = "btn">
               <button>회원가입</button>
            </div>
      </form>
   </main>
   <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
   <script>
      $('.id > input').on('change', function(){
         let id = $(this).val();
         
         console.log(this);
         console.log(id);
         
         $.ajax({
            url : "checkIdOk.me",
            type : "get",
            data : {"id" : id},
            success : function(result){
               console.log(result)
               $('.checkId-result').text(result);
            }
         })
      });
   </script>
</body>
</html>












