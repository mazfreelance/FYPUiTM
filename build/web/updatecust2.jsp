<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>     
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
                alert("Updated Sucessfully");
            }
            return true;
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
			<a href="adminHome.jsp">Manage Customer</a>
			<span>&gt;</span>
			Edit Customer
		</div>
		<!-- End Small Nav -->
		
		
 
		<br />
		<!-- Main -->
		<div id="main">
			<div class="cl">&nbsp;</div>
 <%
long icn = Long.parseLong(request.getParameter("ic"));
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from CUSTOMER where CUST_ID = '"+icn+"'");
%>            			
			<!-- Content -->
			<div id="content">
				
				<!-- Box -->
				<div class="box">
					<!-- Box Head -->
					<div class="box-head">
						<h2 class="left">Edit Personal Information</h2>
						
					</div>
					<!-- End Box Head -->	

					<!-- form update -->
					<div>
                                                    
                                                    <form action="CustomerController1?action=updating" method="post" name="updatef" id="updatef">
<% 
while(rs.next()){
%>						
						<!-- Form -->
                                                    <div class="form">
						        * Required field <br><br>
                                                        <table class="htmlForm">
                                                        <tr>
                                                            <td>Username *</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="uname" value="<%= rs.getString(8) %>"></td>
                                                        </tr>   
                                                        <tr>
                                                            <td>Password *</td>
                                                            <td>:</td>
                                                            <td><input type="password" name="passw" id="pass" value="<%= rs.getString(9) %>"></td>
                                                        </tr> 
                                                        <tr>
                                                            <td>Re-enter Password *</td>
                                                            <td>:</td>
                                                            <td><input type="password" name="repass" id="repass" value="<%= rs.getString(9) %>"></td>
                                                        </tr> 
                                                        <tr><td colspan="2"><br>Personal Information<br><br></td></tr>
                                                        <tr>
                                                            <td>Name*</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="name" value="<%= rs.getString(2) %>"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Identity card number*</td>
                                                            <td>:</td>
                                                            <td><%= rs.getString(1) %><input type="hidden" name="icn" value="<%= rs.getString(1) %>"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Current Address*</td>
                                                            <td>:</td>
                                                            <td><textarea rows="3" cols="18" name="addr" form="updatef" ><%= rs.getString(3) %></textarea></td>
                                                        </tr>
                                                        <tr>
                                                            <td>City*</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="city" value="<%= rs.getString(4) %>"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Poscode*</td>
                                                            <td>:</td>
                                                            <td><input type="number" name="code" value="<%= rs.getString(5) %>"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>State*</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="state" value="<%= rs.getString(6) %>"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Phone Number*</td>
                                                            <td>:</td>
                                                            <td><input type="number" name="phone" value="<%= rs.getString(10) %>"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Email</td>
                                                            <td>:</td>
                                                            <td><input type="email" name="email" value="<%= rs.getString(7) %>"></td>
                                                        </tr>
 <% 
}
%>                                                       
                                                        <tr bgcolor="#FFCC66">
                                                                <td>&nbsp;</td>
                                                                <td colspan="2">
                                                                    <input type="submit" value="Update" onclick="Validate()" />
                                                                    <input type="reset" value="Reset" />              
                                                                </td>
                                                        </tr>
                                                        </table> 
                                                    </form>
                                                </div>
					<!-- form update -->
					
				</div>
                                

			</div>
			<!-- End Content -->
			
			<div class="cl">&nbsp;</div>			
		</div>
		<!-- Main -->
	</div>
</div>
<!-- End Container -->
<!-- Footer -->
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<%@include file="coreAdmin/footer.jsp" %>
<!-- End Footer -->

	
</body>

</html>