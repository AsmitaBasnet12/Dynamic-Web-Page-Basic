<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="Utils.StringUtils"%>
<%@page import="Model.productModel"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Product Management</title>
<link rel="stylesheet"
	href="<%=contextPath%>/stylesheets/AddProduct.css" />

</head>
<body>
	<form action="${pageContext.request.contextPath}/productServlet"
		method="post" enctype="multipart/form-data">

		<div class="product-table">
			<a href="<%=request.getContextPath()%>/pages/addDetails.jsp"
				class="btn">Add New Product</a>
			<table>
				<thead>
					<tr>
						<th>Product Name</th>
						<th>Description</th>
						<th>Price</th>
						<th>Stock Level</th>
						<th>Image</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${not empty productLists}">
						<c:forEach var="pro" items="${productLists}">
							<tr>
								<td>${pro.product_name}</td>
								<td>${pro.product_description}</td>
								<td>${pro.price}</td>
								<td>${pro.stock_level}</td>
								<td><img src="${pro.product_image}"
									alt="${pro.product_name}" width="100" height="100"></td>
								<td>
									<form
										action="${pageContext.request.contextPath}/deleteProductServlet"
										method="post">

										<input type="hidden" name="Product_name"
											value="${pro.product_name}">
										<button type="submit" class="delete-btn">Delete</button>

									</form>


								</td>
								<td>
									<%-- <button onclick="location.href='<%=request.getContextPath()%>/updateServlet?Product_name=${pro.product_name }'" class="update-btn">Update</button>
 --%>

									<form action="updateServlet" method="post">
										<input type="hidden" id="productName" name="productName"
											value="${pro.product_name}">
										<br>
										<button type="submit">Update</button>
									</form>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		</div>

	</form>
</body>
</html>
