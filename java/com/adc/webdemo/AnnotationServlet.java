package com.adc.webdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 注解形式的Servlet(Servlet3.0以上支持)，不可以和web.xml文件同时起作用，web.xml存在则以web.xml为准
 * 有几种处理方式：
 * 1 以注解形式为准，则需要删除WEB-INF/web.xml文件
 * 2 以web.xml文件为准
 * 3 web.xml中配置metadata-complete="false"，表示开启注解扫描
 */
@WebServlet("/myAnnotationServlet")
public class AnnotationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain;charset=UTF-8");
        resp.getWriter().write("Call AnnotationServlet.doGet()");
        resp.getWriter().flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain;charset=UTF-8");
        resp.getWriter().write("Call AnnotationServlet.doPost()");
        resp.getWriter().flush();
    }
}
