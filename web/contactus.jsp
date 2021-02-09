<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="css" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href="<css:url value="/css/contactus.css"></css:url>"/>
    </head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
<section class="Material-contact-section section-padding section-dark">
    <div class="container" style="background-color: white">
          <div class="row">
              <!-- Section Titile -->
              <div class="col-md-12 wow animated fadeInLeft" data-wow-delay=".2s">
                  <h1 class="section-title">Love to Hear From You</h1>
              </div>
          </div>
          <div class="row">
              <!-- Section Titile -->
              <div class="col-md-6 mt-3 contact-widget-section2 wow animated fadeInLeft" data-wow-delay=".2s">
                <p>
                    It is a simple web site created by me using Servlet. If you are interested to see what type of technology and 
                    project I have created Click on my github link given below.
                    
                </p>

                <div class="find-widget">
                 Creator:  <a href="#">Aster</a>
                </div>
                <div class="find-widget">
                  Phone:  <a href="#">+xxxxxx</a>
                </div>
                <div class="find-widget">
                  Email:  <a href="#">asterrebeiro69@gmail.com</a>
                </div>
                <div class="find-widget">
                  Github:  <a href="https://github.com/Aster696">Aster696</a>
                </div>
              </div>
              <!-- contact form -->
              <div class="col-md-6 wow animated fadeInRight" data-wow-delay=".2s">
                  <form class="shake" role="form" action="FeedBackController"ac method="post" id="contactForm" name="contact-form" data-toggle="validator">
                      <!-- Name -->
                      <div class="form-group label-floating">
                        <label class="control-label" for="name">Name</label>
                        <input class="form-control" id="name" type="text" name="username" required data-error="Please enter your name" placeholder="Your Name">
                        <div class="help-block with-errors"></div>
                      </div>
                      <!-- email -->
                      <div class="form-group label-floating">
                        <label class="control-label" for="email">Email</label>
                        <input class="form-control" id="email" type="email" name="email" required data-error="Please enter your Email" placeholder="Your Email">
                        <div class="help-block with-errors"></div>
                      </div>
                      <!-- Subject -->
                      <div class="form-group label-floating">
                        <label class="control-label">Subject</label>
                        <input class="form-control" id="msg_subject" type="text" name="subject" required data-error="Please enter your message subject" placeholder="Your Subject">
                        <div class="help-block with-errors"></div>
                      </div>
                      <!-- Message -->
                      <div class="form-group label-floating">
                          <label for="message" class="control-label">Message</label>
                          <textarea class="form-control" rows="3" id="message" name="message" required data-error="Write your message" placeholder="Your feedback message"></textarea>
                          <div class="help-block with-errors"></div>
                      </div>
                      <!-- Form Submit -->
                      <div class="form-submit mt-5">
                          
                          <input class="btn btn-primary" type="submit" value="Send Message" id="form-submit"/>
                          <div id="msgSubmit" class="h3 text-center hidden"></div>
                          <div class="clearfix"></div>
                      </div>
                  </form>
              </div>
          </div>
      </div>
</section>
    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
