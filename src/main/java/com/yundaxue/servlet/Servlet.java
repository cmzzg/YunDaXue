package com.yundaxue.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        /*设置响应头允许ajax跨域访问 *代表所有域名可以访问,http://192.168.0.187:8080 只有一个域可以访问 */
        response.setHeader("Access-Control-Allow-Origin", "*");

        String code = request.getParameter("code");
        System.out.println(code + "---Servlet");
        Writer out = response.getWriter();
        out.write(code);
        out.flush();
    }
}
