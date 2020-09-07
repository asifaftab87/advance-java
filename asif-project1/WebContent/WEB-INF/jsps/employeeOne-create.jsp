<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title> Create EmployeeOne</title>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="/resources/demos/style.css">
	    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	    <script>
	    $(function() {
		    $("#dobDatepicker").datepicker();
		  });
		  $(function() {
			    $("#joinedDatepicker").datepicker();
			  });
		  $(function() {
			    $("#releaseDatepicker").datepicker();
			  });
		  
  	    </script>
		</head>
		<body>
		
			<div>
			<h2><a href="/asif-project1">Home</a></h2>
			</div>
			
			<div>
				<h2><a href="/asif-project1/employeeOneController/list">Employee Detail</a></h2>
			</div>
			
			<h1>Add EmployeeOne</h1>
			<form action="/asif-project1/employeeOneCreateController/add" method="post"  id="employeeForm">
			
			  <label for="name">Employee Name:</label><br>
			  <input type="text" id="name" name="name"><br>
			  
			  <label for="dob">Birth Date:</label><br>
			  <input type="text" id="dobDatepicker" name="dob"><br>
			  
			  <label for="emailId">Email:</label><br>
			  <input type="text" id="emailId" name="emailId"  onmouseover="testing();"><br><br>
			  
			   <input type="radio" id="male" name="gender" value="true">
			  <label for="male">Male</label>
			  
			  <input type="radio" id="female" name="gender" value="false">
			  <label for="female">Female</label><br><br>
			  
			  <label for="joinedDate">Joined Date:</label><br>
			  <input type="text" id="joinedDatepicker" name="joinedDate"><br>
			  
			  <label for="releaseDate">Release Date:</label><br>
			  <input type="text" id="releaseDatepicker" name="releaseDate"><br>
			 
			  <label for="noticePeriod">Notice Period:</label><br>
			  <input type="text" id="noticeperiod" name="noticePeriod"><br>
			  
			 <input type="button" value="Submit" onclick="message();"> 
			 
			</form> 
			
			
			
			<script type="text/javascript"> 
			
			function testing(){
				alert(" Employee Email")
			}
			
			function message(){
				console.log ('submitting form');
		
			var name = document.getElementById("name").value;
				console.log("name: "+name);
				if(name.length==0){
					alert('please provide name');
					return false;
				}
				
				var dobDatepicker = document.getElementById("dobDatepicker").value;
				if(dobDatepicker.length==0){
					alert('please provide Date of Birth');
					return false;
				}
				
				var emailId = document.getElementById("emailId").value;
				if(emailId.length==0){
					alert('please provide email');
					return false;
				}
				if(!validateEmailId(emailId)){
					alert('please provide correct Email formar');
					return false
				}
				
				var male = document.getElementById("male").value;
				if(male.length==0){
					alert('please provide gender');
					return false;
				}
				
				var female = document.getElementById("female").value;
				if(female.length==0){
					alert('please provide gender');
					return false;
				}
				
				var joinedDatepicker = document.getElementById("joinedDatepicker").value;
				if(joinedDatepicker.length==0){
					alert('please provide joined Date');
					return false;
				}
				
				
				var releaseDatepicker = document.getElementById("releaseDatepicker").value;
				if(releaseDatepicker.length==0){
					alert('please provide releas Date');
					return false;
				}
				
				
				var noticeperiod = document.getElementById("noticeperiod").value;
				if(noticeperiod.length==0){
					alert('please provide notice period');
					return false;
				}
				
				
				document.getElementById("employeeForm").submit();
			}
			
			$(document).ready(function(){
				console.log("page loaded");
			    $("#name").keypress(function(event){
			        var inputValue = event.which;
					console.log('inputValue:  '+inputValue);
			        // allow letters and whitespaces only.
			        if(!(inputValue >= 65 && inputValue <= 120) && (inputValue != 32 && inputValue != 0)) { 
			            event.preventDefault(); 
			        }
			    });
			    
			    $('#noticeperiod').click(function(){
			    	alert('Notice period click');
			    });
			});

			function validateEmailId(emailId) {
				  const re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
				  return re.test(emailId);
				}
			


		</script>
			
</body>
</html>