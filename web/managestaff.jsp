<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>     
<%@ page import="bean.Employee" %>
<%if (session.getAttribute("currentSessionUser") != null){ %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>Administrator Panel</title>
	<link rel="stylesheet" href="coreAdmin/css/style.css" type="text/css" media="all" />
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
		<%@include file="coreAdmin/topnav.jsp" %>
		<!-- End Logo + Top Nav -->
		
		<!-- Main Nav -->
                <%@include file="coreAdmin/menu.jsp" %>
		<!-- End Main Nav -->
	</div>
</div>
<!-- End Header -->

<!-- Container -->
<div id="container">
	<div class="shell">
		
		<!-- Small Nav -->
		<div class="small-nav">
			<a href="managestaff.jsp">Manage Staff</a>
			<span>&gt;</span>
			View Staff
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
						<h2 class="left">Staff List</h2>
						<div class="right">
                                                        <form method="post" action="searchstaff.jsp">
							<label>search staff</label>
							<input type="text" name="ic" class="field small-field" />
							<input type="submit" class="button" value="search" />
                                                        </form>
						</div>
					</div>
					<!-- End Box Head -->	
 <%
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from EMPLOYEE order by emp_role");
%>            
					<!-- Table -->
					<div class="table">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<th width="13"><input type="checkbox" class="checkbox" /></th>
								<th>Name</th>
								<th>Identity Card Number</th>
								<th>Address</th>
                                                                <th>Phone Number</th>
                                                                <th>E-mail</th>
                                                                <th>Username</th>
                                                                <th>Password</th>
                                                                <th>Role</th>
								<th width="10" class="ac">Content Control</th>
							</tr>
                                                        <% 
                                                        while (rs.next()) {          
                                                         String address = rs.getString(3)+", "+rs.getString(5)+" "+rs.getString(4)+", "+rs.getString(6);   
                                                        %>                                         
							<tr>
								<td><input type="checkbox" class="checkbox" /></td>
								<td><%= rs.getString(2) %></td>
								<td><%= rs.getString(1) %></td>
								<td><%= address %></td>
                                                                <td><%= rs.getString(7) %></td>
								<td><%= rs.getString(8) %></td>
                                                                <td><%= rs.getString(10) %></td>
                                                                <td><%= rs.getString(11) %></td>
                                                                <td><%= rs.getString(9) %></td>
                                                                <%
                                                                String role = rs.getString(9);
                                                                
                                                                if(role.equalsIgnoreCase("Administrator")){
                                                                out.print("<td align='center'>");
                                                                out.print("<a href='updatestaff2.jsp?ic="+rs.getString(1)+"'>");    
                                                                out.print("<span title='Update'><button type='submit' name='upd' value='Upd'><img src='coreStaff/css/images/edit.gif' /></button></span>");
                                                                out.print("</a></td>");
                                                                }else if (role.equalsIgnoreCase("Staff")){
                                                                out.print("<td align='center'>");
                                                                out.print("<a href='updatestaff2.jsp?ic="+rs.getString(1)+"'>");    
                                                                out.print("<span title='Update'><button type='submit' name='upd' value='Upd'><img src='coreStaff/css/images/edit.gif' /></button></span></a>");
                                                                
                                                                out.print("<form action='EmployeeController1?action=delete' method='post'>");
                                                                out.print("<input type='hidden' value='"+rs.getString(1)+"' name='ic'/>");
                                                                out.print("<span title='Delete'><button type='submit' value='Delete' onclick='return Delete()'><img src='coreStaff/css/images/del.gif' /></button></span></form>"); 
                                                                
                                                                out.print("</td>");
                                                                }
                                                                
                                                                %>
<!--                                                                <td><form action="CustomerController1?action=delete" method="post">
                                                                    <input type="hidden" name="ic" value="<%= rs.getString(1) %>"/>    
                                                                    <input type="submit" value="Delete" onclick="return Delete()"/></form> 
                                                                    
                                                                    <form action="updatecust2.jsp" method="post">
                                                                    <input type="hidden" name="ic" value="<%= rs.getString(1) %>"/>    
                                                                    <input type="submit" value="Edit"/></form> 
                                                                </td>-->
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
				
                                <!-- End Box -->
				<div class="box">
					
					<!-- Box Head -->
					<div class="box-head" >
						<h2>Management</h2>
					</div>
					<!-- End Box Head-->
					
					<div class="box-content">
                                                <script type="text/javascript">
                                                    function showMe (it, box) {
                                                        var vis = document.getElementById("show") ? "block" : "none";
                                                        document.getElementById(it).style.display = vis;
                                                        }
                                                </script>

                                                <input type="button" id="show" class="add-button" name="multi_note" value="Add new Staff" onclick="showMe('div1', this)"/>
                                                
                                                <br/><br/>

                                                <div id="div1" style="display:none">
                                                    
                                                    <form action="EmployeeController1?action=adding" method="post" name="registerstaff" id="registerstaff">
						
						<!-- Form -->
                                                    <div class="form">
						        * Required field <br/><br/>
                                                        <table class="htmlForm">
                                                        <tr>
                                                            <td>Username *</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="username"/> eg:STAFxx</td>
                                                        </tr>   
                                                        <tr>
                                                            <td>Password *</td>
                                                            <td>:</td>
                                                            <td><input type="password" name="pass" id="pass"/></td>
                                                        </tr> 
                                                        <tr>
                                                            <td>Re-enter Password *</td>
                                                            <td>:</td>
                                                            <td><input type="password" name="repass" id="repass"></td>
                                                        </tr> 
                                                        <tr><td colspan="2"><br>Personal Information<br><br></td></tr>
                                                        <tr>
                                                            <td>Name*</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="name"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Identity card number*</td>
                                                            <td>:</td>
                                                            <td><input type="number" name="ic"/>eg:900101060201</td>
                                                        </tr>
                                                        <tr>
                                                            <td>Current Address*</td>
                                                            <td>:</td>
                                                            <td><textarea rows="4" cols="16" name="address" form="registerstaff"></textarea></td>
                                                        </tr>
                                                        <tr>
                                                            <td>City*</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="city"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Poscode*</td>
                                                            <td>:</td>
                                                            <td><input type="number" name="code"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>State*</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="state"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Phone Number*</td>
                                                            <td>:</td>
                                                            <td><input type="number" name="phone"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Email</td>
                                                            <td>:</td>
                                                            <td><input type="email" name="email"></td>
                                                        </tr>
                                                        <tr>
                                                            <td></td>
                                                            <td></td>
                                                            <td><input type="hidden" name="role" value="Staff"/></td>
                                                        </tr>                    
                                                        <tr bgcolor="#FFCC66">
                                                                <td>&nbsp;</td>
                                                                <td colspan="2">
                                                                    <input type="submit" value="Submit" onclick="return Validate()" />
                                                                    <input type="reset" value="Reset" />              
                                                                </td>
                                                            </tr>
                                                        </table> 
                                                    </form>
                                                </div>

						
                                        </div>
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
<%@include file="coreAdmin/footer.jsp" %>
<!-- End Footer -->

	
</body>

</html>
<% }
else{
	response.sendRedirect("index.jsp");
}

%>