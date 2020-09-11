<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
h1 {
	text-align: center;
}

input[type=text], select {
  width: 20%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}



div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

</style>
<head>
<meta charset="UTF-8">
<title>Dynamic DropDown</title>




</head>
<body>
	<div>
		<h2>
			<a href="/asif-project1">Home</a>
		</h2>
	</div>

	<h1>Dynamic Drop Down List</h1>

	<form>
	<h4>	Select your Country: </h4> <select id="selectCountry" onchange="country()">
			<option>Choose a Country</option>
		</select>

		<script>
	
        
	var select = document.getElementById("selectCountry");
	var options = ["Yemen", "India", "Germany", "Turkey", "Italy"];
	for(var i = 0; i < options.length; i++) {
	var opt = options[i];
	var el = document.createElement("option");
	el.textContent = opt;
	el.value = opt;
	select.appendChild(el);
	
	}
	
	
	</script>


		<p id="demo"></p>
		<p id="result"></p>

		<script>
	function country() {
 	 var x = selectCountry.options[selectCountry.selectedIndex].value;
 	 document.getElementById("demo").innerHTML = "You Selected : " + x;
 
	}
	
/* 	function GetValuecountry() {
		let selectElement = document.getElementById("selectCountry");
		let valueSelected = selectCountry.options[selectCountry.selectedIndex].value; // get selected option value
		var text= selectCountry.options[selectCountry.selectedIndex].text;
		 document.getElementById("result").innerHTML = "You selected: " + valueSelected;
	} */
		</script>

	</form>

</body>
</html>