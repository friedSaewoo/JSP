package com.servlet.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

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
		
		request.setAttribute("userId",request.getParameter("userId"));
		request.setAttribute("userPassword",request.getParameter("userPassword"));
		request.setAttribute("userName",request.getParameter("userName"));
		request.setAttribute("userAge",Integer.parseInt(request.getParameter("userAge")));
		request.setAttribute("userGender",request.getParameter("userGender"));
		
		SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
		//sqlSession.commit();
		//sqlSession.rollback();
		
		//userMapper.xml에 넘겨줄 Map파일 만들기
		Map<String, String> userMap = new HashMap<>();
		userMap.put("userId",request.getParameter("userId"));
		userMap.put("userPassword",request.getParameter("userPassword"));
		userMap.put("userName",request.getParameter("userName"));
		userMap.put("userAge",request.getParameter("userAge"));
		userMap.put("userGender",request.getParameter("userGender"));
		
		sqlSession.insert("user.join",userMap);
		
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
