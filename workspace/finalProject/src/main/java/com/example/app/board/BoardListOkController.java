package com.example.app.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.board.dao.BoardDAO;

public class BoardListOkController implements Execute{

   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      BoardDAO boardDAO = new BoardDAO();
      System.out.println("BoardListOkController");
      request.setAttribute("boardList", boardDAO.selectAll());

      request.getRequestDispatcher("/app/board/boardList.jsp").forward(request, response);
      System.out.println("BoardListOkController1");
   }
   
}