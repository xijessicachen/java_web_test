/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2015-10-06 03:06:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_005fcalendar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<link href=\"static/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<title>Hello</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("\t<script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("\t<script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("<script>\n");
      out.write(" $(function() {\n");
      out.write("  $( \"#datepicker\" ).datepicker();\n");
      out.write("}); \n");
      out.write("</script>\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("<nav class=\"navbar navbar-inverse navbar-default navbar-static-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <a class = \"navbar-brand\"> See history state for website </a>\n");
      out.write("        <button class = \"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navHeaderCollapse\">\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t  <div class = \"row\">  \n");
      out.write("\t    <div class = \"col-md-8 col-md-offset-2\">\n");
      out.write("\t      <div class = \"panel panel-default\">\n");
      out.write("\t        <div class = \"panel-body\">\n");
      out.write("\t          <table class=\"table table-striped\"> \n");
      out.write("\t          \t <tr>\n");
      out.write("\t                <th></th>\n");
      out.write("\t                <th></th>\n");
      out.write("\t                <th></th>\n");
      out.write("\t                <th></th>\n");
      out.write("\t              </tr>\n");
      out.write("\t              <tr>\n");
      out.write("\t\t              <div> \n");
      out.write("\t\t                <td class = \"col-md-1\"></div>\n");
      out.write("\t\t                \n");
      out.write("\t\t                </td>\n");
      out.write("\t\t                <form method=\"post\" action=\"LoginServlet\" class = \"form-horizontal\">\n");
      out.write("\t\t                <td class = \"col-md-2\">\n");
      out.write("\t\t\t                <label for=\"view_url\" class = \"col-lg-2 control-label\">Website url&emsp;</label>\n");
      out.write("\t\t\t                <input type=\"text\" id=\"view_url\" name=\"view_url\" class=\"form-control form-control-inline\" pattern=\"[A-Za-z0-9_].{2,20}\" maxlength=\"20\" title=\"3 to 20 characters\" required /><br>\n");
      out.write("\t\t\t            </td>\n");
      out.write("\t\t                <td class = \"col-md-2\">\n");
      out.write("\t\t                    <p>Date: <input type=\"text\" id=\"datepicker\" name=\"view_date_time\"></p>\n");
      out.write("\t\t                    \n");
      out.write("\t\t                </td> \n");
      out.write("\t\t                \n");
      out.write("\t\t                <td>\n");
      out.write("\t\t\t                <input type=\"hidden\" name=\"op\" value=\"view_view\">\n");
      out.write("\t\t               \t\t<input type=\"submit\" value=\"View\" class=\"btn btn-success pull-right\">\n");
      out.write("\t\t                </td>\n");
      out.write("\t\t                <td>\n");
      out.write("\t\t                \t\n");
      out.write("\t\t                </td>\n");
      out.write("\t\t\t            </form>\n");
      out.write("\t\t                \n");
      out.write("\t\t              </div>\n");
      out.write("\t\t            </tr>\n");
      out.write("\t\t            <tr>\n");
      out.write("\t\t            </tr>\n");
      out.write("\t          \n");
      out.write("\t          \n");
      out.write("\t          \n");
      out.write("\t          \t\n");
      out.write("\t          </table>\n");
      out.write("\t        </div>\n");
      out.write("\t      </div>\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t<div class = \"navbar navbar-default navbar-fixed-bottom\">\n");
      out.write("\t  <div class = \"container\">\n");
      out.write("\t    <p class = \"navbar-text pull-left\"> Site Built by Jessica \n");
      out.write("\t    </p>\n");
      out.write("\t    <a href = \"http://www-personal.umich.edu/~chenxicx/index.html\" class = \"navbar-btn btn-default btn pull-right\"> Visit my website </a>\n");
      out.write("\t  </div>\n");
      out.write("\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t<script src=\"static/angular.min.js\"></script>\n");
      out.write("\t<script src=\"static/angular.js\"></script> \n");
      out.write("\t<script src=\"static/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"static/bootstrap.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
