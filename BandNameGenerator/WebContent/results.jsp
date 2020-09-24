<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Band Name Generator - results</title>
</head>
<body>
	<header style="background-color: black;color: white;text-align: center;">
		<h1>Band Name Generator</h1>
	</header>
	<section>
	<h3>Satisfactory List of Suitable Band Names</h3>
	${userBNG.formatBandNameList() }
	
	<br>
	<form action="getLeaderNameServlet" method="post">
			<input type="hidden" name="name" size="20" value="${userBNG.getName()}"> 
			<input type="hidden" name="place" size="20" value="${userBNG.getPlace()}">
			<input type="hidden" name="thing" size="20" value="${userBNG.getThing()}">
			<input type="hidden" name="adjective" size="20"value="${userBNG.getAdjective()}">
			<input type="submit" value="Edit Words" />
	</form>
	<br>
	<a href="index.jsp">&#8592; Start Over</a>
	</section>
</body>
</html>