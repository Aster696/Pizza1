<%-- 
    Document   : aboutus
    Created on : 5 Feb, 2021, 2:31:38 PM
    Author     : Aster
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
<section class="about-us py-5 " id="about-us" style="background-color: white">
    <div class="container mt-5" >
	<div class="row">
		<div class="col-md-6">
		    <h1 class='text-success'>Welcome!</h1>
		    <h2>Know More About Us</h2>
		    <hr>
                    <p class="text">
                        It is a simple web site created by me using Servlet. If you are interested to see what type of technology and 
                        project I have created Click on my github link given below.
                    </p>
                    
                    <a href="https://github.com/Aster696"><button type="button" class="btn btn-success">Let's Know More</button></a>

		</div>
                <div class="col-md-6">
                    <img src="assets/ContactImg.jpg" alt="" class="rounded float-end" width="750">
		</div>
	</div>
</div>
</section>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
