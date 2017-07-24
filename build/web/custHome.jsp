<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="bean.*" %>
<%if (session.getAttribute("currentSessionUser") != null){ %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <td width="620" height="100" valign="top"><div class="blok"><span class="title">Welcome, <%= currentUser.getCust_name() %></span><br>
<img src="images/line.jpg" class="lin" width="600" height="7"><br>
<img src="images/6.PNG" width="170" high="170" class="pictures">
<strong class="orang">Welding workshop management system</strong><br>
<p align="justify">Welding is a modern shipbuilding industry for a key technology which is working time and cost of ship 
body building, and the important is the welding quality in shipbuilding quality.
The selected welding workshop for the project is IJaC workshop, located at Sungai Tua, Selayang, 
Gombak, Selangor Darul Ehsan. This location is strategic because it is near to another workshop 
and the houses of people who lived there.</p>
</div><br>
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