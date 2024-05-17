<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
<link rel="stylesheet" href="./stylesheets/style1.css">
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
				<li><a href="pages/index.jsp">Home</a></li>
				<li><a href="pages/Product.jsp">Plants</a></li>
				<li><a href="pages/Aboutus.jsp">About us</a></li>
				<li><a href="pages/login.jsp">USER</a></li>
			</ul>
		</nav>
	</header>
	<main>
		<div class="bgimg1">
			<img src="./resources/bgimg1.png" alt="bgimg1" width="100%"
				height="600">
			<hr>
			<div class="txtCollection">
				<h2>FEATURED COLLECTION</h2>
				<p>Our most popular products based on sales</p>
			</div>
			<div class="grid-container">
				<div class="grid-item">
					<img src="./resources/grid1.jpg">
				</div>
				<div class="grid-item">
					<img src="./resources/grid 2.jpg">
				</div>
				<div class="grid-item">
					<img src="./resources/grid 3.jpg">
				</div>
				<div class="grid-item">
					<img src="./resources/grid 4.jpg">
				</div>
				<div class="grid-item">
					<img src="./resources/grid 5.jpg">
				</div>
				<div class="grid-item">
					<img src="./resources/grid 6.jpg">
				</div>
			</div>
			<hr>
			<div class="container2">
				<img src="./resources/imggfit.jpg" alt="bgimg1" width="100%"
					height="300">
				<h2>
					Housewarming Gifts for Plant Lovers <br>
					<p>
						Whether your loved one just bought their first home or moved into
						a brand-new apartment, congratulations are certainly in order!
						Here are our picks for the best housewarming gifts for every plant
						lover in your life.For those who love to get their hands dirty, a
						collection of high-quality gardening tools could be just the thing
						to help them tend to their indoor jungle with ease. And let's not
						forget about the power of greenary – a beautifully grown plant or
						can provide endless inspiration and guidance. <br> <br>
						<button class="button">Explore Our Collection</button>
					</p>
				</h2>
			</div> <!-- Close container2 -->
		</div> <!-- Close bgimg1 -->
	</main>
</body>
</html>
