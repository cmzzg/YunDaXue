package com.yundaxue.servlet;

import com.yundaxue.dao.BaseDao;
import com.yundaxue.pojo.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;

@WebServlet(name = "PublishServlet")
public class PublishServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/json;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        /*设置响应头允许ajax跨域访问 *代表所有域名可以访问,http://192.168.0.187:8080 只有一个域可以访问 */
        response.setHeader("Access-Control-Allow-Origin", "*");
        /*允许使用cookie*//*如果请求带有cookie,则上一句第二个参数不能写*号只能写具体路径*/
        /*response.setHeader("Access-Control-Allow-Credentials","true");*/
        //获取微信小程序get的参数值并打印
        String title = request.getParameter("title");
        Writer out = response.getWriter();
        System.out.println(title);
        out.write("进入后台了");
        out.flush();
    }
}
