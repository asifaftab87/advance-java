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
          border: 1px solid #749e73;
          text-align: left;
          padding: 8px;
        }
        
        tr:nth-child(even) {
          background-color: #749e73;
        }
    </style>
<head>
    <meta charset="UTF-8">
    
    	<div>
			<h2><a href="/asif-project1">Home</a></h2>
		</div>
		
   <TITLE> Add Students </TITLE>
   <h1> Add Students rows in HTML table </h1>
   
   
	<SCRIPT language="javascript">
	
		function addRow(dataTable) {

			var table = document.getElementById(dataTable);

			var rowCount = table.rows.length;
			var row = table.insertRow(rowCount);

			var colCount = table.rows[0].cells.length;

			for(var i=0; i<colCount; i++) {

				var newcell	= row.insertCell(i);

				newcell.innerHTML = table.rows[0].cells[i].innerHTML;
				//alert(newcell.childNodes);
				switch(newcell.childNodes[0].type) {
					case "text":
							newcell.childNodes[0].value = "";
							break;
				
					case "select-one":
							newcell.childNodes[0].selectedIndex = 0;
							break;
				}
			}
		}

	

	</SCRIPT>
</HEAD>
<BODY>


<TABLE id="St" width="350px" border="1">
   <tr>
        <th  width="26%">Firstname</th>
        <th  width="26%">Lastname</th>
         <th  width="26%">Email </th>
         <th  width="25%">section</th>
        
  
    </tr>
    </table>
	
	<TABLE id="dataTable" width="350px" border="1">
<TR>
	
			<TD><INPUT type="text" name="txt"  placeholder="Enter First name "/></TD>	
			<TD><INPUT type="text" name="txt"  placeholder="Enter Last name "/></TD>
			<TD><INPUT type="text" name="txt"  placeholder="Enter your Email "/></TD>
			<TD>
				<SELECT name="Class" >
					<OPTION value="ch">Choose your class </OPTION>
					<OPTION value="fi"> First </OPTION>
					<OPTION value="sc"> Second </OPTION>
					<OPTION value="th"> Third </OPTION>
					<OPTION value="fo"> Fourth </OPTION>
					
				</SELECT>
			</TD>
		</TR>
	</TABLE>
	<INPUT type="button" value="Add Row" onclick="addRow('dataTable')" />

 
</body>
</html>