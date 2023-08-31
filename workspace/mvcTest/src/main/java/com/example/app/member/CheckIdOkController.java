package com.example.app.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;

public class CheckIdOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {
		MemberDAO memberDAO = new MemberDAO();
		boolean isTrue = memberDAO.checkId(request.getParameter("id"));
		String result = null;
		
		//PrintWriter 가져오기 전에 설정해야함
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		System.out.println(request.getParameter("id"));
		if(isTrue) {
			result = "사용가능";
		}else {
			result = "중복된 아이디";
		}
		
		out.print(result);
		out.close();
		
		return null;
	}

}
