package com.chai.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
    //初始化
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       servletRequest.setCharacterEncoding("utf-8");
       servletResponse.setCharacterEncoding("utf-8");
       servletResponse.setContentType("text/html;charset=UTF-8");
        System.out.println("执行前");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("执行后");
    }
    //销毁
    public void destroy() {
        System.out.println("销毁");
    }
}
