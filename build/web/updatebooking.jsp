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
			<a href="booking.jsp">Manage Booking</a>
			<span>&gt;</span>
			Edit Booking
		</div>
		<!-- End Small Nav -->
		
		
 
		<br />
		<!-- Main -->
		<div id="main">
			<div class="cl">&nbsp;</div>
 <%
String id = request.getParameter("id");
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select book_id, to_char(book_date, 'dd/mm/yyyy')book_date, to_char(book_date_finished, 'dd/mm/yyyy')book_date_finished, book_status  from booking where book_id = '"+id+"'");
%>            			
			<!-- Content -->
			<div id="content">
				
				<!-- Box -->
				<div class="box">
					<!-- Box Head -->
					<div class="box-head">
						<h2 class="left">Edit Booking Information</h2>
						
					</div>
					<!-- End Box Head -->	

					<!-- form update -->
					<div>
                                                    
                                                    <form action="bookcontrol?action=editing"  method="post" name="updatef" id="updatef">
                                                    <% 
                                                    while(rs.next()){
                                                    %>						
						<!-- Form -->
                                                    <div class="form">
						        * Required field <br/><br/>
                                                        <table class="htmlForm">
                                                        <tr>
                                                            <td>ID tempahan</td>
                                                            <td>:</td>
                                                            <td><input type="hidden" name="bkid" value="<%= rs.getString(1)%>"/><font color="black"><%= rs.getString(1)%></font></td>
                                                        </tr>  
                                                        <tr>
                                                            <td>Tarikh Tempah</td>
                                                            <td>:</td>
                                                            <td><font color="black"><%= rs.getString(2)%></font></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Tarikh Siap</td>
                                                            <td>:</td>
                                                            <td><input type="date" name="datefinish" value="<%= rs.getString(3)%>"/></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Status</td>
                                                            <td>:</td>
                                                            <td><select name="status">
                                                                    
                                                                    <%
                                                                    String stat =  rs.getString(4) ; 
                                                                    if (stat.equalsIgnoreCase("Processing")){
                                                                    %>
                                                                    <option>...</option>
                                                                    <option value="Progress">Progress</option>
                                                                    <option value="Completed">Completed</option>
                                                                    <% } else if(stat.equalsIgnoreCase("Progress")){ %>
                                                                    <option value="<%= rs.getString(4)%>" selected><%= rs.getString(4)%></option>
                                                                    <option value="Completed">Completed</option>
                                                                    <% } else if(stat.equalsIgnoreCase("Completed")){ %>
                                                                    <option value="<%= rs.getString(4)%>" selected><%= rs.getString(4)%></option>
                                                                    <option value="Completed">Progress</option>
                                                                    <% } %>
                                                                </select>
                                                            </td>
                                                        </tr>
                                                         <% 
                                                        }
                                                        %>                                                       
                                                        <tr bgcolor="#FFCC66">
                                                                <td>&nbsp;</td>
                                                                <td colspan="2">
                                                                    <input type="submit" value="Update" " />
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
<%@include file="coreStaff/footer.jsp" %>
<!-- End Footer -->

	
</body>

</html>

