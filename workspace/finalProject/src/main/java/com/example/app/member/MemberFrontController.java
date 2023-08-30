package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //post방식으로 보내게 되면 request 객체에 저장된 한글이 깨지므로 utf-8 추가해야한다
      request.setCharacterEncoding("utf-8");
      doProcess(request, response);
   }
   
   //jsp프로젝트에서는 get과 post를 구분하지 않고 사용
   protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String target = request.getRequestURI().substring(request.getContextPath().length());
      System.out.println(target);
      
      switch(target) {
      case "/member/join.me":
    	  request.getRequestDispatcher("/app/member/join.jsp").forward(request, response);
    	  break;
      case "/member/joinOk.me":
    	  break;
   
      case "/member/checkId.me":
    	  break;
   
      case "/member/login.me":
    	  request.getRequestDispatcher("/app/member/login.jsp").forward(request, response);
    	  break;
   
      case "/member/loginOk.me":
    	  break;
   
      }
   }
}






