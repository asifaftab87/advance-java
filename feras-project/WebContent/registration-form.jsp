<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student-form</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
	  $( function() {
	    $( "#dob" ).datepicker();
	  } );
  </script>
</head>
	<body>
		<h2>Student Login</h2>
		<form name="studentForm" action="/feras-project/student" method="post" id="studentForm">
			<label for="FullName">Full Name</label>
			<input type="text" id="fullName" name="fullName">
			<br><br>
			<label for="svName">Supervisor Name</label>
			<input type="text" id="svName" name="svName">
			<br><br>
			<label for="studentId">student Id</label>
			<input type="text" id="studentId" name="studentId">
			<br><br>
			<label for="email">Email</label>
			<input type="text" id="email" name="email">
			<br><br>
			<label for="dob">Date of birth</label>
			<input type="text" id="dob" name="dob">
			<br><br>
			<p style="font-weight: bold">Gender</p>
			<label for="male">male</label>
			<input type="radio" id="gender" name="gender" value="male"><br>
			<label for="female">female</label>
			<input type="radio" id="gender" name="gender" value="female">
			<br><br>
			<label for="course">Course</label>
			<select name="course" id="country">
				<option value="-1">Select a course</option>
				<option value="1">Civil  engineering</option>
				<option value="2">Computer  engineering</option>
				<option value="3">ELectrical  engineering</option>
				<option value="4">Industrial  engineering</option>
				<option value="5">Manufacturing  engineering</option>
				<option value="6">Software  engineering</option>
			</select><br><br>
			<input type="submit" value="Submit" onclick="validateForm();">
		</form>
	
	</body>
</html>