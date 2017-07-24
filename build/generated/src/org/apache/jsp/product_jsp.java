package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import dbcon.ConnectionManager;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \n");
      out.write("    \n");
      out.write(" \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<title>Staff Panel</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"coreStaff/css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/styletable.css\" />\n");
      out.write("            \n");
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

    String url = request.getRequestURI();
    String pg = "";
    if(url.endsWith("staffHome.jsp")) {
        pg="staffHome";
    }
    else if (url.endsWith("product.jsp")) {
        pg="product";
    }

      out.write("               \n");
      out.write("\n");
      out.write("<div id=\"navigation\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("                            <li><a href='staffHome.jsp' ");
      out.print(pg.equals("staffHome") ? "class='active'" : "");
      out.write(" ><span>Customer</span></a></li>\n");
      out.write("\t\t\t    <li><a href=\"product.jsp\"  ");
      out.print(pg.equals("product") ? "class='active'" : "");
      out.write("><span>Product</span></a></li>\n");
      out.write("                            <li><a href=\"booking.jsp\"><span>Booking</span></a></li>\n");
      out.write("\t\t\t    <li><a href=\"report.jsp\"><span>Report</span></a></li>\n");
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
      out.write("\t\t\t<a href=\"product.jsp\">Manage Product</a>\n");
      out.write("\t\t\t<span>&gt;</span>\n");
      out.write("\t\t\tView Product\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- End Small Nav -->\n");
      out.write("\t\t<br />\n");
      out.write("\t\t<!-- Main -->\n");
      out.write("\t\t<div id=\"main\">\n");
      out.write("\t\t\t<div class=\"cl\">&nbsp;</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- Content -->\n");
      out.write("\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t\t<div class=\"box-content\">\n");
      out.write("                                                <script type=\"text/javascript\">\n");
      out.write("                                                    function showMe (it, box) {\n");
      out.write("                                                        var vis = document.getElementById(\"show\") ? \"block\" : \"none\";\n");
      out.write("                                                        document.getElementById(it).style.display = vis;\n");
      out.write("                                                        }\n");
      out.write("                                                </script>\n");
      out.write("\n");
      out.write("                                                <input type=\"button\" id=\"show\" class=\"add-button\" name=\"multi_note\" value=\"Add  \" onclick=\"showMe('div1', this)\"/>\n");
      out.write("                                                \n");
      out.write("                                                <br/><br/>\n");
      out.write("\n");
      out.write("                                                <div id=\"div1\" style=\"display:none\">\n");
      out.write("                                                 <div class=\"box1\">   \n");
      out.write("                                                    <form action=\"ProductController?action=add\" enctype=\"multipart/form-data\" method=\"post\" name=\"addpro\" id=\"addpro\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<!-- Form -->\n");
      out.write("                                                    <div class=\"form\">\n");
      out.write("\t\t\t\t\t\t        * Required field <br/><br/>\n");
      out.write("                                                        <table class=\"htmlForm\">\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>Product ID *</td>\n");
      out.write("                                                            <td>:</td>\n");
      out.write("                                                            <td><input type=\"text\" name=\"proid\" value=\"PRO\"/><font color=\"black\">eg:PROXX</font></td>\n");
      out.write("                                                        </tr>   \n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>Product Name *</td>\n");
      out.write("                                                            <td>:</td>\n");
      out.write("                                                            <td><input type=\"text\" name=\"proname\" id=\"pass\"/></td>\n");
      out.write("                                                        </tr> \n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>Product Type *</td>\n");
      out.write("                                                            <td>:</td>\n");
      out.write("                                                            <td><input type=\"text\" name=\"protype\" id=\"repass\"/></td>\n");
      out.write("                                                        </tr> \n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>Product Description</td>\n");
      out.write("                                                            <td>:</td>\n");
      out.write("                                                            <td><textarea rows=\"3\" cols=\"16\" name=\"prodesc\" form=\"addpro\"></textarea></td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>Product Price(RM)*</td>\n");
      out.write("                                                            <td>:</td>\n");
      out.write("                                                            <td><input type=\"text\" name=\"proprice\"/></td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>Product Picture</td>\n");
      out.write("                                                            <td>:</td>\n");
      out.write("                                                            <td><input type=\"file\" name=\"prophoto\"/></td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <tr bgcolor=\"#FFCC66\">\n");
      out.write("                                                                <td>&nbsp;</td>\n");
      out.write("                                                                <td colspan=\"2\">\n");
      out.write("                                                                    <input type=\"submit\" value=\"Submit\" onclick=\"return Validate()\" />\n");
      out.write("                                                                    <input type=\"reset\" value=\"Reset\" />              \n");
      out.write("                                                                </td>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                        </table> \n");
      out.write("                                                    </form>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                        </div>\n");
      out.write("                                 </div>\n");
      out.write("\t\t\t\t<!-- End Box -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<!-- Box -->\n");
      out.write("\t\t\t\t<div class=\"box\">\n");
      out.write("\t\t\t\t\t<!-- Box Head -->\n");
      out.write("\t\t\t\t\t<div class=\"box-head\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"left\">Product List</h2>\n");
      out.write("\t\t\t\t\t\t<div class=\"right\">\n");
      out.write("                                                        <form method=\"post\" action=\"searchpro.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<label>search product</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"proid\" class=\"field small-field\" />\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"button\" value=\"search\" />\n");
      out.write("                                                        </form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- End Box Head -->\t\n");
      out.write("                                         ");

                                        Class.forName("oracle.jdbc.driver.OracleDriver");
                                        
                                        Connection con= ConnectionManager.getConnection();
                                        Statement stmt = con.createStatement();
                                        ResultSet rs = stmt.executeQuery("select * from PRODUCT");
                                        
      out.write("            \n");
      out.write("\t\t\t\t\t<!-- Table -->\n");
      out.write("\t\t\t\t\t<div class=\"table\">\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"13\"><input type=\"checkbox\" class=\"checkbox\" /></th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>ID</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>Type</th>\n");
      out.write("                                                                <th>Description</th>\n");
      out.write("                                                                <th>Price(RM)</th>\n");
      out.write("                                                                <th>Picture</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"110\" class=\"ac\">Content Control</th>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("                                                        ");
 
                                                        while (rs.next()) { 
                                                        
                                                        
      out.write("                                         \n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"checkbox\" class=\"checkbox\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(1) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("                                                                <td>");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(5) );
      out.write("</td>   \n");
      out.write("                                                                <td><img width=\"50\" height=\"50\" src=\"displayimg?id=");
      out.print(rs.getString(1));
      out.write("\"></img></td>\n");
      out.write("                                                                \n");
      out.write("                                                                <td><form action=\"ProductController?action=delete\" method=\"post\">\n");
      out.write("                                                                    <input type=\"hidden\" name=\"proid\" value=\"");
      out.print( rs.getString(1) );
      out.write("\"/>    \n");
      out.write("                                                                    <input type=\"submit\" value=\"Delete\" onclick=\"return Delete()\"/></form> \n");
      out.write("                                                                    \n");
      out.write("                                                                    <form action=\"updatepro.jsp\" method=\"post\">\n");
      out.write("                                                                    <input type=\"hidden\" name=\"ic\" value=\"");
      out.print( rs.getString(1) );
      out.write("\"/>    \n");
      out.write("                                                                    <input type=\"submit\" value=\"Edit\"/></form> \n");
      out.write("                                                                </td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("                                                ");
 
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
      out.write("                                           \n");
      out.write("\t\t\t\t<!-- End Box -->\n");
      out.write("\t\t\t\n");
      out.write("                                \n");
      out.write("                            \n");
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
      out.write("</html>");
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
