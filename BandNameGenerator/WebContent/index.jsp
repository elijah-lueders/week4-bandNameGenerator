<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h3>Can't think of a decent band name?</h3>
		<p>We've all been there. You have a band. You have the gear, the members, the songs but no band name. We're here to help! Give us a little info and we'll have a list of adequate band names before you know it so you can get back to what matters!</p>
		<form action="getLeaderNameServlet" method="post">
			...so who shall lead this band?<br><input type="text"
				name="name" size="20"><br><input type="submit"
				value="Next" />
		</form>
	</section>
</body>
</html>