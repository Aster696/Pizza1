    package com.pizza404.controller;

import com.pizza404.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(name = "LoginController", urlPatterns = "/LoginController")
public class LoginController extends HttpServlet{
    
    private String sql = "jdbc:derby://localhost:1527/pizza404";
    private String name = "boot";
    private String pass = "boot";
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    
        User user = new User();
        user.setEmail(req.getParameter("email"));
        user.setPassword(req.getParameter("password"));
        
        String username = req.getParameter("email");
        String password = req.getParameter("password");
        
        PrintWriter out = resp.getWriter();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection(sql,name,pass);
            PreparedStatement pst = con.prepareStatement("select * from users where email=? and password=?");
            pst.setString(1, user.getEmail());
            pst.setString(2, user.getPassword());
            ResultSet rs = pst.executeQuery();
            HttpSession session = req.getSession();
                if(rs.next()){  
                    if(username.equals("admin@gmail.com") && password.equals("admin")){
                        session.setAttribute("user", user);
                        out.println("<script>"+"alert('Welcome Admin');"+"window.location='addpizza.jsp';"+"</script>");
                       // resp.sendRedirect("addpizza.jsp");
                    }else{
                        out.println(""+"<script>"+"alert('Welcome ');"+"window.location='header.jsp';"+"</script>"+"");
                    //resp.sendRedirect("login.jsp");            
                    } 
                }else{
                    out.println(""+"<script>alert('Failed to login email or password invalid');"+"window.location='login.jsp';</script>"+"");
                }
        } catch (Exception e) {
            System.out.print(e);
        }
        }
        
}

