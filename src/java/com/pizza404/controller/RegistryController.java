package com.pizza404.controller;

import com.pizza404.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "RegistryController", urlPatterns = "/RegistryController")
public class RegistryController extends HttpServlet{
    private String sql = "jdbc:derby://localhost:1527/pizza404";
    private String name = "boot";
    private String pass = "boot";
   @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        User user = new User();
        user.setUsername(req.getParameter("username"));
        user.setEmail(req.getParameter("email"));
        user.setAddress(req.getParameter("address"));
        user.setContact(Integer.parseInt(req.getParameter("contact")));
        user.setPassword(req.getParameter("password"));
        user.setStatus("user");
        
        HttpSession session = req.getSession();
        PrintWriter out = resp.getWriter();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection(sql,name,pass);
            PreparedStatement pst = con.prepareStatement("insert into users (username,email,contact,address,password,status) values(?,?,?,?,?,?)");
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getEmail());
            pst.setInt(3, user.getContact());
            pst.setString(4, user.getAddress());
            pst.setString(5, user.getPassword());
            pst.setString(6, user.getStatus());
            pst.executeUpdate();
            //System.out.println("success");
            //redirect to login page
            
            out.println("<script>"+"alert('Account created Successfully ');"+"window.location='login.jsp';"+"</script>");
            
        } catch (Exception e) {
            System.out.print(e);
            session.setAttribute("Error", "User email already exist!!!");
//            out.println("<script>"+"alert('"+session.getAttribute("Error")+" ');"+"window.location='register.jsp';"+"</script>");
            resp.sendRedirect("register.jsp");
        }
        
    }
}
