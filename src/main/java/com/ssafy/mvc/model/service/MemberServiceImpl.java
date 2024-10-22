package com.ssafy.mvc.model.service;

import com.ssafy.mvc.model.dao.MemberDao;
import com.ssafy.mvc.model.dto.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    private final MemberDao memberDao;

    public MemberServiceImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public void registMember(String id, String pw, String name) {
        memberDao.insertMember(id, pw, name);
    }

    @Override
    public Member isMember(String id, String pw) {
        return memberDao.isMember(id, pw);
    }

    @Override
    public Member getMember(Member member) {
        return memberDao.selectMember(member);
    }

    @Override
    public void modifyMember(String id) {

    }

    @Override
    public void removeMember(String id) {

    }
}
