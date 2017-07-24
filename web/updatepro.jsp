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
			<a href="product.jsp">Manage Product</a>
			<span>&gt;</span>
			Edit Product
		</div>
		<!-- End Small Nav -->
		
		
 
		<br />
		<!-- Main -->
		<div id="main">
			<div class="cl">&nbsp;</div>
 <%
String id = request.getParameter("ic");
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from PRODUCT where PRO_ID = '"+id+"'");
%>            			
			<!-- Content -->
			<div id="content">
				
				<!-- Box -->
				<div class="box">
					<!-- Box Head -->
					<div class="box-head">
						<h2 class="left">Edit Product Information</h2>
						
					</div>
					<!-- End Box Head -->	

					<!-- form update -->
					<div>
                                                    
                                                    <form action="ProductController?action=edit" enctype="multipart/form-data" method="post" name="updatef" id="updatef">
                                                    <% 
                                                    while(rs.next()){
                                                    %>						
						<!-- Form -->
                                                    <div class="form">
						        * Required field <br/><br/>
                                                        <table class="htmlForm">
                                                        <tr>
                                                            <td>Product ID *</td>
                                                            <td>:</td>
                                                            <td><input type="hidden" name="proid" value="<%= rs.getString(1)%>"/><font color="black"><%= rs.getString(1)%></font></td>
                                                        </tr>   
                                                        <tr>
                                                            <td>Product Name *</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="proname" id="pass" value="<%= rs.getString(2)%>"/></td>
                                                        </tr> 
                                                        <tr>
                                                            <td>Product Type *</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="protype" id="repass" value="<%= rs.getString(3)%>"/></td>
                                                        </tr> 
                                                        <tr>
                                                            <td>Product Description*</td>
                                                            <td>:</td>
                                                            <td><textarea rows="3" cols="16" name="prodesc" form="updatef"><%= rs.getString(4)%></textarea></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Product Price(RM)*</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="proprice" value="<%= rs.getString(5)%>"/></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Product Picture</td>
                                                            <td>:</td>
                                                            <td><input type="file" name="prophoto" value="<%= rs.getBlob(6)%>"/></td>
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

