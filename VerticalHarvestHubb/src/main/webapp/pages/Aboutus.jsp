<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home page</title>
<link rel="stylesheet" href="../stylesheets/style1.css">
<link rel="stylesheet" href="../stylesheets/aboutus.css">
</head>
<body>
<header class="site-header">
    <div class="site-identity">
        <h1 class="site-title"><a href="#">Vertical HarvestHub</a></h1>
    </div>
    <nav class="site-navigation">
        <ul class="nav">
            <li><a href="<%=request.getContextPath() %>/index.jsp">Home</a></li>
            <li><a href="../pages/Product.jsp">Plants</a></li>
            <li><a href="../pages/aboutus.jsp">About us</a></li>
            <li><a href="../pages/login.jsp">USER</a></li>
        </ul>
    </nav>
</header>
<main>
    <div class="txtMain">
        <h2><u>ABOUT US</u></h2>
    </div>
    <div class="container">
        <img src="../resources/Rectangle 7.png" alt="Image" class="image">
        <div class="text">
            <h2>Reliable Experience</h2>
            <p>Welcome to our online plant nursery. We specialize in a huge selection of healthy live plants,
                live trees, roses, and shrubs. We have hundreds of varieties of live rose plants, fruit trees,
                shade trees, grapes, and berry plants. As you peruse our offerings, we invite you to embark on a
                journey of discovery and inspiration. Whether you're a seasoned horticulturist or a budding green
                thumb, there's always something new to explore and learn in our digital greenhouse. We also offer
                various other products for your home and garden. And remember, our commitment to quality doesn't
                end with your purchase. Our team of experts is here to provide guidance and support every step of
                the way, ensuring your plants thrive and flourish in their new home. So, without further ado, we
                invite you to immerse yourself in the beauty of nature and transform your living space into a lush
                oasis of greenery and life. Welcome to our online plant nursery where every plant has a story, and
                every customer is a cherished part of our growing family. Please add us to your list of favorite
                sellers and visit often. Thank you for shopping!
            </p>
        </div>
    </div>
    <br>
    <div class="container1">
        <img src="../resources/Rectangle 8.png" alt="img" class="img">
        <div class="txt">
            <h2>We Truly Care</h2>
            <p>At Vertical HarvestHub, our commitment to quality extends beyond the digital shelves of our online
                plant nursery. We stand behind the health and vitality of every live tree and plant we deliver to
                your doorstep. With our guarantee, you can shop with confidence, knowing that your green companions
                will arrive thriving and ready to flourish in their new home. However, if for any reason you're not
                completely satisfied with your order, we offer a hassle-free return policy. Simply return your order
                within 7 days of delivery, and we'll refund your purchase price in full, including return shipping
                costs. Your satisfaction is our priority, and we're dedicated to ensuring that your gardening
                experience with us is nothing short of exceptional.
            </p>
            <br>
            <h2>Satisfaction Guaranteed</h2>
            <p>Our plant nursery guarantees our live trees and plants to be alive and well upon delivery! If you're
                not 100% satisfied with your order, you may return your order within 7 days of delivery for a full
                refund plus return shipping.
            </p>
        </div>
    </div>
    <br>
    <div class="txt1">
        <h2>Brilliant Solutions For Your Home And Garden</h2>
        <div class="container2">
            <img src="../resources/Rectangle 9.png" alt="imgg" class="imgg">
        </div>
        <div class="txt1">
            <h2>Grow your own, beautify your home!</h2>
        </div>
    </div>
</main>
</body>
</html>
