package com.eu.login.servlet;

import com.eu.login.entity.Login;
import com.eu.login.service.LoginService;
import com.eu.login.service.impl.LoginServiceImpl;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 马欢欢 on 17-11-6.
 *
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        LoginService loginService = new LoginServiceImpl();
        Login login = new Login();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        login.setUsername(username);
        login.setPassword(password);
        try {
            Login user = loginService.login(login);
            if(user!=null){
                req.getSession().setAttribute("user",user);
                resp.sendRedirect(req.getContextPath()+"/page/success.jsp");
            }else{
                req.setAttribute("err","用户名或密码有误，请重新登录");
                req.getRequestDispatcher("/index.html").forward(req,resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
