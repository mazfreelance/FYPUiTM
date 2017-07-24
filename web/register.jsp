<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="core/title.jsp" %>
<meta http-equiv="Content-Style-Type" content="text/css">
<LINK HREF="style.css"  REL="stylesheet">
<link rel="stylesheet" type="text/css" href="formtemp/css/default.css"/>
<!-- validation-->
<link rel="stylesheet" type="text/css" href="validate/css/style.css" />

<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="jquery/jquery-1.12.1.js"></script>
<script type="text/javascript" src="jquery/jquery.validate.js"></script>

<!-- <script type="text/javascript">
       
            var jQuery_1_8_2 = $.noConflict(true);
        </script> -->
<script>
      function Validate() {
            var password = document.getElementById("pass").value;
            var confirmPassword = document.getElementById("repass").value;
            if (password != confirmPassword) {
                alert("Passwords do not match.");
                return false;
            }
            else{
            return true;
            alert('Sucess');
            }
           
        }
</script>    

<!-- validation-->


<script type="text/javascript" src="validate/jquery/jquery.validate.js"></script>
<script>
       $(document).ready(function(){
           $('#registerform').validate({
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
    <td aign="center" width="620" height="100" valign="top"><div class="blok">

<form  class="register" action="CustomerController1?action=add" method="post" name="registerform" id="registerform">
<h1>Registration</h1>
<fieldset class="row1">
    <legend>Account Details
    </legend>
    <p>
        <label>Username *
        </label>
        <input type="text" name="username" id="username" required/>
    </p>
    <p>
        <label>Password*
        </label>
        <input type="password" name="pass" id="pass"/>

    </p>
    <p>
        <label>Repeat Password*
        </label>
        <input type="password" name="repass" id="repass"/>
        <label class="obinfo">
        </label>
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
        <input type="text" class="long" name="name" id="name"/>
    </p>
    <p>
        <label>Identity card number *
        </label>
        <input type="text" class="long" name="ic" id="ic"/>
    </p>
    <p>
        <label>Email *
        </label>
      <input type="text" class="long" name="email" id="email"/>
    </p>
    <p>
        <label>Phone *
        </label>
      <input type="text" class="long" maxlength="11" name="phone" id="phone"/>
    </p>
    <p>
        <label >Current Address
        </label>
        <input type="text" class="long" name="address" id="address"/>
            </p>
    <p>
        <label >Poscode *
        </label>
        <input type="text" class="long" name="code" id="code"/>
            </p>
    <p>
        <label >City *
        </label>
        <input type="text" class="long" name="city" id="city"/>
            </p>
    <p>
        <label>State *
        </label>
        <select name="state" id="state">
            <option>
            </option>
            <option value=".." selected="selected">Choose State</option>
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
<fieldset class="row4">
    <legend>Terms
  </legend>
    <p class="agreement">
        <input type="checkbox" name="check" id="check" value="" />
        <label>*  I accept the <a href="#">Terms and Conditions</a></label>
    </p>
</fieldset>
<fieldset class="row5">
<div>
  <button type="reset" class="button">Reset </button></div>
  <div> 
      <button class="button" id="btnconfirm" onclick="return Validate();">Confirm &raquo;</button></div>
</fieldset>
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