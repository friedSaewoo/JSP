package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Result;

/**
 * Servlet implementation class MemberFrontController
 */

public class MemberFrontController extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
//      response.getWriter().append("Served at: ").append(request.getContextPath());
      doProcess(request, response);
      request.setCharacterEncoding("utf-8");
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //post방식으로 보내게 되면 request 객체에 저장된 한글이 깨지므로 utf-8 추가해야한다
      request.setCharacterEncoding("UTF-8");
      doProcess(request, response);
   }
   
   //jsp프로젝트에서는 get과 post를 구분하지 않고 사용
   protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   System.out.println("Member 서블릿이 실행");
      
      //request.getContextPath()는 URL루트 경로를 의미한다
      System.out.println(request.getContextPath());
      
      //request.getRequestURI는 현재 요청의 URI를 보여준다      
      System.out.println(request.getRequestURI());
      
      //전체 URI에서 ContextPath를 제외시킨 부분이 필요하다
      String target = request.getRequestURI().substring(request.getContextPath().length());
      System.out.println(target);
      Result result = null;
      
      //단순한 값비교는 if문보다 switch문이 효율성이 좋고 가독성도 좋다
      //break문을 꼭 써야된다!
      switch(target) {
      case "/member/join.me":
         System.out.println("join!!");
         request.getRequestDispatcher("/app/member/join.jsp").forward(request, response);
         break;
      case "/member/joinOk.me":
         System.out.println("joinOk!!");
         result = new JoinOkController().execute(request, response);
         break;
         
      case "/member/login.me":
         System.out.println("login!!");
         request.getRequestDispatcher("/app/member/login.jsp").forward(request, response);
         break;
      case "/member/loginOk.me":
         System.out.println("loginOk!!");
         new LoginOkController().execute(request, response);
         break;
         
      case "/member/logoutOk.me":
    	  System.out.println("logout!");
    	  result = new LogoutOkController().execute(request, response);
    	  
      case "/member/checkIdOk.me":
    	  System.out.println("checkId");
    	  new CheckIdOkController().execute(request, response);
      }
      
      if(result != null) {
    	  if(result.isRedirect()) {
    		  response.sendRedirect(result.getPath());
    		  //리다이렉션을 필요로 한다면 리다이렉션을 수행한다.
    		  //
    	  }else {
    		  request.getRequestDispatcher(result.getPath()).forward(request,response);
    		  //포워딩을 필요로 하면 result 객체의 경로로 포워딩 한다.
    	  }
      }
      
   }
}






