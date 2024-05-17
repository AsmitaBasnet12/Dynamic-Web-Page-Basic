<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Home page</title>
<link rel="stylesheet" href="../stylesheets/style1.css">
<link rel="stylesheet" href="../stylesheets/Product.css">
</head>
<body>
	<header class="site-header">
		<div class="site-identity">
			<h1 class="site-title">
				<a href="#">Vertical HarvestHub</a>
			</h1>
		</div>
		<nav class="site-navigation">
			<ul class="nav">
				<li><a href="<%=request.getContextPath()%>/index.jsp">Home</a></li>
				<li><a href="../pages/Product.jsp">Plants</a></li>
				<li><a href="../pages/Aboutus.jsp">About us</a></li>
				<li><a href="../pages/login.jsp">USER</a></li>
			</ul>
		</nav>
		</nav>
	</header>
	<main>
		<div class="bgimg1">
			<div class="txtCollection">
				<h2>OUR NEW COLLECTION</h2>
				<hr>
				<img src="../resources/productmain.jpg" alt="productmaining"
					width="100%" height="450"> <br> <br>
				<div class="search-container">
					<input type="text" id="searchInput" class="search-input"
						placeholder="Search for products...">
					<button id="searchButton" class="search-button">Search</button>
				</div>
				<hr>
				<div class="grid-container">
					<div class="grid-item">
						<img src="../resources/product1.png" alt="Image 1">
						<div class="product-description">
							<h3>Rosemore NSW</h3>
							<span class="price">Rs 2000</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity1">Quantity:</label> <input
								type="number" id="quantity1" name="quantity1" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
					<div class="grid-item">
						<img src="../resources/product2.png" alt="Image 2">

						<div class="product-description">
							<h3>Firmiana colorata</h3>
							<span class="price">Rs 2700</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity2">Quantity:</label> <input
								type="number" id="quantity2" name="quantity2" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
					<div class="grid-item">
						<img src="../resources/product3.png" alt="Image 2">
						<div class="product-description">
							<h3>Alocasia frydek variegata</h3>
							<span class="price">Rs 3500</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity2">Quantity:</label> <input
								type="number" id="quantity2" name="quantity2" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
					<div class="grid-item">
						<img src="../resources/product4.png" alt="Image 2">
						<div class="product-description">
							<h3>Anthurium Warocqueanum</h3>
							<span class="price">Rs 2200</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity2">Quantity:</label> <input
								type="number" id="quantity2" name="quantity2" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
					<div class="grid-item">
						<img src="../resources/product5.png" alt="Image 2">
						<div class="product-description">
							<h3>Ghost Orchid</h3>
							<span class="price">Rs 1470</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity2">Quantity:</label> <input
								type="number" id="quantity2" name="quantity2" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
					<div class="grid-item">
						<img src="../resources/product6.png" alt="Image 2">
						<div class="product-description">
							<h3>Camellia</h3>
							<span class="price">Rs 980</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity2">Quantity:</label> <input
								type="number" id="quantity2" name="quantity2" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
					<div class="grid-item">
						<img src="../resources/product7.png" alt="Image 2">
						<div class="product-description">
							<h3>Abies spectabilis</h3>
							<span class="price">Rs 1170</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity2">Quantity:</label> <input
								type="number" id="quantity2" name="quantity2" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
					<div class="grid-item">
						<img src="../resources/product8.png" alt="Image 2">
						<div class="product-description">
							<h3>Bergenia ciliata</h3>
							<span class="price">Rs 720</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity2">Quantity:</label> <input
								type="number" id="quantity2" name="quantity2" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
					<div class="grid-item">
						<img src="../resources/product9.png" alt="Image 2">
						<div class="product-description">
							<h3>Senegalia catechu</h3>
							<span class="price">Rs 890</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity2">Quantity:</label> <input
								type="number" id="quantity2" name="quantity2" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
					<div class="grid-item">
						<img src="../resources/product10.png" alt="Image 2">
						<div class="product-description">
							<h3>Amaranthus spinosus</h3>
							<span class="price">Rs 600</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity2">Quantity:</label> <input
								type="number" id="quantity2" name="quantity2" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
					<div class="grid-item">
						<img src="../resources/product11.png" alt="Image 2">
						<div class="product-description">
							<h3>Swertia angustifolia</h3>
							<span class="price">Rs 1265</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity2">Quantity:</label> <input
								type="number" id="quantity2" name="quantity2" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
					<div class="grid-item">
						<img src="../resources/product12.png" alt="Image 2">
						<div class="product-description">
							<h3>Rhododendron</h3>
							<span class="price">Rs 540</span> <br>
							<button class="View_details">View Detail</button>
							<br> <label for="quantity2">Quantity:</label> <input
								type="number" id="quantity2" name="quantity2" value="1" min="1">
							<button class="buy-now">Buy Now</button>
						</div>
					</div>
				</div>
	</main>
</body>
</html>
