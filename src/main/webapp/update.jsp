<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Update</title>
</head>
<body>
	<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>
	<p><strong>Update Here | <a href="${pageContext.request.contextPath}/read">Click for Read</a></strong></p>
<form action="../update" method="post">
<pre>
<c:forEach var="student" items="${listStudent}">
		
Id:    	<input type="text" name="dispId" value="${student.id}" disabled="disabled"/>
		<input type="hidden" name="id" value="${student.id}"/>			
Name:  	<input type="text" name="name" value="${student.name}" />
		
Email: 	<input type="text" name="email" value="${student.email}" />
	    
Course:	<input type="text" name="course" value="${student.course}" />
		    
        <input type="submit" value="Update" />	
</c:forEach>	
</pre>
</form>
${msg}
</body>
</html>