package com.example.app.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardFrontController
 */
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	    request.setCharacterEncoding("utf-8");
	    doProcess(request, response);
	}
	
	   protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      String target = request.getRequestURI().substring(request.getContextPath().length());
		      System.out.println(target);
		      
		      switch(target) {
		      case "/board/join.me":
		    	  request.getRequestDispatcher("/app/member/join.jsp").forward(request, response);
		    	  break;
		      case "/board/joinOk.me":
		    	  break;
		   
		      case "/board/checkId.me":
		    	  break;
		   
		      case "/board/login.me":
		    	  request.getRequestDispatcher("/app/member/login.jsp").forward(request, response);
		    	  break;
		   
		      case "/board/loginOk.me":
		    	  break;
		   
		      }
		   }

}
