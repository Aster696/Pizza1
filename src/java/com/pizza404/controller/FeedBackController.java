package com.pizza404.controller;

import com.pizza404.model.FeedBack;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.imageio.IIOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FeedBackController", urlPatterns = "/FeedBackController")
public class FeedBackController extends HttpServlet{
    private String sql = "jdbc:derby://localhost:1527/pizza404";
    private String name = "boot";
    private String pass = "boot";
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        FeedBack fb = new FeedBack();
        fb.setUsername(req.getParameter("username"));
        fb.setEmail(req.getParameter("email"));
        fb.setSubject(req.getParameter("subject"));
        fb.setMessage(req.getParameter("message"));
        
        
        try {
            PrintWriter out = resp.getWriter();
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection(sql,name,pass);
            PreparedStatement pst = con.prepareStatement("insert into FeedBack (username, email, subject, message) values(?,?,?,?)");
            
            pst.setString(1, fb.getUsername());
            pst.setString(2, fb.getEmail());
            pst.setString(3, fb.getSubject());
            pst.setString(4, fb.getMessage());
            
            pst.executeUpdate();
            
            out.println("<script>"+"alert('Thanks for submitting the feedback form');"+"window.location='pizza.jsp';"+"</script>");
        } catch (Exception e) {
            System.out.println(e);
//            out.println("<script>"+"alert('Sorry something went wrong :C');"+"window.location='header.jsp';"+"</script>");
            resp.sendRedirect("contactus.jsp");
        }
    }
    
}
