
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
String id = request.getParameter("id");
Connection conn= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
Statement st = conn.createStatement();
ResultSet rst = st.executeQuery("select * from booking where book_id = '"+id+"'");
%>   

<fieldset><legend>Kemaskini Tempahan</legend>
 
<form action="bookcontrol?action=edit" enctype="multipart/form-data" method="post" name="bookform" id="bookform" > 
<table border="0" width="100%" cellspacing="0" cellpadding="0" >
<% 
while (rst.next()) { 

%>     
    <tr>
        <td colspan="2"><b>Booking Item</b></td>
    </tr>
    <tr>
        <td>Customer ID</td>
        <td>:</td>
        <td><input type="hidden" name="custid" value="<%= currentUser.getCust_id() %>"/><%= currentUser.getCust_id() %></td>
    </tr>
    <tr>
        <td>Book ID</td>
        <td>:</td>
        <td><input type="hidden" name="proid" value="<%= rst.getString(1) %>"/><%= rst.getString(1) %></td>
    </tr>
    <tr>
        <td colspan="2"><b>Booking Information</b></td>
    </tr>
    <tr>
        <td>Payment slip</td>
        <td>:</td>
        <td><input type="file" name="slip" value=""/></td>
    </tr>
    <tr>
        <td><input type="submit" name="hantar" value="Hantar"/></td>
    </tr>
    
</table>
</form>        
<% 
}        
%>                                                          
</fieldset>   
    
</div><br>


</td>
    <td width="30" height="100" valign="top"></td>
    <td width="350" height="100" valign="top">
<div class="blok"><span class="title">PROFILE</span><br>
<img src="images/line.jpg" class="lin" width="310" height="7"><br>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from CUSTOMER where CUST_USERNAME='" +currentUser.getCust_username() +"'" );
while (rs.next()) {
%>    

Name: <%= rs.getString(2) %><br><br>
Identity Card Number:&nbsp; <%= rs.getString(1) %> <br><br>
Address: <%= rs.getString(3) %>, <%= rs.getString(5) %> <%= rs.getString(4) %>,  <%= rs.getString(6) %> <br><br>
Phone Number: <%= rs.getString(10) %> <br><br>
Email: <%= rs.getString(7) %> <br><br>

<form action="updatecust.jsp" method="post" id="" name="profile">
<input name="ic" id="ic" type="hidden" value="<%= rs.getString(1) %>" style="height:30px; width:220px;" align="top"><br><br>
<% } %>
<!-- call value-->


<input type="submit" value="Update" style="height:30px; width:70px; border-color:#FFA500;">
<input type="button" value="Logout" style="height:30px; width:70px; border-color:#FFA500;" onclick="window.location='home.jsp';">
</form>
</div><br><br>

<div class="blok"><span class="title">NEWSLETTER</span><br>
<img src="images/line.jpg" class="lin" width="310" height="7"><br>	
Consectete adipiscig elit<br>
<input name="text" type="text" value="" style="height:30px; width:220px;" align="top"><a href="#"><img src="images/ok.jpg" align="top" border="0"></a><br><br>
<a href="#" class="read">Unsubscribe</a>
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