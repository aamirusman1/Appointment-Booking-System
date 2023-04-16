<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
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
<title>Hello, world!</title>
<style>
nav {
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

	<!-- If wrong credentials -->
	<c:if test="${adminLoginMsg=='Not Allowed'}">
		<h2 class="text-center">You have entered wrong credentials..</h2>
	</c:if>
	<!-- If correct credentials -->
	<c:if test="${adminLoginMsg=='allowed'}">
		<h1 class="text-center my-5">Admin Dashboard</h1>
		<div class="container">
			<!-- View all users -->

			<caption>All Users</caption>
			<table class="table">

				<thead class="thead-dark">
					<tr>
						<th scope="col">User Id</th>
						<th scope="col">User Name</th>
						<th scope="col">User Email</th>
						<th scope="col">User Phone</th>
					</tr>
				</thead>
				<c:forEach items="${allPatients}" var="t">
					<tbody>
						<tr>
							<td><c:out value="${t.getUserId()}"></c:out></td>
							<td><c:out value="${t.getName()}"></c:out></td>
							<td><c:out value="${t.getEmail()}"></c:out></td>
							<td><c:out value="${t.getPhone()}"></c:out></td>
						</tr>

					</tbody>
				</c:forEach>
			</table>


			<!-- View all doctors -->
			<caption>All Doctors</caption>
			<table class="table">

				<thead class="thead-dark">
					<tr>
						<th scope="col">Doctor Id</th>
						<th scope="col">Doctor Name</th>
						<th scope="col">Specialization</th>
						<th scope="col">Clinic Location</th>
					</tr>
				</thead>
				<c:forEach items="${doctorsList}" var="t">
					<tbody>
						<tr>
							<td><c:out value="${t.getDoctorId()}"></c:out></td>
							<td><c:out value="${t.getName()}"></c:out></td>
							<td><c:out value="${t.getSpecialist()}"></c:out></td>
							<td><c:out value="${t.getClinic()}"></c:out></td>
						</tr>

					</tbody>
				</c:forEach>
			</table>

			<!-- View all Appointments -->

			<caption>All Appointments</caption>
			<table class="table">

				<thead class="thead-dark">
					<tr>
						<th scope="col">Appointment Id</th>
						<th scope="col">Patient Name</th>
						<th scope="col">Doctor Name</th>
						<th scope="col">Slot Date</th>
						<th scope="col">Slot Time</th>
					</tr>
				</thead>
				<c:forEach items="${allAppointments}" var="t">
					<tbody>
						<tr>
							<td><c:out value="${t.getAppointmentId()}"></c:out></td>
							<td><c:out value="${t.getUserId().getName()}"></c:out></td>
							<td><c:out value="${t.getDoctorId().getName()}"></c:out></td>
							<td><c:out value="${t.getSlotDate()}"></c:out></td>
							<td><c:out value="${t.getSlotTime()}"></c:out></td>
						</tr>

					</tbody>
				</c:forEach>
			</table>

			<!-- View all Upcoming Appointments -->

			<caption>Upcoming Appointments</caption>
			<table class="table">

				<thead class="thead-dark">
					<tr>
						<th scope="col">Appointment Id</th>
						<th scope="col">Patient Name</th>
						<th scope="col">Doctor Name</th>
						<th scope="col">Slot Date</th>
						<th scope="col">Slot Time</th>
					</tr>
				</thead>
				<c:forEach items="${nextAppointments}" var="t">
					<tbody>
						<tr>
							<td><c:out value="${t.getAppointmentId()}"></c:out></td>
							<td><c:out value="${t.getUserId().getName()}"></c:out></td>
							<td><c:out value="${t.getDoctorId().getName()}"></c:out></td>
							<td><c:out value="${t.getSlotDate()}"></c:out></td>
							<td><c:out value="${t.getSlotTime()}"></c:out></td>
						</tr>

					</tbody>
				</c:forEach>
			</table>

			<!-- View all Previous Appointments -->

			<caption>Previous Appointments</caption>
			<table class="table">

				<thead class="thead-dark">
					<tr>
						<th scope="col">Appointment Id</th>
						<th scope="col">Patient Name</th>
						<th scope="col">Doctor Name</th>
						<th scope="col">Slot Date</th>
						<th scope="col">Slot Time</th>
					</tr>
				</thead>
				<c:forEach items="${pastAppointments}" var="t">
					<tbody>
						<tr>
							<td><c:out value="${t.getAppointmentId()}"></c:out></td>
							<td><c:out value="${t.getUserId().getName()}"></c:out></td>
							<td><c:out value="${t.getDoctorId().getName()}"></c:out></td>
							<td><c:out value="${t.getSlotDate()}"></c:out></td>
							<td><c:out value="${t.getSlotTime()}"></c:out></td>
						</tr>

					</tbody>
				</c:forEach>
			</table>

			<!-- View all Todays Appointments -->

			<caption>Todays Appointments</caption>
			<table class="table">

				<thead class="thead-dark">
					<tr>
						<th scope="col">Appointment Id</th>
						<th scope="col">Patient Name</th>
						<th scope="col">Doctor Name</th>
						<th scope="col">Slot Date</th>
						<th scope="col">Slot Time</th>
					</tr>
				</thead>
				<c:forEach items="${todayAppointments}" var="t">
					<tbody>
						<tr>
							<td><c:out value="${t.getAppointmentId()}"></c:out></td>
							<td><c:out value="${t.getUserId().getName()}"></c:out></td>
							<td><c:out value="${t.getDoctorId().getName()}"></c:out></td>
							<td><c:out value="${t.getSlotDate()}"></c:out></td>
							<td><c:out value="${t.getSlotTime()}"></c:out></td>
						</tr>

					</tbody>
				</c:forEach>
			</table>
		</div>
	</c:if>

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