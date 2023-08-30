package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

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
	   //post방식으로 보내게 되면 request 객체에 저장된 한글이 깨지므로 utf-8 추가해야한다.
	   request.setCharacterEncoding("UTF-8");
      doProcess(request, response);
   }
   
   //jsp프로젝트에서는 get과 post를 구분하지 않고 사용할 것이다
   protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("Member 서블릿이 실행");
      
      //request.getContextPath()는 URL 루트 경로를 의미한다
      System.out.println(request.getContextPath());
      
      //request.getRequestURI()는 현재 요청의 URI를 보여준다
      System.out.println(request.getRequestURI());
      
      //전체 URI에서 ContextPath를 제외시킨 부분이 필요하다
      String target = request.getRequestURI().substring(request.getContextPath().length());
      System.out.println(target);
      
      //단순 값비교는 if문보다 switch문이 효율성이 좋고 가독성도 좋다
      //break문을 꼭 써야한다!!
      switch(target) {
      case "/member/join.me":
         System.out.println("join!!");
         request.getRequestDispatcher("/app/member/join.jsp").forward(request, response);
         break;
      case "/member/joinOk.me":
         System.out.println("joinOk!!");
         
         MemberDTO memberDTO = new MemberDTO();
         
         System.out.println(memberDTO);
         
         memberDTO.setMemberId(request.getParameter("memberId"));
         memberDTO.setMemberPassword(request.getParameter("memberPassword"));
         memberDTO.setMemberName(request.getParameter("memberName"));
         memberDTO.setMemberAge(Integer.valueOf(request.getParameter("memberAge")));
         //valueOf()는 문자열을 Integer로 바꿔준다
         //parseInt()는 문자열이 숫자가 아닐 경우 numberFormatException 예외발생하지만
         //valueOf()는 null을 반환한다(예외발생하지 않음)
         memberDTO.setMemberGender(request.getParameter("memberGender"));

  
         
         SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
         sqlSession.insert("member.join", memberDTO);
         
         response.sendRedirect(request.getContextPath());
         break;
         
         
         
      case "/member/login.me":
         System.out.println("login!!");
         request.getRequestDispatcher("/app/member/login.jsp").forward(request, response);
         break;
      case "/member/loginOk.me":
         System.out.println("loginOk!!");
         break;
      }
      
}
}










