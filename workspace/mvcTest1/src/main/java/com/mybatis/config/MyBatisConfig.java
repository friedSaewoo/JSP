package com.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
   //sqlSession을 만들기 위해 세션 팩토리가 필요하다 
   private static SqlSessionFactory sqlSessionFactory; 
   
      static {
         try {
            
            //설정파일의 경로를 저장한다 
            String resource="./com/mybatis/config/config.xml";
            
            //Resource 클래스를 이용하여 리소스를 읽어들여 Reader객체로 만든다 
            Reader reader=Resources.getResourceAsReader(resource);
            
            //세션 팩토리 빌더에세 패토리를 지어잘라고한다
            sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader);
         }catch(IOException e) {
            System.out.println("MybatisConfig.java 초기화문제 발생!");
            e.printStackTrace();
         }
         
      }
      
   public static SqlSessionFactory getSqlSessionFactory() {
      return sqlSessionFactory;
   }   
      
}