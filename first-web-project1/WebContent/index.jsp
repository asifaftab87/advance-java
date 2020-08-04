<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	</head>
	<body>
	<h2>HTML Forms</h2>
	
	<form action="welcome" method="post">
	   <label for="brand">Car Brand:</label><br>
		  <input type="text" name="brand"><br>
		  
		  <label for="horsepower">Horsepower:</label><br>
		  <input type="text" name="horsepower"><br><br>
		  
		  <label for="average">Average:</label><br>
		  <input type="text" name="average"><br><br>
		  
		  <label for="colour">Colour:</label><br>
		  <input type="text" name="colour"><br><br>
	  <input type="submit" value="Submit">
	</form> 
	
	</body>
</html>