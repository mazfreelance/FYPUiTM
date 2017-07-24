<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %> 
<%@page import="dbcon.ConnectionManager" %> 
<%@ page import="bean.Employee" %>
<%if (session.getAttribute("currentSessionUser") != null){ %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>Staff Panel</title>
	<link rel="stylesheet" href="coreStaff/css/style.css" type="text/css" media="all" />
        <link rel="stylesheet" type="text/css" href="css/styletable.css" />
        <script>
            function Validate() {
            var password = document.getElementById("pass").value;
            var confirmPassword = document.getElementById("repass").value;
            if (password != confirmPassword) {
                alert("Passwords do not match.");
                return false;
            }
            else{
                alert("Registered Sucessfully");
            }
            return true;
            }
            function Delete(){
                alert("Delete Successfully!");
            }
</script>    
</head>
<body>
<!-- Header -->
<div id="header">
	<div class="shell">
		<!-- Logo + Top Nav -->
		<%@include file="coreStaff/topnav.jsp" %>
		<!-- End Logo + Top Nav -->
		
		<!-- Main Nav -->
                <%@include file="coreStaff/menu.jsp" %>
		<!-- End Main Nav -->
	</div>
</div>
<!-- End Header -->

<!-- Container -->
<div id="container">
	<div class="shell">
		
		<!-- Small Nav -->
		<div class="small-nav">
			<a href="staffHome.jsp">Manage Customer</a>
			<span>&gt;</span>
			View Customer
		</div>
		<!-- End Small Nav -->
		<br />
		<!-- Main -->
		<div id="main">
			<div class="cl">&nbsp;</div>
			
			<!-- Content -->
			<div id="content">
				
				<!-- Box -->
				<div class="box">
					<!-- Box Head -->
					<div class="box-head">
						<h2 class="left">Customer List</h2>
						<div class="right">
                                                        <form method="post" action="searchcust.jsp">
							<label>search customer</label>
							<input type="text" name="ic" class="field small-field" />
							<input type="submit" class="button" value="search" />
                                                        </form>
						</div>
					</div>
					<!-- End Box Head -->	
 <%
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con= ConnectionManager.getConnection();
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from CUSTOMER");
%>            
					<!-- Table -->
					<div class="table">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<th>Name</th>
								<th>Identity Card Number</th>
								<th>Address</th>
                                                                <th>Phone Number</th>
                                                                <th>E-mail</th>
                                                                <th>Username</th>
                                                                <th>Password</th>
							</tr>
                                                        <% 
                                                        while (rs.next()) {          
                                                         String address = rs.getString(3)+", "+rs.getString(5)+" "+rs.getString(4)+", "+rs.getString(6);   
                                                        %>                                         
							<tr>
								<td><%= rs.getString(2) %></td>
								<td><%= rs.getString(1) %></td>
								<td><%= address %></td>
                                                                <td><%= rs.getString(10) %></td>
								<td><%= rs.getString(7) %></td>
								<td><%= rs.getString(8) %></td>
                                                                <td><%= rs.getString(9) %></td>
							</tr>
<% 
}        
%>                                                          
						</table>
						
						
						<!-- Pagging -->
						<div class="pagging">
							<div class="left">Showing 1 of 1</div>
							<div class="right">
								<a href="#">Previous</a>
								<a href="#">1</a>
								<a href="#">Next</a>
								<a href="#">View all</a>
							</div>
						</div>
						<!-- End Pagging -->
						
					</div>
					<!-- Table -->
					
				</div>
                                                
				<!-- End Box -->
				
                                 </br></br>  
				<!-- Box -->
				
				<!-- End Box -->

			</div>
			<!-- End Content -->
			
			<!-- Sidebar -->
			
			<!-- End Sidebar -->
			
			<div class="cl">&nbsp;</div>			
		</div>
		<!-- Main -->
	</div>
</div>
<!-- End Container -->
<!-- Footer -->
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<%@include file="coreStaff/footer.jsp" %>
<!-- End Footer -->

	
</body>

</html>
<% }
else{
	response.sendRedirect("index.jsp");
}

%>