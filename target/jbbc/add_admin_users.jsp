<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./basefile.jsp"%>
<%@page isELIgnored="false"%>
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
				<h1 class="text-center mb-3">Add AdminUser</h1>
				<div class="button-container">
					<a href="${pageContext.request.contextPath}/admin_users_list"
						>AdminUsersList!</a>
				</div>

				<form id="AddAdminUser"
					action="${pageContext.request.contextPath }/add_admin_usersfinal"
					method="post">
					
					<div class="form-section">
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="name" class="form-label">Name:</label> <input
									type="text" id="name" name="name" class="form-control" />
							</div>
							<div class="col-sm-6">
								<label for="department" class="form-label">department :</label>
								<input type="text" id="department" name="department" required
									class="form-control" />
							</div>
						</div>

						<div class="form-group row">
							<div class="col-sm-6">
								<label for="user_name" class="form-label">UserName:</label> <input
									type="text" id="user_name" name="user_name" required
									class="form-control" />
							</div>
							<div class="col-sm-6">
								<label for="email" class="form-label">Email:</label> <input
									type="email" id="email" name="email" required
									class="form-control" />
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="mobile_number" class="form-label">Mobile_NO:</label>
								<input type="text" id="mobile_number" name="mobile_number"
									class="form-control" />
							</div>
							<div class="col-sm-6">
								<label for="passwd" class="form-label">Password:</label> <input
									type="password" id="passwd" name="passwd" required
									class="form-control" />
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="updated_by" class="form-label">Updated By:</label> <input
									type="text" id="updated_by" name="updated_by" required
									class="form-control" />
							</div>
							<div class="col-sm-6">
								<label for="account_status_code" class="form-label">AccountStatusCode
									:</label> <input type="text" id="account_status_code"
									name="account_status_code" required class="form-control" />
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="email_verification_code" class="form-label">EmailVerificationCode
									:</label> <input type="text" id="email_verification_code"
									name="email_verification_code" required class="form-control" />
							</div>
							<div class="col-sm-6">
								<label for="mobile_verification_code" class="form-label">mobile_verification_code
									:</label> <input type="text" id="mobile_verification_code"
									name="mobile_verification_code" required class="form-control" />
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="division" class="form-label">division :</label> <input
									type="text" id="division" name="division" required
									class="form-control" />
							</div>
							<div class="col-sm-6">
								<label for="reg_timestamp" class="form-label">Reg_Timestamp :</label>
								<input type="date" id="reg_timestamp" name="reg_timestamp" required
									class="form-control" />
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="designation" class="form-label">Designation
									:</label> <input type="text" id="designation" name="designation"
									required class="form-control" />
							</div>
							<div class="col-sm-6">
								<label for="unit" class="form-label">Unit :</label> <input
									type="text" id="unit" name="unit" required class="form-control" />
							</div>
						</div>
						<div class="container text-center">
							<a href="${pageContext.request.contextPath }/"
								class="btn btn-outline-danger">Home</a>
							<button type="submit" class="btn btn-warning">Add Admin_user</button>
						</div>
					</div>

				</form>
				<script>
					document
							.getElementById('AddAdminUser')
							.addEventListener(
									'submit',
									function(event) {
										// Prevent the form from submitting immediately
										event.preventDefault();

										// Ask for confirmation
										if (confirm('Are you Really want to Add AdminUser Into the table ?')) {
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
</body>
</html>


