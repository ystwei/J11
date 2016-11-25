package com.weikun.control;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

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
@WebServlet(name = "BookControl",urlPatterns = {"/book"})
public class BookControl extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pid=request.getParameter("pid");


        Element root=new Element("books");
        if(pid.equals("1")){
            Element book=new Element("book");

            Element name=new Element("name");
            name.setText("Java基础");

            Element pic=new Element("pic");
            pic.setText("images/06.jpg");

            Element price=new Element("price");
            price.setText("120");

            book.addContent(name);
            book.addContent(pic);
            book.addContent(price);

            root.addContent(book);


        }else if(pid.equals("2")){

            Element book=new Element("book");

            Element name=new Element("name");
            name.setText("Jsp基础");

            Element pic=new Element("pic");
            pic.setText("images/02.jpg");

            Element price=new Element("price");
            price.setText("99");
            book.addContent(name);
            book.addContent(pic);
            book.addContent(price);
            root.addContent(book);
        }else if(pid.equals("3")){

            Element book=new Element("book");

            Element name=new Element("name");
            name.setText("mysql基础");

            Element pic=new Element("pic");
            pic.setText("images/04.jpg");

            Element price=new Element("price");
            price.setText("88");
            book.addContent(name);
            book.addContent(pic);
            book.addContent(price);
            root.addContent(book);
        }
        Document doc=new Document(root);
        XMLOutputter out1=new XMLOutputter();
        String result=out1.outputString(doc);


        response.setCharacterEncoding("utf-8");
        response.setContentType("text/xml");
        System.out.println(result);
        PrintWriter out=response.getWriter();
        out.print(result);

        out.flush();
        out.close();
    }
}
