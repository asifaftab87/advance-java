<%@page import="org.ecom.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>User List</title>
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
		
		<div>
			<h2><a href="/asif-project1">Home</a></h2>
		</div>
		
		<h1>Users Detail</h1>
		
		<div>
			<form action="/asif-project1/user/add">
				<input type="submit" value="Add User" style="float: right;" />
			</form>
		</div>

		<br />
		<br />

		<div>
			<form action="/asif-project1/user/search">
				<input type="text" placeholder="Enter Name" name="name" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />
		<br />

		<table>
			<tr>
				<th>First Name</th>
				<th>Email</th>
				<th>Gender</th>
				<th>Action</th>
			</tr>
			<%
				List<User> userList = (List<User>)request.getAttribute("userList");
				if(!userList.isEmpty()){
					for(User user : userList){
						%>
							<tr>
								<td>
									<a href="/asif-project1/user/detail?userId=<%= user.getId() %>">
										<%= user.getFirstName() %>
									</a>
								</td>
								<td><%= user.getEmail() %></td>
								<td><%= user.getGender() ? "male" : "female" %></td>
								<td>
									<a href="/asif-project1/user/delete?userId=<%= user.getId() %>">Delete</a>
									<a href="/asif-project1/user/update?userId=<%= user.getId() %>">Update</a>
								</td>
							</tr>
						<%
					}
				}
				else{
					%>
						<tr>
							<td colspan="4">No user found</td>
						</tr>
					<%
				}
			%>
		</table>
	</body>
</html>