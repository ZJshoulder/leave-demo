package com.moyun.leave.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.activiti.engine.identity.User;

public class LoginFilter extends HttpServlet implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;  
        HttpServletResponse response = (HttpServletResponse) resp;  
        HttpSession session = request.getSession(true);  
  
        String url = request.getRequestURI();  
        User user = (User) session.getAttribute("admin");  
        if (user == null && url.indexOf("login.jsp") == -1  ) {  
            String location = "/";  
            response.sendRedirect(request.getContextPath()+location);
            System.out.println("成功拦截到外星人企图入侵网站后台   :  " + url);  
        } else {  
            chain.doFilter(request, response);  
        }  
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
