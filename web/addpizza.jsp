<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="css" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
   
        <%
//           if( session.getAttribute("user")==null){
//                out.println("<script>" + "alert('Login to add data');" + "window.location='login.jsp';" + "</script>");
//                
//                //response.sendRedirect("login.jsp");
//            }
        %>

<div class="row pt-5">
    <div class="col-md-4 mx-auto">
        <div class="card">
            <div class="card-header">
                <h3 class="d-flex justify-content-center">Add Pizza Details</h3>
            </div>
            <div class="card-body">
                    <c:if test="${pi==null}">
                        <form action="AddPizzaController" method="post" class="form">
                    </c:if>

                    <c:if test="${pi!=null}">
                        <form action="UpdateController" method="post" class="form">
                            <div class="form-group">
                                <input class="form-control rounded-pill" type="text" name="pizza_id" value="${pi.pizza_id}" readonly=""/>
                            </div>
                    </c:if>
                    <div class="form-group">
                        <label>Name</label>
                        <input class="form-control rounded-pill" required name="pizza_name" value="${pi.pizza_name}" type="text" minlength="3" maxlength="15" placeholder="Your Pizza Name"/>
                    </div>
                    <div class="form-group">
                        <label>Link</label>
                        <input class="form-control rounded-pill" required name="link" value="${pi.link}" type="text" placeholder="Enter the link of pizza website"/>
                    </div>
                    <div class="form-group">
                        <label>Image Link</label>
                        <input class="form-control rounded-pill" required name="imglink" value="${pi.imglink}" type="text" min="10" placeholder="Your Contact"/>
                    </div>
                    <div class="form-group">
                        <label>Description</label>
                        <textarea class="form-control rounded-pill" name="description" value="${pi.description}"require minlength="10" style="resize: none" rows="3" required cols="57" placeholder="Enter your Description"></textarea>
                    </div>
                    <div class="form-group">
                        <label>Quantity</label>
                        <input class="form-control rounded-pill" required name="quantity" value="${pi.quantity}" type="number" placeholder="Enter Image Link"/>
                    </div>
                    <div class="form-group">
                        <label>Price</label>
                        <input class="form-control rounded-pill" required name="price" value="${pi.price}" type="number" placeholder="Enter the price of pizza"/>
                    </div>
                    <hr>
                    
                    <div>
                        <c:if test="${pi==null}">
                            <input class="btn btn-outline-primary form-control rounded-pill" type="submit" value="Add+" class="btn btn-primary"/>
                        </c:if>
                        <c:if test="${pi!=null}">
                            <input class="btn btn-outline-info form-control rounded-pill" type="submit" value="Update" class="btn btn-primary"/>
                        </c:if>
                        <input class="btn btn-outline-danger form-control rounded-pill" type="reset" value="Reset" class="btn btn-danger"/></td>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
