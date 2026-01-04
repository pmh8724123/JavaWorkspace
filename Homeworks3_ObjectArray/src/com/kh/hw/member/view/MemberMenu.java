package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
   private Scanner sc = new Scanner(System.in);
   private MemberController mc = new MemberController();

   public MemberMenu() {

   }

   public void mainMenu() {

      while(true) {
      // MemberController(mc)클래스 안에 있는 멤버필드를 이용하여 최대 등록 가능한 회원 수가 몇 명인지 출력
      int MaxMember = mc.SIZE;
      System.out.println("최대 등록 가능한 회원 수는 " + MaxMember + "명입니다.");

      // 또한 현재 등록된 회원 수는 mc에 existMemberNum()의 반환 값으로 몇 명이 등록되어 있는지 출력
      int NowMember = mc.existMemberNum();
      System.out.println("현재 등록된 회원 수는 " + NowMember + "명입니다.");

      // 현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력
      // 현재 등록된 회원 수가 10명이 아닐 때
//      1. 새 회원 등록 ➔ insertMember()
//      2. 회원 검색 ➔ searchMember()
//      3. 회원 정보 수정 ➔ updateMember()
//      4. 회원 삭제 ➔ deleteMember()
//      5. 모두 출력 ➔ printAll()
//      9. 끝내기
//      메뉴 번호 : 
      if (NowMember < MaxMember) {
         System.out.println("1. 새 회원 등록");
         System.out.println("2. 회원 검색");
         System.out.println("3. 회원 정보 수정");
         System.out.println("4. 회원 삭제");
         System.out.println("5. 모두 출력");
         System.out.println("9. 끝내기");
         System.out.print("메뉴 번호 : ");
         int menuNum = sc.nextInt();

         switch (menuNum) {
         case 1:
            insertMember();
            break;

         case 2:
            searchMember();
            break;

         case 3:
            updateMember();
            break;

         case 4:
            deleteMember();
            break;

         case 5:
            printAll();
            break;

         case 9:
            System.out.println("프로그램을 종료합니다.");
            return;

         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            break;
         }
      } else if (NowMember == MaxMember) {
         System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
         System.out.println("2. 회원 검색");
         System.out.println("3. 회원 정보 수정");
         System.out.println("4. 회원 삭제");
         System.out.println("5. 모두 출력");
         System.out.println("9. 끝내기");
         int menuNum = sc.nextInt();
         
         switch (menuNum) {

         case 2:
            searchMember();
            break;

         case 3:
            updateMember();
            break;

         case 4:
            deleteMember();
            break;

         case 5:
            printAll();
            break;

         case 9:
            System.out.println("프로그램을 종료합니다.");
            return;

         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            break;
         }
      }

      }
      // 현재 등록된 회원 수가 10명일 때
//      회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.
//      2. 회원 검색 ➔ searchMember()
//      3. 회원 정보 수정 ➔ updateMemner()
//      4. 회원 삭제 ➔ deleteMember()
//      5. 모두 출력 ➔ printAll()
//      9. 끝내기
//      메뉴 번호 :
      // 두 경우 모두 끝내기를 누르면 “프로그램을 종료합니다” 출력 후
      // 프로그램 종료하고 메뉴 번호에 없는 번호를 누를 시
      // “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 메뉴 반복

   }

   public void insertMember() {

   }

   public void searchMember() {

   }

   public void searchId() {

   }

   public void searchName() {

   }

   public void searchEmail() {

   }

   public void updateMember() {

   }

   public void updatePassword() {

   }

   public void updateName() {

   }

   public void updateEmail() {

   }

   public void deleteMember() {

   }

   public void deleteOne() {

   }

   public void deleteAll() {

   }

   public void printAll() {

   }

}
