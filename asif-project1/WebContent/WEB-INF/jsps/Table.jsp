<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

    <style>
        h1 {text-align: center;}
        button{float: left;}
        table {
          font-family: arial, sans-serif;
          border-collapse: collapse;
          width: 100%;
        }
        
        td, th {
          border: 1px solid #dddddd;
          text-align: left;
          padding: 8px;
        }
        
        tr:nth-child(even) {
          background-color: #dddddd;
        }
        
        form {
 			 text-align: center;
		}
		
		
    </style>

<head>
    <meta charset="UTF-8">
    <title>Tables</title>

        <script>
        function addrow() {
            var state = document.getElementById('state') .value;
            var country = document.getElementById('country') .value;
            var zipCode = document.getElementById('zipCode') .value;
            
            var table = document.getElementsByTagName('table') [0];
            var newrow = table.insertRow(1);
            var one = newrow.insertCell(0);
            var two = newrow.insertCell(1);
            var three = newrow.insertCell(2);
            one.innerHTML = state;
            two.innerHTML = country;
            three.innerHTML = zipCode;
        }
    </script>
    
</head>


<body>
		
		<div>
			<h2><a href="/asif-project1">Home</a></h2>
		</div>
		
			<table>
			    <tr>
			        <th>State</th>
			        <th>Country</th>
			        <th>Zip Code</th>
			    </tr>
			</table>
			<br/><br/>
		
<form>
			    <label> State </label><br>
			    <input type="text" name="state" id="state" /><br/>
			    
			    <label> Country </label><br>
			    <input type="text" name="country" id="country" /><br/>
			
			    <label> Zip Code</label><br>
			    <input type="text" name="zipCode" id="zipCode" /><br/><br/>
 			
 		
			
				 <input type="button" value="Add"   onclick="addrow();">
			 
			 
</form>
 
</body>
</html>