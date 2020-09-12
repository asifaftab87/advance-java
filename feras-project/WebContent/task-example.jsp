<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task-List</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<link rel="stylesheet" href="/resources/demos/style.css">
 	 <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script>
		<!-- function validateForm(){
			var fname = document.forms["myForm"]["firstname"].value;
			var lname = document.forms["myForm"]["lastname"].value;
			var dob = document.forms["myForm"]["dob"].value;
			var emailId = document.forms["myForm"]["email-id"].value;
			if(fname == ""){
				alert("name must be filled out");
				return false;
			}
			if(lname == ""){
				alert("last name must be filled out");
				return false;
			}
			if(dob == ""){
				alert("dob must be filled out");
				return false;
			}
			if(emailId == ""){
				alert("email-id must be filled out");
				return false;
			}-->
			
	</script>
</head>
<body>
<h2>Input data</h2>
<form name="myForm" action="/feras-project/task" method="post">
	<label for="name">Name</label><br>
	<input type="text" id="name" name="name"><br>
	
	<label for="emailId">emailId</label><br>
	<input type="text" id="emailId" name="emailId"><br>
	
	<input type="radio" id="gender" name="gender" value="male">
	<label for="gender">Male</label><br>
	<input type="radio" id="gender" name="gender" value="female">
	<label for="gender">Female</label><br>
	
	<label for="dob">Date of birth</label>
	<input type="text" name="dob" id="dob" /><br><br>
	
	<label for="age">age</label><br>
	<input type="text" id="age" name="age"><br><br>
	
	<input type="submit" onclick="validate();" value="Submit"><br>
	
	<!--<label for="country">Country</label>
		<select name="country" id="country">
		<option value=>select a country</option>
		<option value="Sudan">Sudan</option>
		<option value="Malaysia">Malaysia</option>
		<option value="India">India</option>
		<option value="turkey">Turkey</option>
		<option value="turkey">Indonesia</option>
		</select><br><br> -->
  <script>
  function validate(){
	var x, text;
	x = document.getElementById("dob").value;
	if(isNaN(x) || x < 1){
		text = "invalid input";
	} else{
		text = "input ok";
		}
	document.getElementById("dob").innerHTML = text;
	}
  $( function() {
    $( "#dob" ).datepicker();
  } );
   </script>
	<!--<p id="demo"></p>
	<h3>Education</h3>
	<input type="checkbox" id="edu" name="edu">
	<label for="edu">Master</label><br> 
	<input type="checkbox" id="edu" name="edu">
	<label for="edu">Bachelor</label><br> 
	<input type="checkbox" id="edu" name="edu">
	<label for="edu">Higher education</label><br>-->
</form>

</body>
</html>