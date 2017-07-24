<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>     
<%@page import="java.io.*" %>    
<%@page import="dbcon.ConnectionManager" %> 
<%@page import="java.util.Date" %>   
<%@page import="java.text.*" %>   
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
			<a href="report.jsp">Report</a>
			<span>&gt;</span>
			Generate Report
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
                                        </div>
                            <div class="box1">
                                <table class="table">
                                    <form method="post" action="report.jsp" >
                                        <tr><td>Date From: </td><td><input type="date" name="datefrom"/></td>
                                        <td>Date To:</td><td> <input type="date" name="dateto"/></td>
                                        
                                        <td><input type="submit" value="Generate"/></td>
                                        </tr>
                                    </form>
                                </table>
                            </div>
<!--                            
                            
                            -->
				<!-- End Box -->
			
				<!-- Box -->
				<div class="box">
					<!-- Box Head -->
					<div class="box-head">
						<h2 class="left">Booking List</h2>
						
					</div>
					<!-- End Box Head -->	
                                        <%
                                        String datefrom = request.getParameter("datefrom");
                                        String dateto = request.getParameter("dateto");
                                        if (datefrom == null && dateto == null) {
                                        // myText is null when the page is first requested, 
                                        // so do nothing
                                        }else 
                                        {
                                        
                                        Class.forName("oracle.jdbc.driver.OracleDriver");

                                        Connection conn= ConnectionManager.getConnection();
                                        Statement st = conn.createStatement();
                                        ResultSet rst = st.executeQuery("select book_id, to_char(book_date, 'dd/mm/yyyy')book_date, to_char(book_date_finished, 'dd/mm/yyyy')book_date_finished, book_price, book_status, book_slip, product_id, cust_id from PROJECT.BOOKING WHERE book_date >= TO_DATE ('"+datefrom+"', 'yyyy-mm-dd') AND book_date < TO_DATE ('"+dateto+"', 'yyyy-mm-dd') + 1 ORDER BY book_id");
                                        %>              
					<!-- Table -->
                                        
                                
                                    <form>
                                        <tr><td><input type="radio" name="salemonth"/>Sales in month</td>
                                        <td><input type="radio" name="saleyear"/>Sales in year</td>
                                        <td><input type="radio" name="empcharge"/>Staff in charges</td>
                                        
                                        <td><input type="submit" value="Generate"/></td>
                                        </tr>
                                    </form>
                                        
					<div class="table">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
                                                            <th>ID</th>
                                                            <th>Tarikh Tempah</th>
                                                            <th>Tarikh Siap</th>
                                                            <th>Harga(RM)</th>
                                                            <th>Status</th>
                                                            <th>Slip Bayaran</th>
                                                            <th>Produk</th>
                                                            <th>iD Pelanggan</th>
							</tr>
                                                        <% 
                                                        int i = 0;
                                                        while (rst.next()) { 
                                                           i++; 
                                                        %>                                     
							<tr>
								<td><center><%= rst.getString("BOOK_ID") %></center></td>
                                                                <td><center><%= rst.getString("BOOK_DATE") %></center></td>
                                                                <td><center><%= rst.getString("BOOK_DATE_FINISHED") %></center></td>
                                                                <td><center><%= rst.getFloat("BOOK_PRICE") %></center></td>   
                                                                <td><center><%= rst.getString("BOOK_STATUS") %></center></td>  
                                                                <td><center><img width="50" height="50" src="displayimgbook?id=<%=rst.getString("BOOK_ID")%>"></img></td>
                                                                <%
                                                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                                                String id = rst.getString("PRODUCT_ID");
                                                                Connection con1= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
                                                                Statement st1 = con1.createStatement();
                                                                ResultSet sut = st1.executeQuery("select * from product where pro_id = '"+id+"'");
                                                                sut.next();
                                                                String name = sut.getString("pro_name");
                                                                %>
                                                                <td><center><%= name %></center></td>  
                                                                <td><%= rst.getString("CUST_ID") %></td>
                                                                
							</tr>
                                                <% 
                                                }// cloe while 
                                                 %>
                                                 <b><%= i %> rekod ditemui.</b>
                                                 <%       
                                                }//close if 
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