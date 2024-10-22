package com.ssafy.mvc.model.service;

import com.ssafy.mvc.model.dto.Member;

public interface MemberService {
    // 회원등록
    public void registMember(String id, String pw, String name);

    // 회원확인
    public Member isMember(String id, String pw);

    // 회원정보 가져오기
    public Member getMember(Member member);

    // 회원정보변경
    public void modifyMember(String id);

    // 회원삭제
    public void removeMember(String id);
}
