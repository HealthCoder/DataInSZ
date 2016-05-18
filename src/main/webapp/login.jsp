<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
   		<title>Flat UI - Free Bootstrap Framework and Theme</title>
    	<meta name="description" content="Flat UI Kit Free is a Twitter Bootstrap Framework design and Theme, this responsive framework includes a PSD and HTML version."/>
    	<meta name="viewport" content="width=1000, initial-scale=1.0, maximum-scale=1.0">

    	<!-- Loading Bootstrap -->
    	<link href="Flat-UI-master/dist/css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    	<!-- Loading Flat UI -->
    	<link href="Flat-UI-master/dist/css/flat-ui.css" rel="stylesheet">
    	<link href="Flat-UI-master/docs/assets/css/demo.css" rel="stylesheet">
    	<link rel="shortcut icon" href="img/favicon.ico">
	</head>
	
	<body>
	
	<nav class="navbar navbar-default" role="navigation">
  		<div class="navbar-header">
    		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-01">
      			<span class="sr-only">Toggle navigation</span>
    		</button>
    		<a class="navbar-brand" href="#">BigData</a>
  		</div>
  		<div class="collapse navbar-collapse" id="navbar-collapse-01">
    		<ul class="nav navbar-nav">
      			<li class="active"><a href="#fakelink">Technology</a></li>
      			<li><a href="#fakelink">Contact Us</a></li>
    		</ul>
    		<form class="navbar-form navbar-right" action="#" role="search">
      		<div class="form-group">
       			<div class="input-group">
          		<input class="form-control" id="navbarInput-01" type="search" placeholder="Search">
          		<span class="input-group-btn">
            		<button type="submit" class="btn"><span class="fui-search"></span></button>
          		</span>
        		</div>
      		</div>
    		</form>
 		 </div><!-- /.navbar-collapse -->
	</nav><!-- /navbar -->
	
	
	<div class="container">
		<div class="row demo-row">
			<div class="col-xs-3">
			<form id="loginForm" name="loginForm" action="./login" method="post" >
				<h6>username:</h6><input type="text" class="form-control input-sm" placeholder="Small" name="name" />
				<h6>password:</h6><input type="password" class="form-control input-sm" placeholder="Small" name="password" /><br/>
				<input id="job_submit_button" type="submit" value="Sign In" class="btn btn-block btn-lg btn-primary"/>
				<!--  <input id="job_submit_button" type="button" value="Sign Up" class="btn btn-block btn-lg btn-primary"/>  -->
			</form>
			</div>
		</div>
	</div>
	</body>
	
	<!--  <script  src="jquery/jquery-1.8.3.min.js">
	<script type="text/javascript">  
        function loginSubmit() {  
        	alert(11111)
        	$.ajax({
                type : "POST",  
                url : "${pageContext.request.contextPath}/job",  
                data : $("#loginForm").serialize(),  
                success : function(msg) {  
                    alert(msg);   
                }  
            });   
   		} 
    </script>  -->
    
</html>