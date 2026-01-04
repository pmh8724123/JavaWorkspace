package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
    public static final int SIZE = 10;
    private Member[] m = new Member[SIZE];

    // 현재 존재하는 멤버 수 반환
    public int existMemberNum() {

        int num = 0;

        for(int i= 0; i < m.length; i++) {
            if(m[i] != null) {
                num++;
            }
        }
        return num;
    }

    public boolean checkId(String inputId) {

        return false;
    }

    public void insertMember(String id, String name, String password, String email, String gender, int age) {

    }

    public String searchId(String id) {

        return ""; 
    }

    public Member[] searchName(String name) {

        return;
    }

    public Member[] searchEmail(String email) {

        return;
    }

    public boolean updatePassword(String id, String password) {

        return false;
    }

    public boolean updateName(String id, String name) {

        return false;
    }

    public boolean updateEmail(String id, String email) {

        return false;
    }

    public boolean delete(String id) {

        return false;
    }

    public void delete() {

    }

    public Member[] printAll() {

        return;
    }

}