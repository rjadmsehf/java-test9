package com.ogiraffers.section02.User;

public class MemberManager {

    public void signUpMembers() {

        MemberDTO[] members = new MemberDTO[5];

        members[0] = new MemberDTO(1, "user01", "pass01", "홍길동", 20, '남');
        members[1] = new MemberDTO(2, "user02", "pass02", "유관순", 16, '여');
        members[2] = new MemberDTO(3, "user03", "pass03", "이순신", 40, '남');
        members[3] = new MemberDTO(4, "user04", "pass04", "신사임당", 36, '여');
        members[4] = new MemberDTO(5, "user05", "pass05", "윤성빈", 22, '남');

        MemberInsertManager memberInsertManager = new MemberInsertManager();
        memberInsertManager.insert(members);
    }

    public void printAllMembers() {

        MemberDTO[] selectedMembers = new MemberSelectManager().selectAllMembers();

        System.out.println("----------- 가입된 회원 목록 --------------");
        for(MemberDTO member : selectedMembers) {
            System.out.println(member.getInformation());
        }
        System.out.println("---------------------------------------");
        System.out.println("총 " + selectedMembers.length + "명의 회원이 가입되어 있습니다.");
    }

}
