<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home </title>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<style type="text/css">
    .jumbotron{
    	margin-top: 15px;
    }
</style>
</head>
<body>
<div class="container">
	<div class="row">
    	<div class="col-xs-12">
        	<div class="jumbotron">
                <h1>Welcome...!!</h1>
            	<p> Have a Great Day..!!</p>
            	
            	 
            	
            	<p>Task 2 (dummyT):
            	<a href="${pageContext.request.contextPath}/read" class="btn btn-primary btn-lg">ReadStudentData</a>
            	</p>
            	<p>AdminUser :
            	<a href="${pageContext.request.contextPath}/admin_users_list" class="btn btn-primary btn-lg">Admin_Users List</a>
            	<a href="${pageContext.request.contextPath}/add_admin_users" class="btn btn-primary btn-lg">ADD Admin_User</a>
            	<p>AdminRoles:
            	<a href="${pageContext.request.contextPath}/admin_roles_list" class="btn btn-primary btn-lg">AdminRoles List</a>
				<a href="${pageContext.request.contextPath}/add_admin_role" class="btn btn-primary btn-lg">ADD AdminRoles</a>
				</p>
				<p>m_roles: <a href="${pageContext.request.contextPath}/m_roles-list" class="btn btn-primary btn-lg">M_Roles</a></p>
            	
            </div>
        </div>
    </div>
</div>
</body>
</html>