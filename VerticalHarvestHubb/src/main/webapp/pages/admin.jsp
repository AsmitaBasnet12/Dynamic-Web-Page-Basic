<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Vertical Harvest Hub</title>
<link rel="stylesheet" href="../stylesheets/style1.css">
<link rel="stylesheet" type="text/css" href="../stylesheets/admin.css" />
<link href="https://fonts.googleapis.com/css?family=Italiana"
	rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css2?family=Lacquer&display=swap"
	rel="stylesheet" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
	<header class="site-header">
		<div class="site-identity">
			<h1 class="site-title">
				<a href="#">Vertical Harvest Hub</a>
			</h1>
		</div>
		<nav class="site-navigation">
			<ul class="nav">
				<li><a href="<%=request.getContextPath() %>/index.jsp">Home</a></li>
				<li><a href="../pages/Product.jsp">Plants</a></li>
				<li><a href="../pages/Aboutus.jsp">About us</a></li>
				<li><a href="../pages/admin.jsp">Admin</a></li>
			</ul>
		</nav>
	</header>

	div class="order-summary">
	<h1>Order Summary</h1>
	</div>
	<div class="total-products">
		<h1>Total Orders</h1>
	</div>
	<div class="total-user">
		<h1>Total Users</h1>
	</div>
	<div class="sidenav">
	
		<h1><a href="<%=request.getContextPath()%>/pages/login.jsp">Vertical Harvest Hub</a></h1>
		
	</div>

	<div class="add-product">
		<a href="<%=request.getContextPath()%>/productServlet">
			<h1>Add Product</h1>
		</a>
	</div>
	<script src="Product.js"></script>
</body>
</html>