package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.member.MemberDAO;
import com.example.app.member.dto.MemberDTO;

public class JoinOkController implements Execute{
   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      MemberDAO memberDAO = new MemberDAO();
      MemberDTO memberDTO = new MemberDTO();

      request.setCharacterEncoding("UTF-8");
      
      memberDTO.setMemberId(request.getParameter("memberId"));
      memberDTO.setMemberPassword(request.getParameter("memberPassword"));
      memberDTO.setMemberName(request.getParameter("memberName"));
      memberDTO.setMemberAge(Integer.valueOf(request.getParameter("memberAge")));
      memberDTO.setMemberGender(request.getParameter("memberGender"));
//      memberDTO.setMemberEmail(request.getParameter("memberEmail"));
//      memberDTO.setMemberAddress(request.getParameter("memberAddress"));
//      
      memberDAO.join(memberDTO);
      response.sendRedirect("/member/login.me");
   }
}