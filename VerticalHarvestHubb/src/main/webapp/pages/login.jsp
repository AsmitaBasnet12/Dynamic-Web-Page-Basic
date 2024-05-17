<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="UTF-8">
<title>LOGIN FORM</title>
<link rel="stylesheet" href="../stylesheets/style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<div class="container">
		<div class="cover">
			<div class="front">
				<img src="../resources/img1.jpg" alt="">
			</div>
			<div class="back"></div>
		</div>
		<div class="forms">
			<div class="form-content">
				<div class="login-form">
					<div class="title">Welcome to Vertical HarvestHub!</div>
					<form action="<%=request.getContextPath()%>/loginuser"
						method="post">
						<!-- Opening <form> tag -->
						<div class="input-boxes">
							<div class="input-box">
								<i class="fas fa-user-alt"></i> <input type="text"
									name="user_name" placeholder="Enter your username" required>
								<!-- Added name attribute -->
							</div>
							<div class="input-box">
								<i class="fas fa-lock"></i> <input type="password"
									name="user_password" placeholder="Enter your password" required>
								<!-- Added name attribute -->
							</div>
							<div class="text">
								<a href="#">Forgot password?</a>
							</div>
							<div class="button input-box">
								<input type="submit" value="Submit">
							</div>
							<div class="text sign-up-text">
								Don't have an account yet? <a href="../pages/register.jsp">SignUp</a>
								<input type="checkbox" id="signup-link" style="display: none;">
							</div>
						</div>
					</form>
					<!-- Closing <form> tag -->
				</div>
			</div>
		</div>
	</div>
</body>
</html>
