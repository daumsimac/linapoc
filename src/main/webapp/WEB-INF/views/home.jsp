 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>POC</title>
</head>
<body>
<h1>
	Welcome to Lina POC
</h1>
 
 <table name="members" border="1" >
    <thead><th>id</th><th>name></th><th>email</th><th>status</th>
    <tbody>
       <c:forEach items="${members}" var="item">	
         <tr>
            <td>${item.uid}</td><td>${item.name}</td><td>${item.email}</td><td>${item.status}</td>
         </tr>	
	   </c:forEach>
    </tbody>
 </table>
 
</body>
</html>
