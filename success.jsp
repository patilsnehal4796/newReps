
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<script type="text/javascript">

function edit() 
{
	 document.myform.action="edit";
	 document.myform.submit();	
}
function deletel() 
{
	 document.myform.action="del";
	 document.myform.submit();	
}
</script>

<head>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>

<style>
  table,th,td{
   border:1px solid black;
  }
  th, td {
  text-align: left;
  padding: 8px;
}
</style>

<body>
<div class="center">
<p>Add a Student</p>
</div>

<form name="myform">

<table  border="2" bgcolor="grey">
  <thead>
  <tr>
  
  <td>Select</td>
  <td>RollNo</td>
  <td>Name</td>
  <td>Address1</td>
   <td>Address1</td>
  
  <td>UserName</td>
  <td>Password</td>
  <td>Action1</td>
  <td>Action2</td>
 
  </tr>
  </thead>
 <tbody>
 
   <c:forEach items="${data}" var="e">
   <tr>
 <td> <input type="radio" name="rd"value="${e.rno}"></td>
 
 <td><c:out value="${e.rno}"></c:out></td>
 <td><c:out value="${e.name}"></c:out></td>
 
 <td><c:out value="${e.address.id}"></c:out></td>
 <td><c:out value="${e.address.area}"></c:out></td>
 <td><c:out value="${e.address.city}"></c:out></td>
 
 <td><c:out value="${e.address.id}"></c:out></td>
 <td><c:out value="${e.address.area}"></c:out></td>
 <td><c:out value="${e.address.city}"></c:out></td>
 
 <td><c:out value="${e.uname}"></c:out></td>
 <td><c:out value="${e.pass}"></c:out></td>
 
 
 <td><input type="button" value="Edit" onclick="edit()"></td>
 <td><input type="button" value="Delete" onclick="deletel()"></td>
 </c:forEach>
</tr>
</tbody>
</table>

</form>
</body>
</html>