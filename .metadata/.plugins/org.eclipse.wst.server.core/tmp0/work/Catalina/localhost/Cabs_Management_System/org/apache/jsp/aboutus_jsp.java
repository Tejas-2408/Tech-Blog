/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.63
 * Generated at: 2022-08-07 13:04:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1659866641451L));
    _jspx_dependants.put("/mainheader.jsp", Long.valueOf(1659866806828L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-state=1\"/>\n");
      out.write("        <title>CABS HELP SYSTEM</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\"/>\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a href=\"#\" class=\"navbar-brand\">Ola</a>\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#home\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"home\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li class=\"nav-item\"><a href=\"aboutus.jsp\">ABOUT US</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"gallery.jsp\">GALLERY</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"contactus.jsp\">CONTACT US</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"signin.jsp\"><span class=\"fa fa-user-circle \"></span>Log In</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"signup.jsp\"><span class=\"fa fa-user-plus \"></span> Sign Up</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\" style=\"margin-top: 60px \">\r\n");
      out.write("            \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-6\">\r\n");
      out.write("                        \r\n");
      out.write("                        <img src=\"images/ola3.jpg\" class=\"img-responsive img-thumbnail\" style=\"text-align: right\" vspace=\"15\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <h1> Redefining Mobility in India</h1>\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("Taxi Tour, India's most popular mobile app for transportation, integrates city transportation for customers and driver partners onto a mobile technology platform. As one of India's fastest growing companies we ensure convenient, transparent and quick service fulfilment using technology to make transportation hassle free for everyone. \r\n");
      out.write("\r\n");
      out.write("Taxi Tour's offerings on its platform ranges from affordable AC cabs on the Taxi Tour Micro range, to the superior luxury offering from Taxi Tour Lux, as well as localized offerings like the ubiquitous Auto-rickshaws, to Shuttle buses for daily commute. Using the Taxi Tour mobile app, users across 110 cities can conveniently book from over 6,00,000 vehicles available to them. \r\n");
      out.write("\r\n");
      out.write("We've empowered hundreds of thousands of driver-partners as entrepreneurs, by building an ecosystem encompassing financing institutions, car manufacturers, service providers etc. for drivers to grow professionally and personally as well as a consistent earning opportunity for them on the Taxi Tour platform.</p>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("          \r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("            <div class=\"panel panel-primary\" style=\"margin-top:10px\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <b>24/7 CUSTOMER SUPPORT</b>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <img src=\"images/3.jpg\" class=\"img-thumbnail\" width=\"100\" align=\"left\" vspace=\"5\" hspace=\"5\"/>\r\n");
      out.write("                    <p align=\"right\" style=\"text-align: justify\">\r\n");
      out.write("                        A dedicated customer support team always at your service to help solve problem.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("            <div class=\"panel panel-primary\" style=\"margin-top:10px\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <b>YOUR SAFETY FIRST</b>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <img src=\"images/5.jpg\" class=\"img-thumbnail\" width=\"80\" align=\"left\" vspace=\"5\" hspace=\"5\"/>\r\n");
      out.write("                    <p align=\"justify\" style=\"text-align: justify\">\r\n");
      out.write("            Keep your relatives informed about travels or call emergency services when in need.           \r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("            <div class=\"panel panel-primary\" style=\"margin-top:10px\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <b>TOP RATED DRIVER-PARTNERS</b>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <img src=\"images/4.jpg\" class=\"img-thumbnail\" width=\"100\" align=\"left\" vspace=\"5\" hspace=\"5\"/>\r\n");
      out.write("                    <p align=\"justify\" style=\"text-align: justify\">\r\n");
      out.write("            All driver-partners are background verified and trained to deliver only best experience.           \r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\" class=\"navbar-fixed-bottom\" style=\"margin-top: 50px\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <ul>\n");
      out.write("                            <a class=\"navbar-brand\" href=\"#\"><img src=\"images/2.jpg\" WIDTH=\"100\" height=\"30\"/></a>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"col-sm-3\"style=\"color: #fff\">\n");
      out.write("                                <ul><h5><b>Ola</b></h5>\n");
      out.write("                                    <li><a href=\"aboutus.jsp\">About</a></li>\n");
      out.write("                                    <li><a href=\"career.jsp\">  Career</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                </div>\n");
      out.write("                             <div class=\"col-sm-3\"style=\"color: #fff\">\n");
      out.write("                                <ul><h5><b>SUPPORT</b></h5>\n");
      out.write("                                <li><a href=\"helpcenter.jsp\">Help center</a></li>\n");
      out.write("                                <li><a href=\"contactus.jsp\">Contact</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                             </div>\n");
      out.write("                    \n");
      out.write("                             <div class=\"col-sm-3\"style=\"color: #fff\">\n");
      out.write("                                <ul><h5><b>SOCIAL</b></h5>\n");
      out.write("                                <li><a href=\"https://www.facebook.com/Olacabs\">Facebook</a></li>\n");
      out.write("                                <li><a href=\"https://twitter.com/Olacabs\">\n");
      out.write("                                    Twitter</a>\n");
      out.write("                                </li></ul>\n");
      out.write("                                </div>      \n");
      out.write("                     </div>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\" style=\"color: #fff\">\n");
      out.write("                    <li><b>Address:</b></li>\n");
      out.write("                    <li><b>SCO-97 SECTOR-17,KURUKSHETRA</b></li>\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                </ul>\n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("  ");
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
