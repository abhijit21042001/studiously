<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./basefile.jsp"%>

<style>
.form-section {
	margin-bottom: 20px;
	padding: 10px;
	border: 1px solid #ccc;
}
.button-container {
    text-align: right;
    margin-top: 20px;
}
</style>
</head>
<body>
<div class="container mt-3">
		<div class="row">
			<div class="col-md-12 ">
				<h1 class="text-center mb-3">Assign Roles</h1>
				<div class="button-container">
					<a href="${pageContext.request.contextPath}/admin_roles_list"
						>AdminRolesList!</a>
				</div>

				<form id="addroles" action="handle-adminroles" method="post">

					<div class="form-section">

						<div class="form-group row">
							<div class="col-sm-6">
								<label for="admin_id" class="form-label">Admin_Id:</label> <input
									type="text" id="admin_id" name="admin_id"
									class="form-control"  />
							</div>
							<!-- <div class="col-sm-6">
								<label for="admin_role_id" class="form-label">Admin_Role_id:</label>
								<input type="text" id="admin_role_id" name="admin_role_id"
									class="form-control"  />
							</div> -->
							<div class="col-sm-6">
								<label for="role_id" class="form-label">Role_id :</label> <input
									type="text" id="role_id" name="role_id" class="form-control"
									placeholder="Enter RoleID" />
							</div>
						</div>

						<div class="form-group row">
							<!-- <div class="col-sm-6">
								<label for="update_by" class="form-label">Updated_by:</label> <input
									type="text" id="update_by" name="update_by"
									class="form-control" required />
							</div> -->
							 <div class="col-sm-6">
								<label for="update_timestamp" class="form-label">Update_Timestamp
									:</label> <input type="date" id="update_timestamp"
									name="update_timestamp" class="form-control"  />
							</div> 
						</div>
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="is_active" class="form-label">Is_Active:</label> <label
									class="radio-inline"> <input type="radio"
									id="is_active" name="is_active" value="true" required>True
								</label> <label class="radio-inline"> <input type="radio"
									id="is_active" name="is_active" value="false" required>False
								</label>
							</div>
							
							<div class="col-sm-6">
								<label for="is_fullright" class="form-label">Has full right :</label><label class="radio-inline"> <input
									type="radio" id="is_fullright" name="is_fullright" value="true"
									required> True
								</label> <label class="radio-inline"> <input type="radio"
									id="is_fullright" name="is_fullright" value="false" required>False
								</label>
							</div>
						</div>
					
						<div class="container text-center">
							<a href="${pageContext.request.contextPath }/"
								class="btn btn-outline-danger">Home</a>
							<button type="submit" class="btn btn-primary">Add AdminRole</button>
							
							<a href="${pageContext.request.contextPath }/admin_users_list"
								class="btn btn-outline-danger"> Admin_users List</a>	
						</div>

					</div>
					</form></div></div></div></body></html>
					