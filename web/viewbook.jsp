
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%if (session.getAttribute("currentSessionUser") != null){ %>
<%@ page import="java.sql.*" %>
<%@ page import="bean.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="coreCust/title.jsp" %>
<meta http-equiv="Content-Style-Type" content="text/css">
<LINK HREF="style.css"  REL="stylesheet">

</head>

<body>
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="100%" height="100%" valign="top">
<table width="1000" height="100%" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td width="1000" height="45" valign="top"></td>
  </tr>
  <tr>
    <td width="1000" height="130" valign="top">
<%@include file="coreCust/menu.jsp" %>
	</td>
  </tr>
  <tr>
    <td width="1000" height="370" valign="top">
<%@include file="coreCust/header.jsp" %>		
	</td>
  </tr>
  <tr>
    <td width="1000" height="100" valign="top">
<table width="1000" height="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
      <%  Customer currentUser = (Customer)(session.getAttribute("currentSessionUser")); %>
    <td width="620" height="100" valign="top"><div class="blok"><span class="title">Welcome, <%= currentUser.getCust_username() %></span><br>
<img src="images/line.jpg" class="lin" width="600" height="7"><br>
 <%
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection conn= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
Statement st = conn.createStatement();
ResultSet rst = st.executeQuery("select book_id, to_char(book_date, 'dd/mm/yyyy')book_date, to_char(book_date_finished, 'dd/mm/yyyy')book_date_finished, book_price, book_status, book_slip, product_id from PROJECT.BOOKING where cust_id='" +currentUser.getCust_id() +"'");
%>   

<br/><br/>
    <table border="2" width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr align="center">
            <th>ID</th>
            <th>Tarikh Tempah</th>
            <th>Tarikh Siap</th>
            <th>Harga(RM)</th>
            <th>Status</th>
            <th>Slip Bayaran</th>
            <th>Produk</th>
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
                <td><center>
                    <form action="updatebook.jsp" method="post">
                    <input type="hidden" name="id" value="<%= rst.getString("BOOK_ID") %>"/>    
                    <input type="submit" value="Kemaskini" onclick=""/></form> 
                    </center>
                </td>
        </tr>
<% 
}        
%>                                                          
    </table>
    
</div><br>


</td>
    <td width="30" height="100" valign="top"></td>
    <td width="350" height="100" valign="top">
<div class="blok"><span class="title">Profile</span><br>
<img src="images/line.jpg" class="lin" width="310" height="7"><br>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from CUSTOMER where CUST_USERNAME='" +currentUser.getCust_username() +"'" );
while (rs.next()) {
%>    
<table>
  <tr>
      <td>Name:</td>
      <td><%= rs.getString(2) %></td>
  </tr>
  <tr>
      <td>Identity Card Number:</td>
      <td><br/><br/><%= rs.getString(1) %> </td>
  </tr>
  <tr>
      <td>Address:</td>
      <td><%= rs.getString(3) %>, <%= rs.getString(5) %> <%= rs.getString(4) %>,  <%= rs.getString(6) %></td>
  </tr>
  <tr>
      <td>Phone Number: </td>
      <td><br/><%= rs.getString(10) %> </td>
  </tr>
  <tr>
      <td>Email:</td>
      <td><%= rs.getString(7) %> </td>
  </tr>
</table>
<form action="updatecust.jsp" method="post" id="" name="profile">
<input name="ic" id="ic" type="hidden" value="<%= rs.getString(1) %>" style="height:30px; width:220px;" align="top"><br><br>
<% } %>
<!-- call value-->
<input type="submit" value="Update" style="height:30px; width:70px; border-color:#FFA500;">
<input type="button" value="Logout" style="height:30px; width:70px; border-color:#FFA500;" onclick="window.location='home.jsp';">
</form>
</div><br><br>

<div class="blok"><span class="title">Newletter</span><br>
<img src="images/line.jpg" class="lin" width="310" height="7"><br>	
<b>No News Available Today.</b>
</div>
</td>
  </tr>
</table>
	</td>
  </tr>
  <tr>
    <td width="1000" height="20" valign="top"></td>
  </tr>
  <tr>
    <td width="1000" height="" valign="top"></td>
  </tr>
</table>
 </td>
  </tr>
  <tr>
    <td width="100%" height="20" valign="top" class="tab_bottom">
<%@include file="coreCust/footer.jsp" %>
	</td>
  </tr>
</table>
</body>
</html>
<% }
else{
	response.sendRedirect("index.jsp");
}

%>