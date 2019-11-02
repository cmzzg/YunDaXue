package com.yundaxue.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;

import com.alibaba.fastjson.JSONObject;
import com.yundaxue.service.impl.SearchMessageServiceImpl;
import com.yundaxue.util.selectpojo.SelectAllMessages;

public class SearchMessageServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");

		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		/*设置响应头允许ajax跨域访问 *代表所有域名可以访问,http://192.168.0.187:8080 只有一个域可以访问 */
		response.setHeader("Access-Control-Allow-Origin", "*");
		/*允许使用cookie*//*如果请求带有cookie,则上一句第二个参数不能写*号只能写具体路径*/
		String index = request.getParameter("index");
		String pageSize = request.getParameter("pageSize");
		SearchMessageServiceImpl smsi = new SearchMessageServiceImpl();
		int index1 = 1;
		int pageSize1 = 1;
		if (index != null && pageSize != null){
			index1 = Integer.parseInt(index);
			pageSize1 = Integer.parseInt(pageSize);
		}
		List<SelectAllMessages> sam = smsi.searchMessage(index1, pageSize1);
		JSONObject jo = new JSONObject();

		jo.put("list",sam);
// 		Message m = new Message();
//		m.setMessage_content(mag);
		System.out.println(index);
		System.out.println(pageSize);
//		String publishMessageService = psi.publishMessageService(m);
		Writer out = response.getWriter();
		((PrintWriter)out).print(jo);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
