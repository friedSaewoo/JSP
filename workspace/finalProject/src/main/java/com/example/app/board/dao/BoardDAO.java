package com.example.app.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.board.vo.BoardVO;
import com.mybatis.config.MyBatisConfig;

public class BoardDAO {
   public SqlSession sqlSession;
   
   public BoardDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
   public List<BoardVO> selectAll(){
	   System.out.println(1);
      return sqlSession.selectList("board.selectAll");
   }
}