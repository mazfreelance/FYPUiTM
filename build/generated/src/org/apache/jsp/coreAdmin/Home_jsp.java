package org.apache.jsp.coreAdmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-3 left_col\">\r\n");
      out.write("                <div class=\"left_col scroll-view\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"navbar nav_title\" style=\"border: 0;\">\r\n");
      out.write("                        <a href=\"index.jsp\" class=\"site_title\"><i class=\"fa fa-paw\"></i> <span>Hally's Laundry</span></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- menu prile quick info -->\r\n");
      out.write("                    <div class=\"profile\">\r\n");
      out.write("                        <div class=\"profile_pic\">\r\n");
      out.write("                            <img src=\"production/images/logoHally.png\" alt=\"...\" class=\"img-circle profile_img\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        <div class=\"profile_info\">\r\n");
      out.write("                            <span>Welcome, ");
      out.write("</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /menu prile quick info -->\r\n");
      out.write("\r\n");
      out.write("                    <br />\r\n");
      out.write("\r\n");
      out.write("                    <!-- sidebar menu -->\r\n");
      out.write("                  <div id=\"sidebar-menu\" class=\"main_menu_side hidden-print main_menu\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"menu_section\">\r\n");
      out.write("                            <h3>MENU</h3>\r\n");
      out.write("                            <ul class=\"nav side-menu\">\r\n");
      out.write("                                <li><a><i class=\"fa fa-users\"></i> Manage Customer <span class=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("                                    <ul class=\"nav child_menu\" style=\"display: none\">\r\n");
      out.write("                                        <li><a href=\"searchCustomer.jsp\">Search Customer</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <li><a href=\"vcust.jsp\">View Customer</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a><i class=\"fa fa-user\"></i> Manage Employee <span class=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("                                    <ul class=\"nav child_menu\" style=\"display: none\">\r\n");
      out.write("                                        <li><a href=\"searchEmployee2.jsp\">View Employee</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("           \r\n");
      out.write("                                <li><a><i class=\"fa fa-table\"></i> Manage Transactions <span class=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("                                    <ul class=\"nav child_menu\" style=\"display: none\">\r\n");
      out.write("                                        <li><a href=\"reg2.jsp\">Search Transaction</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"viewtransac.jsp\">VIew Customer Transactions</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("<!--                                <li><a><i class=\"fa fa-bar-chart-o\"></i> Manage Report <span class=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("                                    <ul class=\"nav child_menu\" style=\"display: none\">\r\n");
      out.write("                                        <li><a href=\"chartjs.html\">Generate Report</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"viewReport.jsp\">View Report</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>-->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("             \r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /sidebar menu -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- /menu footer buttons -->\r\n");
      out.write("             \r\n");
      out.write("                    <!-- /menu footer buttons -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>");
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
