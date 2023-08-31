package com.example.app.member;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.dto.MemberDTO;

public class LoginOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException {
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		MemberDTO result = null;
		
		memberDTO.setMemberId(request.getParameter("memberId"));
		memberDTO.setMemberPassword(request.getParameter("memberPassword"));
		
		result = memberDAO.login(memberDTO);
		
		System.out.println(result.getMemberName());
		System.out.println(result.getMemberNumber());
		
		//회원의 번호, 이름을 세션에 저장한다
		HttpSession session = request.getSession();
		session.setAttribute("memberNumber", result.getMemberNumber());
		session.setAttribute("memberName", result.getMemberName());
		
		response.sendRedirect(request.getContextPath());
		
		return null;
	}

	
}
