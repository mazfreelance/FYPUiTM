<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>     
<%@page import="java.io.*" %>    
<%@page import="dbcon.ConnectionManager" %>    
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
			View Booking
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
                                                    <div class="box1">
                                                    <form action="bookcontrol?action=adding" enctype="multipart/form-data" method="post" name="addpro" id="addpro">
						
						<!-- Form -->
                                                    <div class="form">
						        * Required field <br/><br/>
                                                        <table class="htmlForm">
                                                        <tr>
                                                            <td colspan="2"><font color="black"><b>Booking Item</b></font></td>
                                                        </tr>
                                                             <%
                                                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                                                
                                                                Connection con= ConnectionManager.getConnection();
                                                                Statement stat = con.createStatement();
                                                                ResultSet rs = stat.executeQuery("select * from customer");
                                                                
                                                             %>  
                                                        <tr>
                                                            <td>Nama Pelanggan</td>
                                                            <td>:</td>
                                                            <td><select name="custid">
                                                                    <option><font color="black">...</font></option>
                                                             <% while(rs.next()){  %>          
                                                                    <option value="<%= rs.getString(1) %>"><font color="black"><%= rs.getString(2) %></font></option>
                                                             <%
                                                                }
                                                             %>
                                                                </select>
                                                            </td>
                                                        </tr>
                                                        <%
                                                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                                                
                                                                Connection cone= ConnectionManager.getConnection();
                                                                Statement sta = cone.createStatement();
                                                                ResultSet rs1 = sta.executeQuery("select * from PRODUCT");
                                                              
                                                             %>  
                                                        <tr>
                                                            <td>ID Produk</td>
                                                            <td>:</td>
                                                            <td><select name="proid">
                                                                    <option><font color="black">...</font></option>
                                                             <% while(rs1.next()){  %>          
                                                                    <option value="<%= rs1.getString(1) %>"><font color="black"><%= rs1.getString(1) %>(<%= rs1.getString(2) %>)</font></option>
                                                             <%
                                                                }
                                                             %>
                                                                </select>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td colspan="2"><font color="black"><b>Booking Information</b></font></td>
                                                        </tr>
                                                        <%
                                                        Class.forName("oracle.jdbc.driver.OracleDriver");

                                                        Connection conne= ConnectionManager.getConnection();
                                                        Statement stt = conne.createStatement();
                                                        ResultSet rstt = stt.executeQuery("select * from booking");

                                                        String proid="";
                                                        while (rstt.next()){
                                                        String prod = "BK", str="" ,numst="", PROID;
                                                        int tnum=0 , num1=0;
                                                        
                                                        String itemid = rstt.getString("BOOK_ID");
                                                        if (rstt.next()){
                                                            tnum=num1 +1;
                                                            break;
                                                        }//end if
                                                        else{
                                                            for (int j=0; j< itemid.length(); j++)
                                                            {
                                                                char a = itemid.charAt(j);
                                                                if (Character.isDigit(a)){
                                                                    numst += a;
                                                                }else{
                                                                    str += a;
                                                                }
                                                            }
                                                            num1 = Integer.parseInt(numst); 
                                                            for (int i =1; i<5000; i++){
                                                                if (num1 != i){
                                                                    tnum= num1 +1;
                                                                    break;
                                                                }
                                                            }   
                                                        }//end else
                                                        System.out.println("dekat if "+tnum);
                                                        PROID = prod + tnum; 
                                                        proid = PROID;
                                                        }//end while

                                                        %>         
                                                        <tr>
                                                            <td>Book ID</td>
                                                            <td>:</td>
                                                            <td><font color="black"><%= proid%></font><input type="hidden" name="bkid" value="<%= proid%>" size="16"/></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Book Date</td>
                                                            <td>:</td>
                                                            <td><input type="date" name="date" value=""/></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Payment slip</td>
                                                            <td>:</td>
                                                            <td><input type="file" name="slip" value=""/></td>
                                                        </tr>
                                                        <tr>
                                                            <td>Book Status</td>
                                                            <td>:</td>
                                                            <td><input type="hidden" name="status" value="Processing"/><font color="black">Processing</font></td>
                                                        </tr>
                                                        <tr bgcolor="#FFCC66">
                                                                <td>&nbsp;</td>
                                                                <td colspan="2">
                                                                    <input type="submit" value="Hantar" onclick="return Validate()" />
                                                                    <input type="reset" value="Reset" />              
                                                                </td>
                                                            </tr>
                                                        </table> 
                                                    </form>
                                                             </div>
                                            
                                                    
                                                </div>
                                        </div>
				<!-- End Box -->
			
				<!-- Box -->
				<div class="box">
					<!-- Box Head -->
					<div class="box-head">
						<h2 class="left">Booking List</h2>
						<div class="right">
                                                        <form method="post" action="searchpro.jsp">
							<label>search booking</label>
							<input type="text" name="id" class="field small-field" />
							<input type="submit" class="button" value="search" />
                                                        </form>
						</div>
					</div>
					<!-- End Box Head -->	
                                        <%
                                        Class.forName("oracle.jdbc.driver.OracleDriver");

                                        Connection conn= ConnectionManager.getConnection();
                                        Statement st = conn.createStatement();
                                        ResultSet rst = st.executeQuery("select book_id, to_char(book_date, 'dd/mm/yyyy')book_date, to_char(book_date_finished, 'dd/mm/yyyy')book_date_finished, book_price, book_status, book_slip, product_id, cust_id from PROJECT.BOOKING order by book_id");
                                        %>              
					<!-- Table -->
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
                                                            <th>ID Pelanggan</th>
                                                            <th>Staf yang bertanggungjawab</th>
                                                            <th width="110" class="ac">Content Control</th>
							</tr>
                                                        <% 
                                                        while (rst.next()) { 
                                                        
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
                                                                <td><center><%= name %></center></td>  
                                                                <td><form action="bookcontrol?action=delete" method="post">
                                                                    <input type="hidden" name="bkid" value="<%= rst.getString(1) %>"/>    
                                                                    <input type="submit" value="Buang" onclick="return Delete()"/></form> 
                                                                    
                                                                    <form action="updatebooking.jsp" method="post">
                                                                    <input type="hidden" name="id" value="<%= rst.getString("BOOK_ID") %>"/>    
                                                                    <input type="submit" value="Kemaskini" onclick=""/></form> 
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