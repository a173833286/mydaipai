<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<html>
 <head>
  <title>login.jsp</title>
 </head>
 <body>
  <h1>ADD EMP</h1>
    <form method="post" action="add_emp.html">
   empNo:   <input type="text" name="empNo"><br/>
   name :   <input type="text" name="name"><br/>
   phone:   <input type="text" name="phone"><br/>
   hireDate:<input type="text" name="hireDate"><br/>
   <input type="submit" value="ADD"/>
  </form>
 </body>
</html>