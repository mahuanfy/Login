package com.eu.login.servlet;

import com.eu.login.entity.Login;
import com.eu.login.service.LoginService;
import com.eu.login.service.impl.LoginServiceImpl;

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
@WebServlet("/register")
public class registerServlet extends HttpServlet {
    LoginService loginService = new LoginServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        Login login = new Login();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        login.setUsername(username);
        login.setPassword(password);
        login.setSex(sex);
        try {
           loginService.register(login);
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
