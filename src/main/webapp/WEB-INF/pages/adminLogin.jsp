<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<!-- Fontawesome Icons -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">

<title>Login</title>
<style type="text/css">
nav {
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 10px;
}

.login-parent {
	display: flex;
	justify-content: space-between;
	align-items: center;
}
</style>
</head>
<body>
	<!-- Header -->
	<div class="container">
		<header class="my-2">
			<nav>

				<div>
					<i class="fa-solid fa-hospital-user" style="color:"></i> <a
						href="/home" style="text-decoration: none; color: black;">DoctorApp</a>
				</div>
				<div>
					<a class="btn btn-primary" href="/register" role="button">Register</a>
					<a class="btn btn-primary" href="/login" role="button">Login</a>
				</div>
			</nav>
		</header>
	</div>
	<!-- Login -->
	<div class="container" style="margin-top: 150px; width: 40vw">
		<h1 style="text-align: center; margin-bottom: 30px">Admin Login</h1>

		<form:form action="admin" method="post" modelAttribute="adminL">
			<form>

				<div class="form-group">
					<label for="email">User Name</label> <input type="email"
						class="form-control" id="email"
						placeholder="Enter username or email" name="adminEmail">
				</div>
				<div class="form-group">
					<label for="userPassword">Password</label> <input type="password"
						class="form-control" id="userPassword" placeholder="Password"
						name="adminPassword">
				</div>
				<div>
					<button type="submit" class="btn btn-primary">Login</button>

				</div>

			</form>
		</form:form>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>