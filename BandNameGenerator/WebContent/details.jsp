<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Band Name Generator</title>
</head>
<body>
	<header style="background-color: black;color: white;text-align: center;">
		<h1>Band Name Generator</h1>
	</header>
	<section>
	<h3>Let's do this ${userBNG.getName()}!</h3>
	<p>Now just give us some words to work with and we'll give you a list of acceptable band names to pick from.  </p>
		<form action="getBandNamesServlet" method="post">
			NAME <em>(John, Jane Doe, Pam, etc.)</em><br>
			<input type="text" name="name" size="20" value="${userBNG.getName()}"><br>
			<br> 
			PLACE <em>(garden, field, house, etc.)</em><br>
			<input type="text" name="place" size="20" value="${userBNG.getPlace()}"><br>
			<br> 
			PLURAL THING <em>(turtles, shoes, eggs, etc.)</em><br>
			<input type="text" name="thing" size="20" value="${userBNG.getThing()}"><br>
			<br> 
			ADJECTIVE <em>(green, slow, silent, etc.)</em><br>
			<input type="text" name="adjective" size="20"value="${userBNG.getAdjective()}"><br>
			<br><input type="submit" value="Generate Band Names" />
		</form><br>
	<a href="index.jsp">&#8592; Start Over</a>
	</section>

</body>
</html>