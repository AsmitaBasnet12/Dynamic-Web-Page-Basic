<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Product Update Form</title>
  <link rel="stylesheet" href="../stylesheets/update.css">
</head>

<body>
  <div class="container">
    <h2>Update Product</h2>
    <c:forEach var = "product" items = "${productDetails}">
    <form action="${pageContext.request.contextPath}/updateServlet" method="post">
      <label for="name">Name:</label>
      <input type="text" id="Product_name" name="Product_name" value="${product.Product_name}" required>
      
      <label for="description">Description:</label>
      <input type="text" id="description" name="description" value="${product.Product_description}" required>
      
      <label for="price">Price:</label>
      <input type="text" id="price" name="price"   value="${product.Price}"required>
      
      <label for="stock">Stock level:</label>
      <input type="text" id="stock" name="stock"  value="${product.stock_level}" required>
      
      <label for="image">Image:</label>
      <input type="text" id="image" name="image" accept="image/*" value="${product.Product_image}" required>
      
      <input type="submit" value="Update">
    </form>
    </c:forEach>
  </div>
</body>
</html>
