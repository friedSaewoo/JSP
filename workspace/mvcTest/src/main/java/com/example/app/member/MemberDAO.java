package com.example.app.member;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberDAO {

	public SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void join(MemberDTO memberDTO) {
		sqlSession.insert("member.join",memberDTO);
	}
	
	public MemberDTO login(MemberDTO memberDTO) {
		MemberDTO member = sqlSession.selectOne("member.login",memberDTO);
		return member;
	}
	
	public boolean checkId(String memberId) {
		//selectOne()의 반환타입은 Object 타입이라 비교를 하기위해 Integer로 형변환
		return (Integer)sqlSession.selectOne("member.checkId",memberId) <= 0;
	}
	
}
