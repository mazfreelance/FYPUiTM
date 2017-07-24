<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="core/title.jsp" %>
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
    <td width="620" height="100" valign="top"><div class="blok"><span class="title">Welcome</span><br>
<img src="images/line.jpg" class="lin" width="600" height="7"><br>
<img src="images/6.PNG" width="170" high="170" class="pictures">
<strong class="orang">Welding workshop management system</strong><br>
<p align="justify">Welding is a modern shipbuilding industry for a key technology which is working time and cost of ship 
body building, and the important is the welding quality in shipbuilding quality.
The selected welding workshop for the project is IJaC workshop, located at Sungai Tua, Selayang, 
Gombak, Selangor Darul Ehsan. This location is strategic because it is near to another workshop 
and the houses of people who lived there.</p>
</div><br>

<table width="620" height="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="310" height="100" valign="top"><div class="blok"><br/><br/>
<span class="title1">Services</span><br>
<img src="images/line.jpg" class="lin" width="290" height="7"><br>	
<img src="images/str.jpg" align="absmiddle" class="str"><a>Custom fabrication and modifications of truck decks and trailers</a><br>
<img src="images/str.jpg" align="absmiddle" class="str"><a>Recreational Vehicle modifications and custom hitch installations</a><br>
<img src="images/str.jpg" align="absmiddle" class="str"><a>Rack fabrication</a><br>
<img src="images/str.jpg" align="absmiddle" class="str"><a>All large or small misc. manufacturing projects</a><br>
<img src="images/str.jpg" align="absmiddle" class="str"><a>Aluminium fabrication</a><br>
</div></td>
  </tr>
</table>
</td>
    <td width="30" height="100" valign="top"></td>
    <td width="350" height="100" valign="top">
<div class="blok"><span class="title">Sign Up</span><br>
        <img src="images/line.jpg" class="lin" width="310" height="7"><br>

        <form action="LoginController" method="post" id="login-f">

        Username: <input name="username" id="uname" type="text" value="" style="height:30px; width:220px;" align="top"><br><br>
        Password:&nbsp; <input name="pass" id="pwd" type="password" value="" style="height:30px; width:220px;" align="top"><br><br>

        <br><br>
        <input type="submit" value="Login" style="height:30px; width:70px; border-color:#FFA500;">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   
        <sub><big><a href="register.jsp" align="top" border="0">Doesn't have an account?</a></big></sub><br>

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
<%@include file="core/footer.jsp" %>
	</td>
  </tr>
</table>
</body>
</html>