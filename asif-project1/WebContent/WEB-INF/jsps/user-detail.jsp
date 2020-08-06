<%@page import="org.ecom.model.Address"%>
<%@page import="java.util.List"%>
<%@page import="org.ecom.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>User Detail</title>
		<style>
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
	</head>
	<body>
		<%
			User user = (User)request.getAttribute("user");
		%>
		<div>
			<h2><a href="/asif-project1">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/asif-project1/user/list">Back</a></h2>
		</div>
		
		<h1>Update Detail</h1>
		
		  <label for="fname">First name:</label><br>
		  <input type="text" id="fname" name="fname" value="<%= user.getFirstName() %>" readonly="readonly" /><br><br>
		  
		  <label for="lname">Last name:</label><br>
		  <input type="text" id="lname" name="lname" value="<%= user.getLastName() %>" readonly="readonly" /><br><br>
		  
		  <label for="fatherName">Father Name:</label><br>
		  <input type="text" id="fatherName" name="fatherName" value="<%= user.getFatherName() %>" readonly="readonly" /><br><br>
		  
		  <label for="dob">Date Of Birth:</label><br>
		  <input type="text" id="datepicker" name="dob" value="<%= user.getDob() %>" readonly="readonly" /><br><br>
		  
		  <label for="email">Email:</label><br>
		  <input type="text" id="email" name="email" value="<%= user.getEmail() %>" readonly="readonly" /><br><br>
		  
		  <label for="gender">Gender:</label><br>
		  <input type="text" id="gender" name="gender" value="<%= user.getGender() ? "male" : "female" %>" readonly="readonly" /><br><br>
		  <br>
		  <br>
		  <h1>Addresses Detail</h1>
		  <table>
			<tr>
				<th>Street</th>
				<th>City</th>
				<th>State</th>
				<th>Country</th>
				<th>Pincode</th>
			</tr>
			<%
				List<Address> addressList = (List<Address>)request.getAttribute("addressList");
				for(Address address : addressList){
				%>
					<tr>
						<td><%= address.getStreet() %></td>
						<td><%= address.getCity() %></td>
						<td><%= address.getState() %></td>
						<td><%= address.getCountry() %></td>
						<td><%= address.getPincode() %></td>
					</tr>
				<%
				}
			%>
		</table>
		
	</body>
</html>