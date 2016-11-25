package com.weikun.control;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/11/25.
 */
@WebServlet(name="/user1",urlPatterns = {"/user"})
public class UserControl extends HttpServlet {
    private String[] usernames={"weikun","json","wk"};
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String result="false";
        for(String name:usernames){
            if(name.equals(username)){//已经注册了，
                result="true";
            }
        }

        resp.setCharacterEncoding("utf-8");

        resp.setContentType("text/html");

        PrintWriter out=resp.getWriter();

        out.print(result);
        out.flush();
        out.close();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
