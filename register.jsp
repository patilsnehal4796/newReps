<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="reg">
Name:<input type="text" name="name"><br><br>
Address1:<input type="text" name="<%="address.area"%>"><br><br>
Address1:<input type="text" name="<%="address.city"%>"><br><br>

Address2:<input type="text" name="<%="address.area"%>"><br><br>
Address2:<input type="text" name="<%="address.city"%>"><br><br>

UserName:<input type="text" name="uname"><br><br>
Password:<input type="text" name="pass"><br><br>
        
         <input type="submit" value="Register">

</form>
</body>
</html>