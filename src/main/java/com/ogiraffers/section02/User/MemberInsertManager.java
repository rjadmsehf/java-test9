package com.ogiraffers.section02.User;

public class MemberInsertManager {
    public void insert(MemberDTO[] members) {

        System.out.println("회원을 등록합니다");

        for(int i = 0; i < members.length; i++) {
            System.out.println(members[i].getName() + "님을 회원 등록에 성공했습니다.");
        }
        System.out.println("총 " + members.length + "명의 회원 등록에 성공했습니다.");
    }

}
