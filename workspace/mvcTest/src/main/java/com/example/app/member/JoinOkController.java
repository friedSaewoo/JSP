package com.example.app.member;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.dto.MemberDTO;

public class JoinOkController implements Execute{

	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException{
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		Result result = new Result();
		
		memberDTO.setMemberId(request.getParameter("memberId"));
        memberDTO.setMemberPassword(request.getParameter("memberPassword"));
        memberDTO.setMemberName(request.getParameter("memberName"));
        memberDTO.setMemberAge(Integer.valueOf(request.getParameter("memberAge")));
        //valueOf()는 문자열열 Integer로 바꿔준다
        //parseInt()는 문자열이 숫자가 아닐 경우 numberFormatException 예외발생하지만
        //valueOf()는 null을 반환한다(예외발생하지 않음)
        memberDTO.setMemberGender(request.getParameter("memberGender"));
        System.out.println(memberDTO);
        
        memberDAO.join(memberDTO);
        result.setRedirect(true);
        result.setPath(request.getContextPath());
        
        return result;
	}
}
