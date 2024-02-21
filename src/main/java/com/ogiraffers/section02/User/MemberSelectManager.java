package com.ogiraffers.section02.User;

public class MemberSelectManager {
    public MemberDTO[] selectAllMembers() {

        return new MemberDTO[] {
                new MemberDTO(1, "user01", "pass01", "홍길동", 20, '남'),
                new MemberDTO(2, "user02", "pass02", "유관순", 16, '여'),
                new MemberDTO(3, "user03", "pass03", "이순신", 40, '남'),
                new MemberDTO(4, "user04", "pass04", "신사임당", 36, '여'),
                new MemberDTO(5, "user05", "pass05", "윤성빈", 22, '남')
        };
    }

}
