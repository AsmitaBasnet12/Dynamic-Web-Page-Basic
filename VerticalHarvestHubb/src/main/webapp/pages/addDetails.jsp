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
<link rel="stylesheet" href="../stylesheets/adddetails.css">
</head>
<body>
	<form action="${pageContext.request.contextPath}/productServlet"
		method="post" enctype="multipart/form-data">
		<label for="Product_name">Product Name:</label><br> <input
			type="text" id="Product_name" name="Product_name"><br> <br>
		<label for="Product_description">Product Description:</label><br>
		<input type="text" id="Product_description" name="Product_description"><br>
		<br> <label for="Price">Product Price:</label><br> <input
			type="text" id="Price" name="Price"><br> <br> <label
			for="stock_level">Stock Level:</label><br> <input type="text"
			id="stock_level" name="stock_level"><br> <br> <label
			for="Product_image">Product Image:</label><br> <input
			type="text" id="Product_image" name="Product_image"><br>
		<br> <br>
		<button type="submit">Add Product</button>
			Product</button>

	</form>
</body>
</html>