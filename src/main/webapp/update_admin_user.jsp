
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<meta charset="ISO-8859-1">
<%@include file="./basefile.jsp"%>
<%@page isELIgnored="false"%>


<style>
.form-section {
	margin-bottom: 20px;
	padding: 15px;
	border: 1px solid #ccc;
}
</style>

</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12 ">
				<h2 class="text-center mb-3">Update Admin_user Details !!</h2>

				<form action="${pageContext.request.contextPath}/update_admin_user"
					id="updateform" method="post">
					
					<div class="form-section">
					<c:forEach var="admin_users" items="${admin_users}">
						<div class="form-group row">
							<div class="col-sm">
	 										<input type="hidden" name="admin_id" value="${admin_users.admin_id}" />
 					<label for="admin_id" class="form-label">Admin_id:</label> <input
									type="text" id="admin_id" name="admin_id" 
									value="${admin_users.admin_id }" readonly class="form-control" />
 							</div>
 							<div class="col-sm-6">
								<label for="name" class="form-label">Name:</label> <input
									type="text" id="name" name="name" 
									value="${admin_users.name }" class="form-control" />
							</div>
						</div>

						<div class="form-group row">
							<div class="col-sm-6">
								<label for="user_name" class="form-label">UserName:</label> <input
									type="text" id="user_name" name="user_name" required 
									 value="${admin_users.user_name }" readonly class="form-control"  />
							</div>
							<div class="col-sm-6">
								<label for="email" class="form-label">Email:</label> <input
									type="email" id="email" name="email" required
									value="${admin_users.email}"  class="form-control" />
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="mobile_number" class="form-label">Mobile_NO:</label>
								<input type="text" id="mobile_number" name="mobile_number"
									value="${admin_users.mobile_number}" class="form-control" />
							</div>
							<div class="col-sm-6">
								<label for="passwd" class="form-label">Password:</label> <input
									type="password" id="passwd" name="passwd" required
								value="${admin_users.passwd }" class="form-control" />
							</div>
						</div>	
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="reg_timestamp" class="form-label">Reg_Timestamp:</label>
								<input type="Date" id="reg_timestamp" name="reg_timestamp"
									value="${admin_users.reg_timestamp}" readonly class="form-control" />
							</div>
							<div class="col-sm-6">
								<label for="update_by" class="form-label">Update_By:</label> <input
									type="text" id="update_by" name="update_by" required
								value="${admin_users.update_by }" readonly class="form-control" />
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="update_timestamp" class="form-label">Update_Timestamp:</label>
								<input type="date" id="update_timestamp" name="update_timestamp"
									value="${admin_users.update_timestamp}" class="form-control" />
							</div>
							 <div class="col-sm-6">
							<%--	<label for="account_status_code" class="form-label">Account_Status_Code:</label> <input
									type="text" id="account_status_code" name="account_status_code" required
								value="${admin_users.account_status_code }" class="form-control" />
							</div>
							 --%>
							 								<!-- Here we add the Drop-down for the Division  -->
							<label for="account_status_code" class="form-label">Account_Status_Code:</label>
								<select id="account_status_code" name="account_status_code" class="form-control"
										style="height: 30px; width: 200px">
									<option value="null">Account_Status_Code</option>
									<c:forEach items="${adminUsersSet}" var="adminUserdrop">
										<option value="${adminUserdrop.account_status_code}">${adminUserdrop.account_status_code}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="email_verification_code" class="form-label">Email_Verification_Code:</label>
								<input type="text" id="email_verification_code" name="email_verification_code"
									value="${admin_users.email_verification_code}" class="form-control" />
							</div>
							<div class="col-sm-6">
								<label for="mobile_verification_code" class="form-label">Mobile_Verification_Code:</label> <input
									type="text" id="mobile_verification_code" name="mobile_verification_code" required
								value="${admin_users.mobile_verification_code }" class="form-control" />
							</div>
						</div>																							
						<div class="form-group row">
							<div class="col-sm-6"> 		<!-- Here we add the Drop-down for the Division  -->
								<label for="division" class="form-label">Division:</label>
								<select id="division" name="division" class="form-control"
										style="height: 30px; width: 200px">
									<option value="null">Division</option>
									<c:forEach items="${adminUsersSet}" var="adminUserdrop">
										<option value="${adminUserdrop.division}">${adminUserdrop.division}</option>
									</c:forEach>
								</select>
									
							</div>
							<div class="col-sm-6"> 			<!-- Here we add the Drop-down for the department  -->
								<label for="department" class="form-label">Department:</label> 
								<select id="department" name="department" class="form-control"
										style="height: 30px; width: 200px">
									<option value="null">Department:</option>
									<c:forEach items="${adminUsersSet}" var="adminUserdrop">
										<option value="${adminUserdrop.department}">${adminUserdrop.department}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="designation" class="form-label">Designation :</label> <input
									type="text" id="designation" name="designation" required
									value="${admin_users.designation }" class="form-control" />
							</div>
							<div class="col-sm-6">
								<label for="unit" class="form-label">Unit:</label> <!-- Here we add the Drop-down for the Unit  -->
								<select id="unit" name="unit" class="form-control"
										style="height: 30px; width: 200px">
									<option value="0">Unit:</option>
									<c:forEach items="${adminUsersSet}" var="adminUserdrop">
										<option value="${adminUserdrop.unit}">${adminUserdrop.unit}</option>
									</c:forEach>
								</select>
							</div>
						</div>	
							
						<div class="container text-center">
							<a href="${pageContext.request.contextPath }/admin_users_list"
								class="btn btn-outline-danger">Back</a>
							<button type="submit" class="btn btn-warning">update Admin_user</button>
						</div>
					
					</c:forEach></div>
				</form>
				<script>
					document.getElementById('updateform').addEventListener('submit',function(event) {
										// Prevent the form from submitting immediately
										event.preventDefault();

										// Ask for confirmation
										if (confirm('Are you Really want to Update Admin_user Details')) {
											// If the user clicks "OK," submit the form
											this.submit();
										} else {
											// If the user clicks "Cancel," do nothing or perform any other action
											// You can add code here to handle the cancellation.
										}
									});
				</script>
			</div>
		</div>
	</div>
	${msg}

	<div class="container text-center">
		<a href="${pageContext.request.contextPath }/admin_users_list"
			class="btn btn-outline-danger"> Admin_users List</a>
		<a href="${pageContext.request.contextPath }/"
								class="btn btn-outline-danger">Home</a>	</div>
								
								
<!--************ below is the code for showing the Admin roles assin to the above user-->
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h2 class="text-center">Roles Assigned To This User</h2>

<!--  ********************here need to display same page add roles but different form ask to -->
				<div class="container1 text-center">
					<a href="${pageContext.request.contextPath }/add_admin_role"
						class="btn btn-outline-success">Add_Roles </a>
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
							<th scope="col">Has-Fullrights</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${adminroles}" var="p">
							<c:if test="${admin_id_new eq p.admin_id}">
								<tr>
								<th scope="row">${p.admin_role_id }</th>
								<td>${p.role_id }</td>
								<td>${p.update_by }</td>
								<td>${p.update_timestamp }</td>
								<td>${p.admin_id }</td>
								<td>${p.is_active }</td>
								<td>${p.is_fullright }</td>

									<td><a
										href="<c:url value='/delete-adminroles/${p.admin_role_id}'/>"><i
											class="text-primary	" style="font-size: 30px"></i>Delete</a>
									</td>
								</tr>
							</c:if>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>

</body>
</html>


