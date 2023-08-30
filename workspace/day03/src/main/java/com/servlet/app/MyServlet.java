package com.servlet.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;

/**
 * Servlet implementation class MyServlet
 */

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//POST 방식을 사용하는 경우 request의 인코딩 방식을 별도로 설정해줘야 한다
		request.setCharacterEncoding("UTF-8");
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("userName",request.getParameter("userName"));
//		request.setAttribute("userAge",request.getParameter("userAge"));
		request.setAttribute("userAge",Integer.parseInt(request.getParameter("userAge"))-1);
		request.setAttribute("userGender",request.getParameter("userGender"));
		request.getRequestDispatcher("/result.jsp").forward(request, response);
//		response.sendRedirect("/day03/result.jsp");
		
		System.out.println(request.getParameter("color"));
		String[] arData= request.getParameterValues("color");
		System.out.println(Arrays.toString(arData));

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
