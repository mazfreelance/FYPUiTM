<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>     
<%@page import="java.io.*" %>    
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
			View Product
		</div>
		<!-- End Small Nav -->
		<br />
		<!-- Main -->
		<div id="main">
			<div class="cl">&nbsp;</div>
			
			<!-- Content -->
			<div id="content">
					<div class="box-content">
                                                <script type="text/javascript">
                                                    function showMe (it, box) {
                                                        var vis = document.getElementById("show") ? "block" : "none";
                                                        document.getElementById(it).style.display = vis;
                                                        }
                                                </script>

                                                <input type="button" id="show" class="add-button" name="multi_note" value="Add  " onclick="showMe('div1', this)"/>
                                                
                                                <br/><br/>

                                                <div id="div1" style="display:none">
                                                    
                                                    <form action="ProductController?action=add" enctype="multipart/form-data" method="post" name="addpro" id="addpro">
						
						<!-- Form -->
                                                    <div class="form">
						        * Required field <br/><br/>
                                                        <table class="htmlForm">
                                                        <tr>
                                                            <td>Product ID *</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="proid" value="PRO"/><font color="black">eg:PROXX</font></td>
                                                        </tr>   
                                                        <tr>
                                                            <td>Product Name *</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="proname" id="pass"/></td>
                                                        </tr> 
                                                        <tr>
                                                            <td>Product Type *</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="protype" id="repass"/></td>
                                                        </tr> 
                                                        <tr>
                                                            <td>Product Description</td>
                                                            <td>:</td>
                                                            <td><textarea rows="3" cols="16" name="prodesc" form="addpro"></textarea></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Product Price(RM)*</td>
                                                            <td>:</td>
                                                            <td><input type="text" name="proprice"/></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Product Picture</td>
                                                            <td>:</td>
                                                            <td><input type="file" name="prophoto"/></td>
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
			<div class="box">
				<!-- Box -->
				<div class="box">
					<!-- Box Head -->
					<div class="box-head">
						<h2 class="left">Product List</h2>
						<div class="right">
                                                        <form method="post" action="searchpro.jsp">
							<label>search product</label>
							<input type="text" name="proid" class="field small-field" />
							<input type="submit" class="button" value="search" />
                                                        </form>
						</div>
					</div>
					<!-- End Box Head -->	
                                         <%
                                        Class.forName("oracle.jdbc.driver.OracleDriver");
                                        String id = request.getParameter("proid");
                                        
                                        Connection con= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
                                        Statement stmt = con.createStatement();
                                        ResultSet rs = stmt.executeQuery("select * from PRODUCT where PRO_ID = '"+id+"'");
                                        %>            
					<!-- Table -->
					<div class="table">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<th width="13"><input type="checkbox" class="checkbox" /></th>
								<th>ID</th>
								<th>Name</th>
								<th>Type</th>
                                                                <th>Description</th>
                                                                <th>Price(RM)</th>
                                                                <th>Picture</th>
								<th width="110" class="ac">Content Control</th>
							</tr>
                                                        <% 
                                                        while (rs.next()) { 
                                                        
                                                        %>                                         
							<tr>
								<td><input type="checkbox" class="checkbox" /></td>
								<td><%= rs.getString(1) %></td>
								<td><%= rs.getString(2) %></td>
								<td><%= rs.getString(3) %></td>
                                                                <td><%= rs.getString(4) %></td>
								<td><%= rs.getString(5) %></td>   
                                                                <td><img width="50" height="50" src="displayimg?id=<%=rs.getString(1)%>"></img></td>
                                                                
                                                                <td><form action="ProductController?action=delete" method="post">
                                                                    <input type="hidden" name="proid" value="<%= rs.getString(1) %>"/>    
                                                                    <input type="submit" value="Delete" onclick="return Delete()"/></form> 
                                                                    
                                                                    <form action="updatepro.jsp" method="post">
                                                                    <input type="hidden" name="ic" value="<%= rs.getString(1) %>"/>    
                                                                    <input type="submit" value="Edit"/></form> 
                                                                </td>
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
                        </div>                    
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