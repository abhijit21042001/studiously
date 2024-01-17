<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@page isELIgnored="false"%>

<%@include file="./basefile.jsp"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>AdminRoles List</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">AdminRoles !!	</h1>
				<br>


				<div class="container text-center">
					<a href="add_admin_role" class="btn btn-outline-success">Add-AdminRoles</a>

				<!--  *******************add roles remaining -->
				</div>
				<br>


				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Admin_Role_Id</th>
							<th scope="col">Role_Id</th>
							<th scope="col">Update_By</th>
							<th scope="col">Update_Timestamp</th>
							<th scope="col">Admin_Id</th>
							<th scope="col">Is_Active</th>
							<th scope="col">Is_Fullright</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${adminroles}" var="p">
							<tr>
								<th scope="row">${p.admin_role_id }</th>
								<td>${p.role_id }</td>
								<td>${p.update_by }</td>
								<td>${p.update_timestamp }</td>
								<td>${p.admin_id }</td>
								<td>${p.is_active }</td>
								<td>${p.is_fullright }</td>

								<!-- 	<td><a href="update/${p.admin_id }"><i
										class="fas fa-pen-nib text-primary	" style="font-size: 30px"></i>View</a>

								</td>   -->
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>

</body>
</html>


