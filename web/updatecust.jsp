<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="bean.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="coreCust/title.jsp" %>
<meta http-equiv="Content-Style-Type" content="text/css">
<LINK HREF="style.css"  REL="stylesheet">
<link rel="stylesheet" type="text/css" href="formtemp/css/default.css"/>

<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="jquery/jquery-1.12.1.js"></script>
<script type="text/javascript" src="jquery/jquery.validate.js"></script>
<script>
      function Validate() {
            var password = document.getElementById("pass").value;
            var confirmPassword = document.getElementById("repass").value;
            if (password != confirmPassword) {
                alert("Passwords do not match.");
                return false;
            }
            return true;
        }
    function update() {
    alert("Updated Succcessfully");
    }
</script>    
<!-- validation-->
<link rel="stylesheet" type="text/css" href="validate/css/style.css" />
<script type="text/javascript" src="validate/jquery/jquery.validate.js"></script>
<script>
       $(document).ready(function(){
           $('#updateform').validate({
              rules:{
                  username: {
                        required: true,
                        number: false
                  },
                  pass: {
                        required: true,
                        minlength: 8
                  },
                  repass: {
                        required: true,
                        minlength: 8
                   },
                  name:{
                      required:true,
                      number:false
                  },
                  ic:{
                      required: true,
                      number: true,
                      minlength: 12,
                      maxlength: 12
                  },
                  email:{
                      required:true,
                      email:true
                  },
                  phone:{
                      required:true,
                      number:true
                  },
                  address:{
                      required:true
                  },
                  code:{
                      required:true,
                      number:true,
                      minlength: 5,
                      maxlength: 5
                  },
                  city:{
                      required:true,
                      number:false
                  },
                  state:{
                      required:true
                  }
              } 
               
           });
       }); 
        
    </script>
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
    <td width="620" height="100" valign="top"><div class="blok">
<%
Class.forName("oracle.jdbc.driver.OracleDriver");

long icnum = Long.parseLong(request.getParameter("ic"));

Connection con= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from CUSTOMER where CUST_ID='" +icnum+"'");
%>
<form class="register" action="CustomerController1?action=update" method="post" name="updateform" id="updateform">
<%
while (rs.next()) {
%> 
    <h1>Update Personal Info.</h1>
    <fieldset class="row1">
    <legend>Account Details
    </legend>
    <p>
        <label>Username *
        </label>
        <input type="text" name="uname" id="username" value="<%= rs.getString(8) %>"/>
    </p>
    <p>
        <label>Password*
        </label>
        <input type="password" name="passw" id="pass" value="<%= rs.getString(9) %>"/>

    </p>
    <p>
        <label>Repeat Password*
        </label>
        <input type="password" name="repass" id="repass" value="<%= rs.getString(9) %>"/>
    </p>
    <p>
    &nbsp;&nbsp;&nbsp;&nbsp; * obligatory fields
    </p>
</fieldset>
<fieldset class="row2">
    <legend>Personal Details
    </legend>
    <p>
        <label>Name *
        </label>
        <%= rs.getString(2) %>
        <input type="hidden" class="long" name="name" id="name" value="<%= rs.getString(2) %>"/>
    </p>
    <p>
        <label>Identity card number *
        </label>
        <%= rs.getString(1) %>
        <input type="hidden" class="long" name="icn" id="ic" value="<%= rs.getString(1) %>" />
    </p>
    <p>
        <label>Email *
        </label>
      <input type="text" class="long" name="email" id="email" value="<%= rs.getString(7) %>"/>
    </p>
    <p>
        <label>Phone *
        </label>
      <input type="text" class="long" maxlength="11" name="phone" id="phone" value="<%= rs.getString(10) %>"/>
    </p>
    <p>
        <label >Current Address
        </label>
        <input type="text" class="long" name="addr" id="address" value="<%= rs.getString(3) %>"/>
            </p>
    <p>
        <label >Poscode *
        </label>
        <input type="text" class="long" name="code" id="code" value="<%= rs.getString(5) %>"/>
            </p>
    <p>
        <label >City *
        </label>
        <input type="text" class="long" name="city" id="city" value="<%= rs.getString(4) %>"/>
            </p>
    <p>
        <label>State *
        </label>
        <select name="state" id="state">
            <option>
            </option>
            <option value="<%= rs.getString(6) %>" selected="selected"><%= rs.getString(6) %></option>
            <option value="Johor" >Johor</option>
            <option value="Kedah" >Kedah</option>
            <option value="Kelantan" >Kelantan</option>
            <option value="Melaka" >Melaka</option>
            <option value="Pahang" >Pahang</option>
            <option value="Perak" >Perak</option>
            <option value="Perlis" >Perlis</option>
            <option value="Pulau Pinang" >Pulau Pinang</option>
            <option value="Selangor" >Selangor</option>
            <option value="Terengganu" >Terengganu</option>
            <option value="Wilayah Persekutuan Kuala Lumpur" >Wilayah Persekutuan Kuala Lumpur</option>
        </select>
    </p>

</fieldset>

<fieldset class="row5">
<div>
  <button type="reset" class="button">Reset </button></div>
  <div> 
      <button class="button" onclick="return Validate();">Confirm &raquo;</button></div>
</fieldset>
<% } %>
</form>

</div><br>

<td width="30" height="100" valign="top"></td>
    <td width="350" height="100" valign="top">
        <br/><br/>
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