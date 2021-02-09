<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="css" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<!-------------------------------------------------------------------------------------------------------------------------------------------- -->
        <link href="<css:url value="/css/header.css"></css:url>" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="row pt-5">
    <div class="col-md-4 mx-auto">
        <div class="card">
            <div class="card-header">
                <h3 class="d-flex justify-content-center">Login</h3>
            </div>
            <div class="card-body">
                <form class="form" action="LoginController" method="post">
                    <div class="form-group">
                        <label>Email</label>
                        <input class="form-control rounded-pill" required name="email" type="email" placeholder="Email"/>
                    </div>
                    <div class="form-group">
                        <label>Password</label>
                        <input class="form-control rounded-pill" name="password" type="password" placeholder="Password"/>
                    </div>
                    <hr>
                    <div class="form-group">
                        <input class="btn btn-outline-primary form-control rounded-pill" type="submit" value="Login"/>
                    </div>
                    <div class="form-group">
                        Create a new Account -><a class="card-link" href="register.jsp">Signin</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
    
<jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
