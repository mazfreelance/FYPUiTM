package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("    <td width=\"620\" height=\"100\" valign=\"top\"><div class=\"blok\"><span class=\"title\">WELCOME</span><br>\n");
      out.write("<img src=\"images/line.jpg\" class=\"lin\" width=\"600\" height=\"7\"><br>\n");
      out.write("<img src=\"images/im01.jpg\" class=\"pictures\">\n");
      out.write("<strong class=\"orang\">Lorem ipsum dolor sit amet suspendisse enim arcu, convallisnon, curs sed, dignissim et, est.</strong><br><br>\n");
      out.write("Lorem ipsum dolor sit amet Consectet adipiscing elit. Nunc suscipit. Suspendisse enim arcu, convallisnon, curs sed, dignissim et, est.  Aenean semper aliqu libero. In te velit, cursus ut, ultrices vitae, temporut, risu. Duislv Vesti buluvel pede at sapien sodales mattis.<br><br>\n");
      out.write("<a href=\"#\" class=\"read\">read more</a>\n");
      out.write("</div><br>\n");
      out.write("\n");
      out.write("<table width=\"620\" height=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"310\" height=\"100\" valign=\"top\"><div class=\"blok\"><span class=\"title1\">Services</span><br>\n");
      out.write("<img src=\"images/line.jpg\" class=\"lin\" width=\"290\" height=\"7\"><br>\t\n");
      out.write("<img src=\"images/str.jpg\" align=\"absmiddle\" class=\"str\"><a href=\"#\" class=\"links\">Consectetuer adipiscing</a><br>\n");
      out.write("<img src=\"images/str.jpg\" align=\"absmiddle\" class=\"str\"><a href=\"#\" class=\"links\">Nunc suscipit et est</a><br>\n");
      out.write("<img src=\"images/str.jpg\" align=\"absmiddle\" class=\"str\"><a href=\"#\" class=\"links\">Suspendisse enim arcu</a><br>\n");
      out.write("<img src=\"images/str.jpg\" align=\"absmiddle\" class=\"str\"><a href=\"#\" class=\"links\">Cursus sed dignissim est</a><br>\n");
      out.write("<img src=\"images/str.jpg\" align=\"absmiddle\" class=\"str\"><a href=\"#\" class=\"links\">Aenean semper aliquet liber</a><br>\n");
      out.write("<img src=\"images/str.jpg\" align=\"absmiddle\" class=\"str\"><a href=\"#\" class=\"links\">Nunc suscipit et est</a><br>\n");
      out.write("<img src=\"images/str.jpg\" align=\"absmiddle\" class=\"str\"><a href=\"#\" class=\"links\">Cursus sed dignissim est</a>\n");
      out.write("</div></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</td>\n");
      out.write("    <td width=\"30\" height=\"100\" valign=\"top\"></td>\n");
      out.write("    <td width=\"350\" height=\"100\" valign=\"top\">\n");
      out.write("<div class=\"blok\"><span class=\"title\">SIGN UP</span><br>\n");
      out.write("<img src=\"images/line.jpg\" class=\"lin\" width=\"310\" height=\"7\"><br>\n");
      out.write("\n");
      out.write("<form action=\"LoginController\" method=\"post\" id=\"login-f\">\n");
      out.write("    \n");
      out.write("Username: <input name=\"username\" id=\"uname\" type=\"text\" value=\"\" style=\"height:30px; width:220px;\" align=\"top\"><br><br>\n");
      out.write("Password:&nbsp; <input name=\"pass\" id=\"pwd\" type=\"password\" value=\"\" style=\"height:30px; width:220px;\" align=\"top\"><br><br>\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("<input type=\"submit\" value=\"Login\" style=\"height:30px; width:70px; border-color:#FFA500;\">\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   \n");
      out.write("<sub><big><a href=\"register.jsp\" align=\"top\" border=\"0\">Doesn't have an account?</a></big></sub><br>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div><br><br>\n");
      out.write("\n");
      out.write("<div class=\"blok\"><span class=\"title\">NEWSLETTER</span><br>\n");
      out.write("<img src=\"images/line.jpg\" class=\"lin\" width=\"310\" height=\"7\"><br>\t\n");
      out.write("Consectete adipiscig elit<br>\n");
      out.write("<input name=\"text\" type=\"text\" value=\"\" style=\"height:30px; width:220px;\" align=\"top\"><a href=\"#\"><img src=\"images/ok.jpg\" align=\"top\" border=\"0\"></a><br><br>\n");
      out.write("<a href=\"#\" class=\"read\">Unsubscribe</a>\n");
      out.write("</div>\n");
      out.write("</td>\n");
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
