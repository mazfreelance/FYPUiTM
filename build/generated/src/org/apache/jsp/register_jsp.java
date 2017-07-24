package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/core/title.jsp");
    _jspx_dependants.add("/core/menu.jsp");
    _jspx_dependants.add("/core/header.jsp");
    _jspx_dependants.add("/core/footer.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>IJaC</title>");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">\n");
      out.write("<LINK HREF=\"style.css\"  REL=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styletable.css\" />\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/jquery-1.12.1.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/jquery.validate.js\"></script>\n");
      out.write("<script>\n");
      out.write("      function Validate() {\n");
      out.write("            var password = document.getElementById(\"pass\").value;\n");
      out.write("            var confirmPassword = document.getElementById(\"repass\").value;\n");
      out.write("            if (password != confirmPassword) {\n");
      out.write("                alert(\"Passwords do not match.\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("</script>    \n");
      out.write(" \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"100%\" height=\"100%\" valign=\"top\">\n");
      out.write("<table width=\"1000\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"1000\" height=\"45\" valign=\"top\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"1000\" height=\"130\" valign=\"top\">\n");
      out.write("<table width=\"1000\" height=\"130\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"325\" height=\"130\" valign=\"top\"><img src=\"images/logo1.jpg\"></td>\n");
      out.write("    <td width=\"675\" height=\"130\" valign=\"top\" class=\"menu1\">\n");
      out.write("<a href=\"home.jsp\" class=\"menu\">Home</a>\n");
      out.write("<a href=\"index-1.html\" class=\"menu\">About Us</a>\n");
      out.write("<a href=\"index-2.html\" class=\"menu\">Services</a>\n");
      out.write("<a href=\"index-4.html\" class=\"menu\">Contacts</a>\n");
      out.write("<a href=\"index-4.html\" class=\"menu\">Galleries</a>\n");
      out.write("\t</td>\n");
      out.write("  </tr>\n");
      out.write("</table>");
      out.write("\n");
      out.write("\t</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"1000\" height=\"370\" valign=\"top\">\n");
      out.write("<table width=\"1000\" height=\"120\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"445\" height=\"120\" valign=\"top\"><img src=\"images/name1.jpg\" style=\"padding-top:50px;\"></td>\n");
      out.write("    <td width=\"\" height=\"120\" valign=\"top\"><img src=\"images/header1.jpg\" align=\"right\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\t\t\n");
      out.write("\t</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"1000\" height=\"100\" valign=\"top\">\n");
      out.write("<table width=\"1000\" height=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"620\" height=\"100\" valign=\"top\"><div class=\"blok\"><span class=\"title\">Register</span><br>\n");
      out.write("<img src=\"images/line.jpg\" class=\"lin\" width=\"800\" height=\"7\"><br>\n");
      out.write("\n");
      out.write("<form action=\"unconfirm.jsp\" method=\"post\" name=\"registerform\" id=\"registerform\">\n");
      out.write("* Required field <br><br>\n");
      out.write("<table class=\"htmlForm\">\n");
      out.write("    <tr>\n");
      out.write("        <td>Username *</td>\n");
      out.write("        <td>:</td>\n");
      out.write("        <td><input type=\"text\" name=\"uname\"></td>\n");
      out.write("    </tr>   \n");
      out.write("    <tr>\n");
      out.write("        <td>Password *</td>\n");
      out.write("        <td>:</td>\n");
      out.write("        <td><input type=\"password\" name=\"passw\" id=\"pass\"></td>\n");
      out.write("    </tr> \n");
      out.write("    <tr>\n");
      out.write("        <td>Re-enter Password *</td>\n");
      out.write("        <td>:</td>\n");
      out.write("        <td><input type=\"password\" name=\"repass\" id=\"repass\"></td>\n");
      out.write("    </tr> \n");
      out.write("    <tr><td colspan=\"2\"><br>Personal Information<br><br></td></tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Name*</td>\n");
      out.write("        <td>:</td>\n");
      out.write("        <td><input type=\"text\" name=\"name1\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Identity card number*</td>\n");
      out.write("        <td>:</td>\n");
      out.write("        <td><input type=\"number\" name=\"icn\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Current Address*</td>\n");
      out.write("        <td>:</td>\n");
      out.write("        <td><textarea rows=\"3\" cols=\"18\" name=\"addr\" form=\"registerform\"></textarea></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>City*</td>\n");
      out.write("        <td>:</td>\n");
      out.write("        <td><input type=\"text\" name=\"city\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Poscode*</td>\n");
      out.write("        <td>:</td>\n");
      out.write("        <td><input type=\"number\" name=\"code\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>State*</td>\n");
      out.write("        <td>:</td>\n");
      out.write("        <td><input type=\"text\" name=\"state\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Phone Number*</td>\n");
      out.write("        <td>:</td>\n");
      out.write("        <td><input type=\"number\" name=\"phone\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Email</td>\n");
      out.write("        <td>:</td>\n");
      out.write("        <td><input type=\"email\" name=\"email\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr bgcolor=\"#FFCC66\">\n");
      out.write("            <td>&nbsp;</td>\n");
      out.write("            <td colspan=\"2\">\n");
      out.write("                <input type=\"submit\" value=\"Next\" onclick=\"return Validate()\" />\n");
      out.write("                <input type=\"reset\" value=\"Reset\" />              \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("</table> \n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</div><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("\t</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"1000\" height=\"20\" valign=\"top\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"1000\" height=\"\" valign=\"top\"></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write(" </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"100%\" height=\"20\" valign=\"top\" class=\"tab_bottom\">\n");
      out.write("<table width=\"1000\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"1000\" height=\"20\" valign=\"top\"><div class=\"copyright\">Copyright &copy; <a href=\"localhost:8088/FYP/\" class=\"read\">Inmal Jaya Construction</a> 2016. All rights reserved.</div></td>\n");
      out.write("  </tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("\t</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
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
