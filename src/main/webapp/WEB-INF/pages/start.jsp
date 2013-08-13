<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<html>
 <head>
  <title>start.jsp</title>
 </head>
 
 <script type="text/javascript">
 
   function alertStr(){
	    var str1=false;
	    var str2="false";
	    alert(str1);
	    
	    alert(str2);
	    
	    alert(str2==false);
	   
   }
 </script>
 <body onload="alertStr();">
  <h1>Hello SpringMVC!start annotation</h1>
 </body>
</html>