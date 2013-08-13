<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<html>
 <head>
  <title>login.jsp</title>
 </head>
 <body>
  <h1 style="color: red;" >ADD EMP</h1>
  <form method="post" action="">
   empNo:   <input type="text" name="empNo"><br/>
   name :   <input type="text" name="name"><br/>
   phone:   <input type="text" name="phone"><br/>
   hireDate:<input type="text" name="hireDate"><br/>
   depart:  <select name="dept">
      <c:forEach items="${deptlist}" var="dept">
       <option value="${dept }">${dept}</option>
      </c:forEach>
   </select>
   <input type="submit" value="ADD"/>
  </form>
 </body>
</html>