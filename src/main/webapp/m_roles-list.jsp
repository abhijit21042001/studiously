<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@page isELIgnored="false"%> 

<%@include file="./basefile.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>M_roles-List</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">M_roles list</h1>
				<br>

<!-- 
				<div class="container text-center">
					<a href="add-user" class="btn btn-outline-success">Add-User</a>
 -->

				</div>
				<br>


				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">role_id</th>
							<th scope="col">role</th>
							<th scope="col">role_description</th>
							<th scope="col">update_by</th>
							<th scope="col">update_timestamp</th>
							
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${m_roles}" var="m">
							<tr>
								<th>${m.role_id }</th>
								<td>${m.role }</td>
								<td>${m.role_description }</td>
								<td>${m.update_by }</td>
								<td>${m.update_timestamp }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	





</body>
</html>
