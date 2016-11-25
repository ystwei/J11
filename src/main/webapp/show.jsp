<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/25
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <%
        String username=request.getParameter("username");
        String pwd=request.getParameter("pwd");


        out.println(username+"Hello");
        out.println(pwd+"Hello");

        out.flush();
        out.close();
    %>
