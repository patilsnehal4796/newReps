<%@page import="com.cjc.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<form action="update">

<%Student s=(Student)request.getAttribute("student"); %>
  
           <input type="hidden" name="rno" value="<%=s.getRno()%>"><br><br>
Name     : <input type="text" name="name" value="<%=s.getName()%>"><br><br>


UserName : <input type="text" name="uname" value="<%=s.getUname()%>"><br><br>
Password : <input type="text" name="pass" value="<%=s.getPass()%>"><br><br> 

           <input type="submit" value="Update"> 

</form>
</body>
</html>