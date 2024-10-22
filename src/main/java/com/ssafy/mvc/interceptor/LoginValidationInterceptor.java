package com.ssafy.mvc.interceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginValidationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String pw = request.getParameter("pw");

        if (pw != null && !"".equals(pw)){
            System.out.println("패스워드가 빈 문자열이 아닙니다.");
            return true;
        }
        System.out.println("패스워드가 빈 문자열입니다.");

        RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/views/member/loginform.jsp");
        request.setAttribute("errMsg", "비밀번호를 입력해주세요.");
        disp.forward(request, response);
        return false;
    }
}
