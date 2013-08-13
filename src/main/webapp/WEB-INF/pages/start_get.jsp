<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
 <head>
  <title>start_Get.jsp</title>
 </head>
 

 
  
 <body >
  <h1>Hello SpringMVC!start_get</h1>
  <spring:message code="welcome"/>
  <form  method="post" action="" >
   <input type="submit" value="submit">
  </form>
 </body>
</html>