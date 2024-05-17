<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=contextPath%>/stylesheets/register.css">
</head>
<body>
	<div class="registration-container">
		<div class="registration-title">Create your Account</div>
		<div class="registration-content">
			<form action="<%=request.getContextPath()%>/registeruser"
				method="post">
				<div class="user-details">
					<div class="registration-input-box">
						<span class="registration-details">Username</span> <input
							type="text" name="user_name" placeholder="Enter your username"
							required>
					</div>
					<div class="registration-input-box">
						<span class="registration-details">Email</span> <input
							type="email" name="user_email" placeholder="Enter your email"
							required>
					</div>
					<div class="registration-input-box">
						<span class="registration-details">Location</span> <input
							type="text" name="location" placeholder="Enter your location"
							required>
					</div>
					<div class="registration-input-box">
						<span class="registration-details">Phone Number</span> <input
							type="text" name="user_phonenumber"
							placeholder="Enter your number" required>
					</div>
					<div class="registration-input-box">
						<span class="registration-details">Password</span> <input
							type="password" name="user_password"
							placeholder="Enter your password" required>
					</div>

					<div class="registration-button">
						<input type="submit" value="Register">
					</div>
					<p> ${error}</p>
				</div>
			</form>
		</div>
	</div>
</body>
</html>