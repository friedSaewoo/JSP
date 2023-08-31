package com.example.app.board.dto;

public class BoardDTO {
   //board_number int 
   //board_title varchar(300),
   //board_content varchar(1000),
   //board_date datetime,
   //board_read_count int unsigned,
   //member_number int unsigned,
   
   private int boardNumber;
   private String boardTitle;
   private String boardContent;
   private String boardDate;
   private int boardReadCount;
   private int memberNumber;

   //기본생성자, getter, setter, toString 만들기
   public BoardDTO() {
      super();
   }

   public int getBoardNumber() {
      return boardNumber;
   }

   public void setBoardNumber(int boardNumber) {
      this.boardNumber = boardNumber;
   }

   public String getBoardTitle() {
      return boardTitle;
   }

   public void setBoardTitle(String boardTitle) {
      this.boardTitle = boardTitle;
   }

   public String getBoardContent() {
      return boardContent;
   }

   public void setBoardContent(String boardContent) {
      this.boardContent = boardContent;
   }

   public String getBoardDate() {
      return boardDate;
   }

   public void setBoardDate(String boardDate) {
      this.boardDate = boardDate;
   }

   public int getBoardReadCount() {
      return boardReadCount;
   }

   public void setBoardReadCount(int boardReadCount) {
      this.boardReadCount = boardReadCount;
   }

   public int getMemberNumber() {
      return memberNumber;
   }

   public void setMemberNumber(int memberNumber) {
      this.memberNumber = memberNumber;
   }

   @Override
   public String toString() {
      return boardNumber + "," + boardTitle + "," + boardContent + "," 
            + boardDate+ "," + boardReadCount;
      
   }
}