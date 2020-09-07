<%@page import="org.ecom.model.EmployeeOne"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Update</title>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="/resources/demos/style.css">
	    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	    <script>
			  $(function() {
			    $("#dobDatepicker").datepicker();
			    $('dob').keypress(function(e) {
			        e.preventDefault();
			    });
			  });
			  $(function() {
				    $("#joinedDatepicker").datepicker();
				    $('Dob').keypress(function(e) {
				        e.preventDefault();
				    });
				  });
			  $(function() {
				    $("#releaseDatepicker").datepicker();
				  });
			 
  	    </script>
	</head>
	<body>
		<%
		EmployeeOne employeeOne = (EmployeeOne)request.getAttribute("employeeOne");
		%>
		<div>
			<h2><a href="/asif-project1">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/asif-project1/employeeOneController/list">Employee Detail</a></h2>
		</div>
		
		<h1>Update Employee</h1>
		
		<form action="/asif-project1/employeeOneUpdateController/update" method="post">
		
		  <input type="hidden" id="employeeOneId" name="employeeOneId" value="<%= employeeOne.getId() %>" />
		  
		  <label for="name">Employee Name:</label><br>
		  <input type="text" id="name" name="name" value="<%= employeeOne.getName() %>" /><br><br>
		  
		  <label for="dob">Date Of Birth:</label><br>
		  <input type="text" id="dobDatepicker" name="dob" value="<%= employeeOne.getDob() %>" /><br><br>
		  
		  <label for="emailId">Email:</label><br>
		  <input type="text" id="emailId" name="emailId" value="<%= employeeOne.getEmailId() %>" /><br><br>
		  
		   <input type="radio" id="male" name="gender" value="true" />
		  <label for="male">Male</label>
		  
		  <input type="radio" id="female" name="gender" value="false" />
		  <label for="female">Female</label><br><br>
		  
		  <label for="joinedDate">Joined Date:</label><br>
		  <input type="text" id="joinedDatepicker" name="joinedDate" value="<%= employeeOne.getJoinedDate() %>" /><br><br>
		  
		  <label for="releaseDate">Release Date:</label><br>
		  <input type="text" id="releaseDatepicker" name="releaseDate" value="<%= employeeOne.getReleaseDate() %>" /><br><br>
		  
		  <label for="noticePeriod">Notice Period:</label><br>
		  <input type="text" id="noticePeriod" name="noticePeriod" value="<%= employeeOne.getNoticePeriod() %>" /><br><br>
		  
		  <input type="submit" value="Submit">
		</form> 

</body>
</html>