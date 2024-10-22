package com.ssafy.mvc.model.dao;

import com.ssafy.mvc.model.dto.Member;

public interface MemberDao {

    // 회원 등록하기
    public Member insertMember(String id, String pw, String name);

    public Member isMember(String id, String pw);
    // 회원정보 가져오기
    public Member selectMember(Member member);

    // 회원정보변경
    public void updateMember(String id);

    // 회원삭제
    public void deleteMember(String id);
}
