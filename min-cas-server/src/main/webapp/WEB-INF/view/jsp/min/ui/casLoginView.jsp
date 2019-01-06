<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>MinZone | Blog</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="css/ionicons.min.css">
  <!-- custom css -->
  <link rel="stylesheet" href="css/form.css">
  <link rel="shortcut icon " type="images/x-icon" href="imgages/star.png">
  
</head>
<body class="blur-bg">

    <form:form method="post" id="fm1" commandName="${commandName}" htmlEscape="true">
        <div class="login-logo">
		  <a href="javascript:void(0);"><b>ZBLOG</b></a>
		</div>
		<div class="form-group has-feedback">
		  <input type="text" id="username" name="username" class="form-control input-lg" placeholder="用户名" required="required" style="border-radius:6px;"/>
		  <span class="glyphicon glyphicon-user form-control-feedback"></span>
		</div>
		<div class="form-group has-feedback">
		  <input type="password" name="password" class="form-control input-lg" placeholder="密码" required="required" style="border-radius:6px;"/>
		  <span class="glyphicon glyphicon-lock form-control-feedback"></span>
		</div>
		<input type="hidden" name="execution" value="${flowExecutionKey}" />
        <input type="hidden" name="_eventId" value="submit" />
	    <button type="submit" name="go" class="btn btn-lg btn-primary btn-block">登录</button>     
    </form:form>
    
	<div class="container">
	  <div class="row">
	    <div class="col-md-4"></div>
	    <div class="col-md-4">
	      <section class="login-form">
	        <form method="post" action="<c:url value='login'/>" role="login">
	          <!-- <img src="http://i.imgur.com/RcmcLv4.png" class="img-responsive" alt="" /> -->
	          <div class="login-logo">
			    <a href="javascript:void(0);"><b>ZBLOG</b></a>
			  </div>
			  <div class="form-group has-feedback">
		        <input type="text" name="username" class="form-control input-lg" placeholder="用户名" required="required" style="border-radius:6px;"/>
		        <span class="glyphicon glyphicon-user form-control-feedback"></span>
		      </div>
	          <div class="form-group has-feedback">
		        <input type="password" name="password" class="form-control input-lg" placeholder="密码" required="required" style="border-radius:6px;"/>
		        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
		      </div>
	          <input type="hidden" name="<c:out value="${_csrf.parameterName}"/>" value="<c:out value="${_csrf.token}"/>"/>
	          <!--<div class="pwstrength_viewport_progress"></div>
	          <div class="progress-bar"></div>-->
	          <button type="submit" name="go" class="btn btn-lg btn-primary btn-block">登录</button>
	          
	          <div>
	            <a href="/registerPage">创建账户</a> 还是 <a href="/changePasswordPage">重置密码</a>
	          </div>
	        </form>
	        <div class="form-links">
	          <a href="#">www.minzone.cloud</a>
	        </div>
	      </section>  
	      </div>
	      <div class="col-md-4"></div>
	  </div>   
	</div>


<!-- jQuery 1.12.4 -->
<script src="js/jquery-1.12.4.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>
