package com.servlet.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		String result = request.getParameter("userName");
//		System.out.println(result);
		
//		response 객체는 getWriter()를 가지고 있다.
//		getWriter()의 반환 타입은 PrintWriter이다
//		즉, PrintWriter 객체를 반환하며 이 객체는 스트림을 사용해 출력하는 객체이다
//		이 객체에 print()메소드를 사용하면 클라이언트 화면에 보여줄 문자열을 응답객체에 담을 수 있다
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		out.print("<h1>" + request.getParameter("userName")+ "님 환영합니다</h1>");
//		out.close();

		//getRequestDispatcher("경로").forward(request, response)는
		//다른 서블릿이나 jsp로 요청을 전달한다
		//주로 클라이언트의 요청을 받아 다른 페이지로 이동시킬 때 사용한다
		//getRequestDispatcher()는 request객체가 가지고 있으며 request객체를 전달할 파일 경로를 매개변수로 넘겨줘야한다
		//forward()에 request 객체를 넘겨주므로 request가 가지고 있는 데이터를 유지한채로 jsp 파일로 이동한다.
		request.setAttribute("userName",request.getParameter("userName"));
		request.getRequestDispatcher("/result.jsp").forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
