<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>     
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
			<a href="managestaff.jsp">Manage Staff</a>
			<span>&gt;</span>
			Edit Staff
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
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from EMPLOYEE where EMP_ID = '"+icn+"'");
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

                                            <form action="EmployeeController1?action=update" method="post" name="updatef" id="updatef">
                                <% 
                                while(rs.next()){
                                %>						
                                        <!-- Form -->
                                            <div class="form">
                                                * Required field <br/><br/>
                                                <table class="htmlForm">
                                                <tr>
                                                    <td>Username *</td>
                                                    <td>:</td>
                                                    <td><font color="black"><%= rs.getString(10)%></font><input type="hidden" name="username" value="<%= rs.getString(10) %>"/></td>
                                                </tr>   
                                                <tr>
                                                    <td>Password *</td>
                                                    <td>:</td>
                                                    <td><input type="password" name="pass" id="pass" value="<%= rs.getString(11) %>"/></td>
                                                </tr> 
                                                <tr>
                                                    <td>Re-enter Password *</td>
                                                    <td>:</td>
                                                    <td><input type="password" name="repass" id="repass" value="<%= rs.getString(11) %>"/></td>
                                                </tr> 
                                                <tr><td colspan="2"><br/>Personal Information<br/><br/></td></tr>
                                                <tr>
                                                    <td>Name*</td>
                                                    <td>:</td>
                                                    <td><font color="black"><%= rs.getString(2)%></font><input type="hidden" name="name" value="<%= rs.getString(2) %>"/></td>
                                                </tr>
                                                <tr>
                                                    <td>Identity card number*</td>
                                                    <td>:</td>
                                                    <td><font color="black"><%= rs.getString(1)%></font><input type="hidden" name="ic" value="<%= rs.getString(1) %>"/></td>
                                                </tr>
                                                <tr>
                                                    <td>Current Address*</td>
                                                    <td>:</td>
                                                    <td><textarea rows="4" cols="16" name="address" form="updatef"><%= rs.getString(3) %></textarea></td>
                                                </tr>
                                                <tr>
                                                    <td>City*</td>
                                                    <td>:</td>
                                                    <td><input type="text" name="city" value="<%= rs.getString(4) %>"/></td>
                                                </tr>
                                                <tr>
                                                    <td>Poscode*</td>
                                                    <td>:</td>
                                                    <td><input type="number" name="code" value="<%= rs.getString(5) %>"/></td>
                                                </tr>
                                                <tr>
                                                    <td>State*</td>
                                                    <td>:</td>
                                                    <td><input type="text" name="state" value="<%= rs.getString(6) %>"/></td>
                                                </tr>
                                                <tr>
                                                    <td>Phone Number*</td>
                                                    <td>:</td>
                                                    <td><input type="number" name="phone" value="<%= rs.getString(7) %>"/></td>
                                                </tr>
                                                <tr>
                                                    <td>Email</td>
                                                    <td>:</td>
                                                    <td><input type="email" name="email" value="<%= rs.getString(8) %>"/></td>
                                                </tr>
                                                <tr>
                                                    <td></td>
                                                    <td></td>
                                                    <td><input type="hidden" name="role" value="<%= rs.getString(9) %>"/></td>
                                                </tr> 
                                <% } %>
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
                                <!--endbox-->
                            
                            
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