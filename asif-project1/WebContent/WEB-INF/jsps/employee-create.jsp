<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Create Employee</title>
	</head>
	
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="/resources/demos/style.css">
	    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	   
  <body>
	 <div>
			<h2><a href="/asif-project1">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/asif-project1/employeeController/list">Employee Detail</a></h2>
		</div>
		
		<h1>Add Employee</h1>
		<form action="/asif-project1/employeeCreateController/add" method="post">
		  <label for="name">Employee Name:</label><br>
		  <input type="text" id="name" name="name"><br>
		  
		  <label for="age">Employee Age:</label><br>
		  <input type="text" id="age" name="age"><br>
		  
		
		  
		  <input type="submit" value="Submit">
		</form> 
  </body>
  
  
  </html>