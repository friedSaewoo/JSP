package com.example.app;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Execute {
	public Result execute(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServerException;
	
	
}