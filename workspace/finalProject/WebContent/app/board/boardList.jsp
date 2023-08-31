<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>자유게시판</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/boardList.css" />
  </head>
  <body>
    <header>
      <div class="header">
        <div class="header-left">
          <h1>자유게시판</h1>
        </div>
        <div class="header-right">
          <div class="btn-group">
            <!-- 로그인 페이지 이동 처리 -->
            <a href="${pageContext.request.contextPath}/member/login.me" class="login-btn">로그인</a>
            <!-- 회원가입 페이지 이동 처리 -->
            <a href="${pageContext.request.contextPath}/member/join.me" class="join-btn">회원가입</a>
          </div>
        </div>
      </div>
    </header>
    <div class="container">
      <div class="write-btn-wrap">
        <!-- 글쓰기 페이지 이동 처리 -->
        <a href="#" class="write-btn">글쓰기</a>
      </div>
      <table class="board-table">
        <thead>
          <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>날짜</th>
            <th>조회수</th>
          </tr>
        </thead>
        <tbody>
          <!-- ========== 게시글 목록 예시 =========== -->
          <c:choose>
             <c:when test = "${not empty boardList}">
              <c:forEach var="board" items="${boardList}">
                 <tr>
                    <td><c:out value = "${board.getBoardNumber()}"/></td>
                    <td><c:out value = "${board.getBoardTitle()}"/></td>
                    <td><c:out value = "${board.getMemberId()}"/></td>
                    <td><c:out value = "${board.getBoardDate()}"/></td>
                    <td><c:out value = "${board.getBoardReadCount()}"/></td>
                 </tr>
         </c:forEach>
             </c:when>
             <c:otherwise>
                <tr>
                   <td colspan = "5" align = "center" > 등록된 게시물이 없습니다 </td>
                </tr>
             </c:otherwise>
          </c:choose>
          <!-- ========== /게시글 목록 예시 =========== -->
        </tbody>
      </table>
      <div class="pagination">
        <ul>
          <!-- ========== 페이징 처리 예시 ============ -->
          <li><a href="#" class="prev">&lt;</a></li>
          <li><a href="#" class="active">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">5</a></li>
          <li><a href="#" class="next">&gt;</a></li>
          <!-- ========== /페이징 처리 예시 ============ -->
        </ul>
      </div>
    </div>
  </body>
</html>