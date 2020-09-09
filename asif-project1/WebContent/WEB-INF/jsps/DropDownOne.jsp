<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <style>

      h1 {text-align: center;}
      
    </style>
<head>
    <meta charset="UTF-8">
    <title>Dynamic DropDown </title>

    <script>

        function language() {

            var mylist = document.getElementById("mylist");
            document.getElementById("List").value=mylist.options[mylist.selectedIndex].text;
         
        }

    </script>
</head>
<body>
    	<div>
			<h2><a href="/asif-project1">Home</a></h2>
		</div>
		
    <h1>Dynamic Drop Down List</h1>

    <form>
    Select your language:
    <select id="mylist" onchange="language()">
    
    <option >ENGLISH</option>
    <option >URDU</option>
    <option >SPANISH</option>
    <option >HINDI</option>
    <option >ARABIC</option>
    <option >PORTUGUESE</option>
    <option >BENGALI</option>
    <option >RUSSIAN</option>
    <option >CHINESE</option>
    </select>

    <p>Your language is: <input type="text" id="List" size="25"></p>
    </form>
 
</body>
</html>