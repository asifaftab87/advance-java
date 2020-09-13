<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <style>
      h1 {text-align: center;}
      
    </style>
<head>
    <meta charset="UTF-8">
    <title> DropDown List </title>

   
</head>
<body>
    	<div>
			<h2><a href="/asif-project1">Home</a></h2>
		</div>
		
    	<h1> Subject List</h1>
	
		<p id="result">-- Select Subject --</p>

		<select id="subject">
			<option value="None" selected>-- Select Subject --</option>
		
			<option value="001" >Social Studies</option>
			<option value="002">Science</option>
			<option value="003">Mathematics</option>
			<option value="004">Arts</option>
			<option value="005">Arts</option>
			<option value="006">Foreign Languages</option>
		</select>
    
    	<script>

			function Value(){
				var e = document.getElementById("subject");
				var result = e.options[e.selectedIndex].value;

				document.getElementById("result").innerHTML = result;
			}

			function Text(){
				var e = document.getElementById("subject");
				var result = e.options[e.selectedIndex].text;

				document.getElementById("result").innerHTML = result;
			}

		</script>

		<br/>
		<br/>
		
		<button type="button" onclick="Value()">ID</button>

		<button type="button" onclick="Text()">Subject</button>
</body>
</html>	
