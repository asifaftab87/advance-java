<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Insert Data</h2>

<form action="emp" method="post">
  <label for="id">EmpId:</label><br>
  <input type="text" name="id" ><br><br>
  <label for="fname">first Name :</label><br>
  <input type="text" name="fname" ><br><br>
  <label for="em">email :</label><br>
  <input type="text" name="em" ><br><br>
  <label for="tit">jobTitle :</label><br>
  <input type="text" name="tit" ><br><br>

  <input type="submit" value="Submit">
</form>

</body>
</html>