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
    </style>
<head>
    <meta charset="UTF-8">
    <title>Tables</title>

    <script>

        function addrow() {

            var fname = document.getElementById('fname') .value;
            var lname = document.getElementById('lname') .value;
            var age = document.getElementById('age') .value;
            
            var table = document.getElementsByTagName('table') [0];

            var newrow = table.insertRow(1);

            var one = newrow.insertCell(0);
            var two = newrow.insertCell(1);
            var three = newrow.insertCell(2);

            one.innerHTML = fname;
            two.innerHTML = lname;
            three.innerHTML = age;
        }

    </script>
</head>
<body>
	
	<div>
			<h2><a href="/asif-project1">Home</a></h2>
		</div>
    <h1>Table</h1>

    <label> First name: </label><br>
    <input type="text" name="fname" id="fname" /><br/>
    
    <label> Last name:</label><br>
    <input type="text" name="lname" id="lname" /><br/>

    <label> Age:</label><br>
    <input type="text" name="age" id="age" /><br/><br/>

    <button onclick="addrow();">Add User </button><br/><br/>
<table>
 
    <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Age</th>
    </tr>
    <tr>
        <td>Dilshad</td>
        <td>Noshad</td>
        <td>18</td>
    </tr>
</table>
 
</body>
</html>