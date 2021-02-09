<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="css" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-------------------------------------------------------------------------------------------------------------------------------------------- -->
        <link href="<css:url value="/css/header.css"></css:url>" rel="stylesheet" type="text/css"/>
        <script type="text/javascript">
            function openbar(){
                document.getElementById("slidebar").style.width = "250px";
            }
            function closebar(){
                document.getElementById("slidebar").style.width = "0";
            }
            
        </script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg" style="background-color: red">
  <div class="container-fluid">
      <div id="slidebar" class="slidebarCss">
                <br><a href="javascript:void(0)" class="closebtn" onclick="closebar()">&#9776;</a>
                <br>
<!--                <a href="register.jsp">Sign in</a>
                <a href="login.jsp">Login</a>-->
                <hr>
                <a href="header.jsp">Home</a>
                <a href="pizza.jsp">Pizza</a>
                <a href="aboutus.jsp">About us</a>
                <a href="contactus.jsp">Contact us</a>
                <a href="addpizza.jsp">Add Pizza</a>
                <hr>
                <a href="login.jsp">Logout</a>
                </div>
      <span style="font-size:30px;cursor:pointer" onclick="openbar()" class="openbtn">&#9776;</span>
    <a class="navbar-brand" href="#">Pizza404</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav" style="position: relative;left: 25%">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="header.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="pizza.jsp">Pizza</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addpizza.jsp">Add Pizza</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="aboutus.jsp">About us</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="contactus.jsp">Contact us</a>
        </li>
<!--        <li class="nav-item d-flex justify-content-end">
          <a class="nav-link" href="register.jsp">Sign in</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Log in</a>
        </li>-->
        
      </ul>
      <ul class="navbar-nav" style="position: relative;left: 63%">
        <li class="nav-item">
          <a class="nav-link btn btn-outline-warning" aria-current="page" href="login.jsp">Logout</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<br>

</body>
</html>
