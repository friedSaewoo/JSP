package com.example.app.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberForntController
 */
//@WebServlet("/MemberForntController")
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
      response.getWriter().append("Served at: ").append(request.getContextPath());
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }
   
   protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
	  //request.getContextPath()는 URL루트 경로를 의미한다
	  System.out.println(request.getContextPath());
	      
	  //request.getRequestURI는 현재 요청의 URI를 보여준다      
	  System.out.println(request.getRequestURI());
	  String target = request.getRequestURI().substring(request.getContextPath().length());
      System.out.println(target);
      
      switch(target) {
      case "/member/join.me":
         request.getRequestDispatcher("/app/member/join.jsp").forward(request, response);
         break;
         
      case "/member/joinOk.me" :
         new JoinOkController().execute(request, response);
         break;
         
      case "/member/checkIdOk.me":
         new CheckIdOkController().execute(request, response);
         break;
         
      case "/member/login.me":
         request.getRequestDispatcher("/app/member/login.jsp").forward(request, response);
         break;
         
      }
   }
}










