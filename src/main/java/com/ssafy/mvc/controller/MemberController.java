package com.ssafy.mvc.controller;

import com.ssafy.mvc.model.dto.Member;
import com.ssafy.mvc.model.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/loginform")
    public String loginform(){
        return "/member/loginform";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute Member member, HttpServletRequest request) {
        try {
            member = memberService.isMember(member.getId(), member.getPw());
            if (member.getId() != null) {
                HttpSession session = request.getSession();
                session.setAttribute("loginMember", member.getName());
                return "redirect:list";
            }
        } catch (Exception e) {
            System.out.println("해당하는 회원정보가 없습니다.");
        }
        return "redirect:loginform";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/registform")
    public String registform(){
        return "/member/registform";
    }

    @PostMapping("regist")
    public String regist(@ModelAttribute Member member){
        memberService.registMember(member.getId(), member.getPw(), member.getName());
        return "/member/loginform";
    }

}
