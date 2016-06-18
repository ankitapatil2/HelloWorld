<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Booking</title>
<style>
#rcorners2 {
    border-radius: 25px;
    border: 2px solid #500000 ;
    
  
}
#rcorners1 {
    border-radius: 25px;
 }
 #frame
 { border: 2px solid #500000 ;
 }

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
    width:1500px;
}

li {
    float: left;
}

li a {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}
div.fixed {
    position: fixed;
    bottom: 75px;
    right: 100px;
    width: 500px;
    
height:300px;
    border: 3px solid #73AD21;
}





.a1 {
	position: absolute;
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #111;
	top: 0px;
	width: 1344px;
}


.a1 li {
	float: left;
}

.a1 li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.a1 li a:hover {
	background-color: #111;
}

.a1 li ul {
	display: none; /* Hides the drop-down menu */
	height: auto;
	margin: 0; /* Aligns drop-down box underneath the menu item */
	padding: 0; /* Aligns drop-down box underneath the menu item */
}

.a1 li:hover ul {
	display: block;
	/* Displays the drop-down box when the menu item is hovered over */
}

.a1 li ul li {
	background-color: #54879d;
}




.left {
	width: 50;
	float: left;
	display: inline;
}

.right {
	width: 50;
	float: right;
	display: inline;
}
</style>


</head>
<body>

  
  	<ul class="a1">
		<div class="left">
			<li><a href="home.html">Home</a></li>
		</div>
		<div class="right">
			<li><a href="booking.html">Book</a></li>
			<li><a href="registeruser1.html">Register</a></li>
			<li><a href="">Extra Services</a>
				<ul class="b">
					<li><a href="searchhotel.html">Hotel</a></li>
			
			<li><a href="cabb.html">Cab </a></li>	</ul></li>
			<li><a href="feedback.html">Feedback</a></li>
			<li><a href="">Contact</a></li>
				
			
		</div>
	</ul>
    
  <br>
   <br>
    <br>
  
	<h1 align="center">SEARCH FLIGHT</h1>

	<ul>
  <li><a class="active" href="departurebyroute.jsp" target="main">DEPARTURE BY ROUTE</a></li>
  <li><a href="arrivalbyroute.jsp" target="main">ARRIVAL BY ROUTE</a></li>
  <li><a href="departurebyflight.jsp" target="main">DEPARTURE BY FLIGHT</a></li>
  <li><a href="arrivalbyflight.jsp" target="main">ARRIVAL BY FLIGHT</a></li>
</ul>
	<iframe src="departurebyroute.jsp" name="main" style="float: center" width="1500"
		height="370" left="20px" style="border:5px dotted red" id="frame"></iframe>

</body>
</html>