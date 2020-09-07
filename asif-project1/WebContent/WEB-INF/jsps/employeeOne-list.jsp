<%@page import="org.ecom.model.EmployeeOne"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Employee One List</title>
		
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="/resources/demos/style.css">
	    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	    <script>
			  $(function() {
			    $("#fromReleaseDate").datepicker();
			  });
			  $(function() {
			    $("#toReleaseDate").datepicker();
			  });
			  $(function() {
			    $("#fromDobDate").datepicker();
			  });
			  $(function() {
			    $("#toDobDate").datepicker();
			  });
			  $(function() {
			    $("#fromJoinedDate").datepicker();
			  });
			   $(function() {
				$("#toJoinedDate").datepicker();
			  });
			   	  
  	    </script>
  	    
  	
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
		
		<h1>Employee Detail</h1>
		
		<div>
			<form action="/asif-project1/employeeOneCreateController/add">
				<input type="submit" value="Add Employee" style="float: right;" />
			</form>
		</div>

		<br />
		<br />

		<div>
			<form action="/asif-project1/employeeOneSearchController/search">
				<input type="text" placeholder="Enter Name" name="name" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<div>
			<form action="/asif-project1/employeeOneSearchGenderController/searchgender">
				<input type="text" placeholder="Enter Gender" name="gender" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<div>
			<form action="/asif-project1/employeeOneSearchEmailController/searchemail">
				<input type="text" placeholder="Enter Email" name="emailId" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<div>
			<form action="/asif-project1/employeeOneSearchDobController/searchdob">
				<input type="text" placeholder=" ---- DOB From ---- " name="fromDobDate" id="fromDobDate" />
				<input type="text" placeholder=" ---- DOB To ---- " name="toDobDate" id="toDobDate" />
				<input type="submit" value="Search" />
				
			</form>	
		</div>
		
		<div>
			<form action="/asif-project1/employeeOneSearchJoinController/searchjoin">
				<input type="text" placeholder="-- Join Date From --" name="fromJoinedDate" id="fromJoinedDate" />
				<input type="text" placeholder="-- Join Date To --" name="toJoinedDate"  id="toJoinedDate"/>
				<input type="submit" value="Search" />
				
			</form>	
		</div>
		
		
		<div>
			<form action="/asif-project1/employeeOneSearchRelController/searchrel">
				<input type="text" placeholder="-- Release Date From --" name="fromReleaseDate" id="fromReleaseDate" />
				<input type="text" placeholder="-- Release Date To --" name="toReleaseDate" id="toReleaseDate" />
				<input type="submit" value="Search" />
				
			</form>	
		</div>
		
		
		<div>
			<form action="/asif-project1/employeeOneSearchNoticePeriodController/searchnoticeperiod">
				<input type="text" placeholder="Notice Period" name="noticePeriod" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />
		<br />
	

		<table>
			<tr>
				<th>Name</th>
				<th>Birth Date</th>
				<th>Email</th>
				<th>Gender</th>
				<th>Joined Date</th>
				<th>Release Date</th>
				<th>Notice Period</th>
				
				<th>Action</th>
			</tr>
			<%
				List<EmployeeOne> employeeOneList = (List<EmployeeOne>)request.getAttribute("employeeOneList");
				if(!employeeOneList.isEmpty()){
					for(EmployeeOne employeeOne : employeeOneList){
						%>
							<tr>
								 
								<td><%= employeeOne.getName() %></td>
								 <td><%= employeeOne.getDob() %></td>
								<td><%= employeeOne.getEmailId() %></td>
								<td><%= employeeOne.getGender() ? "male" : "female" %></td>
								 <td><%= employeeOne.getJoinedDate() %></td>
								  <td><%= employeeOne.getReleaseDate() %></td>
								   <td><%= employeeOne.getNoticePeriod() %></td>
								    
								<td>
								
							        <a href="/asif-project1/employeeOneUpdateController/update?employeeOneId=<%= employeeOne.getId() %>">Update</a>
								</td>
							</tr>
						<%
					}
				}
				else{
					%>
						<tr>
							<td colspan="10">No result found</td>
						</tr>
					<%
				}
			%>
		</table>

</body>
</html>

