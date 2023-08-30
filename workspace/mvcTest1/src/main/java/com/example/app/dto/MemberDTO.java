package com.example.app.dto;

public class MemberDTO {
//   create table tbl_member(
//         member_number int unsigned auto_increment primary key,
//         member_id varchar(300),
//         member_password varchar(300),
//         member_name varchar(300),
//         member_age tinyint unsigned,
//         member_gender char(1)
//         );

   private int memberNumber;
   private String memberId;
   private String memberPassword;
   private String memberName;
   private int memberAge;
   private String memberGender;
   
   public MemberDTO() {;}
   
   public int getMemberNumber() {
      return memberNumber;
   }
   public void setMemberNumber(int memberNumber) {
      this.memberNumber = memberNumber;
   }
   public String getMemberId() {
      return memberId;
   }
   public void setMemberId(String memberId) {
      this.memberId = memberId;
   }
   public String getMemberPassword() {
      return memberPassword;
   }
   public void setMemberPassword(String memberPassword) {
      this.memberPassword = memberPassword;
   }
   public String getMemberName() {
      return memberName;
   }
   public void setMemberName(String memberName) {
      this.memberName = memberName;
   }
   public int getMemberAge() {
      return memberAge;
   }
   public void setMemberAge(int memberAge) {
      this.memberAge = memberAge;
   }
   public String getMemberGender() {
      return memberGender;
   }
   public void setMemberGender(String memberGender) {
      this.memberGender = memberGender;
   }

   @Override
   public String toString() {
      return "MemberDTO [memberNumber = " + memberNumber + 
            ", memberId = " + memberId + ", memberPassword= " + memberPassword
            + ", memberName = " + memberName + ", memberAge = " + memberAge
            + ", memberGender = " + memberGender + "]";
   }
   
   
   
}