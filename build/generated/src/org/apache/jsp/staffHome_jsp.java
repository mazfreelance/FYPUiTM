package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class staffHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/coreStaff/topnav.jsp");
    _jspx_dependants.add("/coreStaff/menu.jsp");
    _jspx_dependants.add("/coreStaff/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("   ");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<title>Staff Panel</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"coreStaff/css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/styletable.css\" />\n");
      out.write("        <script>\n");
      out.write("            function Validate() {\n");
      out.write("            var password = document.getElementById(\"pass\").value;\n");
      out.write("            var confirmPassword = document.getElementById(\"repass\").value;\n");
      out.write("            if (password != confirmPassword) {\n");
      out.write("                alert(\"Passwords do not match.\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else{\n");
      out.write("                alert(\"Registered Sucessfully\");\n");
      out.write("            }\n");
      out.write("            return true;\n");
      out.write("            }\n");
      out.write("            function Delete(){\n");
      out.write("                alert(\"Delete Successfully!\");\n");
      out.write("            }\n");
      out.write("</script>    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- Header -->\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<div class=\"shell\">\n");
      out.write("\t\t<!-- Logo + Top Nav -->\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"top\">\n");
      out.write("\t\t\t<h1><a href=\"staffHome.jsp\">Staff Panel</a></h1>\n");
      out.write("\t\t\t<div id=\"top-navigation\">\n");
      out.write("\t\t\t\tWelcome, <a href=\"staffHome.jsp\"><strong>sTAFF</strong></a>\n");
      out.write("\t\t\t\t<span>|</span>\n");
      out.write("\t\t\t\t<a href=\"updatestaff.jsp\">Profile Settings</a>\n");
      out.write("\t\t\t\t<span>|</span>\n");
      out.write("\t\t\t\t<a href=\"home.jsp\">Log out</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>");
      out.write("\n");
      out.write("\t\t<!-- End Logo + Top Nav -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Main Nav -->\n");
      out.write("                ");
      out.write("                <div id=\"navigation\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t    <li><a href=\"staffHome.jsp\" class=\"active\"><span>Customer</span></a></li>\n");
      out.write("\t\t\t    <li><a href=\"product.jsp\"><span>Product</span></a></li>\n");
      out.write("                            <li><a href=\"\"><span>Booking</span></a></li>\n");
      out.write("\t\t\t    <li><a href=\"\"><span>Report</span></a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>");
      out.write("\n");
      out.write("\t\t<!-- End Main Nav -->\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- End Header -->\n");
      out.write("\n");
      out.write("<!-- Container -->\n");
      out.write("<div id=\"container\">\n");
      out.write("\t<div class=\"shell\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Small Nav -->\n");
      out.write("\t\t<div class=\"small-nav\">\n");
      out.write("\t\t\t<a href=\"staffHome.jsp\">Manage Customer</a>\n");
      out.write("\t\t\t<span>&gt;</span>\n");
      out.write("\t\t\tView Customer\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- End Small Nav -->\n");
      out.write("\t\t<br />\n");
      out.write("\t\t<!-- Main -->\n");
      out.write("\t\t<div id=\"main\">\n");
      out.write("\t\t\t<div class=\"cl\">&nbsp;</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- Content -->\n");
      out.write("\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Box -->\n");
      out.write("\t\t\t\t<div class=\"box\">\n");
      out.write("\t\t\t\t\t<!-- Box Head -->\n");
      out.write("\t\t\t\t\t<div class=\"box-head\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"left\">Customer List</h2>\n");
      out.write("\t\t\t\t\t\t<div class=\"right\">\n");
      out.write("                                                        <form method=\"post\" action=\"searchcust.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<label>search customer</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"ic\" class=\"field small-field\" />\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"button\" value=\"search\" />\n");
      out.write("                                                        </form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- End Box Head -->\t\n");
      out.write(" ");

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "project", "project");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from CUSTOMER");

      out.write("            \n");
      out.write("\t\t\t\t\t<!-- Table -->\n");
      out.write("\t\t\t\t\t<div class=\"table\">\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<th>Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>Identity Card Number</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>Address</th>\n");
      out.write("                                                                <th>Phone Number</th>\n");
      out.write("                                                                <th>E-mail</th>\n");
      out.write("                                                                <th>Username</th>\n");
      out.write("                                                                <th>Password</th>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("                                                        ");
 
                                                        while (rs.next()) {          
                                                         String address = rs.getString(3)+", "+rs.getString(6)+" "+rs.getString(5)+" "+rs.getString(4);   
                                                        
      out.write("                                         \n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(1) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print( address );
      out.write("</td>\n");
      out.write("                                                                <td>");
      out.print( rs.getString(10) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(7) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(8) );
      out.write("</td>\n");
      out.write("                                                                <td>");
      out.print( rs.getString(9) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
 
}        

      out.write("                                                          \n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<!-- Pagging -->\n");
      out.write("\t\t\t\t\t\t<div class=\"pagging\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"left\">Showing 1 of 1</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"right\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Previous</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">1</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Next</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">View all</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- End Pagging -->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- Table -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t<!-- End Box -->\n");
      out.write("\t\t\t\t\n");
      out.write("                                 </br></br>  \n");
      out.write("\t\t\t\t<!-- Box -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- End Box -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- End Content -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- Sidebar -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- End Sidebar -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"cl\">&nbsp;</div>\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- Main -->\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- End Container -->\n");
      out.write("<!-- Footer -->\n");
      out.write("<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("<br/><br/>\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t<div class=\"shell\">\n");
      out.write("\t\t<span class=\"left\">&copy;  Inmal Jaya Construction 2016. All rights reserved.</span>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("<!-- End Footer -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
 //}
//else{
//	response.sendRedirect("index.jsp");
//}


    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
