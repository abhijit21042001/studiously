<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@page isELIgnored="false"%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<%@include file="./basefile.jsp"%>
<title>Admin_users List</title>

<style>
./* table {
	margin-bottom: 20px;
	padding: 15px;
	display: center;
}
  */

.container {
margin-top: 150px;
}
</style>

</head>
<body>


	<div class="col-md-12 ">
		<h1 class="text-center mb-3">Admin_users list !!</h1>
		
	</div>

	<div class="container text-center">
		<a href="add_admin_users" class="btn btn-outline-success">Add_admin_Users</a><br><br>

	
</div>	
	
	<div class="container ">
		<div class="row">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Admin_Id</th>
						<th scope="col">Name</th>
						<th scope="col">User_Name</th>
						<th scope="col">Action</th>
						<th scope="col">Email</th>
						<th scope="col">mobile_number</th>
						<th scope="col">passwd</th>
						<th scope="col">reg_timestamp</th>
						<th scope="col">update_by</th>
						<th scope="col">update_timestamp</th>
						<th scope="col">account_status_code</th>
						<th scope="col">email_verification_code</th>
						<th scope="col">mobile_verification_code</th>
						<th scope="col">division</th>
						<th scope="col">department</th>
						<th scope="col">designation</th>
						<th scope="col">Unit</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${admin_users}" var="p">
						<tr>
							<th scope="row">${p.admin_id }</th>
							<td>${p.name }</td>
							<td>${p.user_name }</td>
							<td><a href="update_admin_user/<c:out value='${p.admin_id}'/>">View/Update</a>
							</td>

							<td>${p.email }</td>
							<td>${p.mobile_number }</td>
							<td>${p.passwd }</td>
							<td>${p.reg_timestamp }</td>
							<td>${p.update_by }</td>
							<td>${p.update_timestamp }</td>
							<td>${p.account_status_code }</td>
							<td>${p.email_verification_code}</td>
							<td>${p.mobile_verification_code}</td>
							<td>${p.division }</td>
							<td>${p.department }</td>
							<td>${p.designation }</td>
							<td>${p.unit}</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>






</body>
</html>
