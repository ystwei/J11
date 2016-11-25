package com.weikun.control;

import com.weikun.service.CityService;

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
@WebServlet(name="/city1",urlPatterns = {"/city"})
public class CityControl extends HttpServlet {
    private CityService service=new CityService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pro=req.getParameter("pro");

        String result=service.makeCity(pro);

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");


        PrintWriter out=resp.getWriter();

        out.println(result);
        out.flush();
        out.close();

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
