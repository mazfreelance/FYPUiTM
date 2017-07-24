<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="core/title.jsp" %>
<meta http-equiv="Content-Style-Type" content="text/css">
<LINK HREF="style.css"  REL="stylesheet">
<link rel="stylesheet" type="text/css" href="css/styletable.css" />

<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="jquery/jquery-1.12.1.js"></script>
<script type="text/javascript" src="jquery/jquery.validate.js"></script>
<script>
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
<%@include file="core/menu.jsp" %>
	</td>
  </tr>
  <tr>
    <td width="1000" height="370" valign="top">
<%@include file="core/header.jsp" %>		
	</td>
  </tr>
  <tr>
    <td width="1000" height="100" valign="top">
<table width="1000" height="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="620" height="100" valign="top"><div class="blok"><span class="title">Unconfirmation Register</span><br>
<img src="images/line.jpg" class="lin" width="800" height="7"><br>

<form action="CustomerController1?action=add" method="post" name="registerform1" id="registerform">
* Required field <br><br>
<table class="htmlForm">
    <tr>
        <td>Username *</td>
        <td>:</td>
        <td><input type="text" name="username" value="<%=request.getParameter("uname") %>" ></td>
    </tr>   
    <tr>
        <td>Password *</td>
        <td>:</td>
        <td><input type="text" name="pass" id="pass" value="<%=request.getParameter("passw") %>" ></td>
    </tr> 
    <tr><td colspan="2"><br>Personal Information<br><br></td></tr>
    <tr>
        <td>Name*</td>
        <td>:</td>
        <td><input type="text" name="name" value="<%=request.getParameter("name1") %>"></td>
    </tr>
    <tr>
        <td>Identity card number*</td>
        <td>:</td>
        <td><input type="number" name="ic" value="<%=request.getParameter("icn") %>"></td>
    </tr>
    <tr>
        <td>Current Address*</td>
        <td>:</td>
        <td><textarea rows="3" cols="18" name="address" form="registerform1" ><%=request.getParameter("addr") %></textarea></td>
    </tr>
    <tr>
        <td>City*</td>
        <td>:</td>
        <td><input type="text" name="city" value="<%=request.getParameter("city") %>"></td>
    </tr>
    <tr>
        <td>Poscode*</td>
        <td>:</td>
        <td><input type="number" name="code" value="<%=request.getParameter("code") %>"></td>
    </tr>
    <tr>
        <td>State*</td>
        <td>:</td>
        <td><input type="text" name="state" value="<%=request.getParameter("state") %>"></td>
    </tr>
    <tr>
        <td>Phone Number*</td>
        <td>:</td>
        <td><input type="number" name="phone" value="<%=request.getParameter("phone") %>" ></td>
    </tr>
    <tr>
        <td>Email</td>
        <td>:</td>
        <td><input type="email" name="email" value="<%=request.getParameter("email") %>" ></td>
    </tr>
    <tr bgcolor="#FFCC66">
            <td>&nbsp;</td>
            <td colspan="2">
                <input type="button" onclick="window.location='register.jsp';" value="Back"> 
                <input type="submit" value="Submit"  />
            </td>
        </tr>
</table> 
</form>

</div><br>


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
<%@include file="core/footer.jsp" %>
	</td>
  </tr>
</table>
</body>
</html>