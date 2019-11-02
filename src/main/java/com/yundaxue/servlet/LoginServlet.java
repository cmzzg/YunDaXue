package com.yundaxue.servlet;

import com.yundaxue.pojo.UserInfo;
import com.yundaxue.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        /*设置响应头允许ajax跨域访问 *代表所有域名可以访问,http://192.168.0.187:8080 只有一个域可以访问 */
        response.setHeader("Access-Control-Allow-Origin", "*");
        UserInfo ui = new UserInfo();
        ui.setUser_nickname(request.getParameter("nickName"));
        ui.setUser_avatar(request.getParameter("avatarUrl"));
//        String unionid = request.getParameter("unionid");
        String gender = request.getParameter("gender");
        int a = 3;
        if (gender != ""){
            a = Integer.parseInt(gender);
        }
        ui.setUser_gender_id(a);
        LoginServiceImpl lsi = new LoginServiceImpl();
        String login = lsi.Login(ui);
        Writer out = response.getWriter();
//        System.out.println(unionid);
        System.out.println(login);
        out.write(login);
        out.flush();
    }
}
