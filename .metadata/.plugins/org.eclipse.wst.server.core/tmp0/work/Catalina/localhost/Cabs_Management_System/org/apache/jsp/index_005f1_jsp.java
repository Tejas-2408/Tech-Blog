/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.63
 * Generated at: 2022-08-07 13:43:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.swing.JOptionPane;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1659878742829L));
    _jspx_dependants.put("/mainheader.jsp", Long.valueOf(1659866806828L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.swing.JOptionPane");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("     \n");
      out.write("        <script>\n");
      out.write("           function doCheck()\n");
      out.write("{\n");
      out.write(" \n");
      out.write("  var u=document.getElementById(\"username\");\n");
      out.write("  var e=document.getElementById(\"email\");\n");
      out.write("  var ph=document.getElementById(\"contact\");\n");
      out.write("  var f=document.getElementById(\"feedback\");\n");
      out.write("  if(u.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the username\");\n");
      out.write("    u.focus();\n");
      out.write("	return false;\n");
      out.write("	}\n");
      out.write(" else if(parseInt(u.value))\n");
      out.write("		{\n");
      out.write("                    alert(\"Enter Valid username\");\n");
      out.write("                     u.focus();\n");
      out.write("		    return false;\n");
      out.write("                   \n");
      out.write("		}\n");
      out.write("         if(e.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the email\");\n");
      out.write("    e.focus();\n");
      out.write("	return false;\n");
      out.write("	\n");
      out.write("  }\n");
      out.write("	 else if(e.value.indexOf('@')==-1)\n");
      out.write("		      {\n");
      out.write("		       alert(\"Use @ email correctly\");\n");
      out.write("                        e.focus();\n");
      out.write("		        return false;\n");
      out.write("		      }\n");
      out.write("	  else if(e.value.indexOf('.')==-1)\n");
      out.write("		       {\n");
      out.write("		        alert(\"Use . email correctly\");\n");
      out.write("                          e.focus();\n");
      out.write("		         return false;\n");
      out.write("		       }\n");
      out.write(" if(ph.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"enter the phone number\");\n");
      out.write("\n");
      out.write("	ph.focus();\n");
      out.write("	return false;\n");
      out.write("	}\n");
      out.write("   else if(!parseInt(ph.value))\n");
      out.write("		{\n");
      out.write("                    alert(\"Enter valid Phone number \");\n");
      out.write("		    return false;\n");
      out.write("		}\n");
      out.write("            else if(((ph.value.length)<10) || ((ph.value.length)>10))\n");
      out.write("	                     {\n");
      out.write("	               alert(\"Phone no should contain atleast 10 integers \");\n");
      out.write("\n");
      out.write("	               ph.focus();\n");
      out.write("                        return false;\n");
      out.write("	                  }\n");
      out.write("if(f.value == \"\")\n");
      out.write("  {\n");
      out.write("    alert (\"feedback column can't be empty\");\n");
      out.write("    f.focus();\n");
      out.write("	return false;\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\" style=\"margin-top: 10px\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-8\">\n");
      out.write("                        <img src=\"images/18.jpg\" class=\"img-responsive img-thumbnail \"width=\"600\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                    <form method=\"post\" name=\"myform\" onsubmit=\"return focus()\" action=\"\">\n");
      out.write("                            <table border-width=\"10px\" height=\"300\" align=\"center\">\n");
      out.write("                            <tr><td><b>USERNAME</b></td><td><input type=\"text\" name=\"username\" size=\"30\" id=\"username\"></td></tr>\n");
      out.write("                            <tr><td><b>EMAIL-ID</b></td><td><input type=\"text\" name=\"email\" size=\"30\" id=\"email\"></td></tr>\n");
      out.write("                            <tr><td><b>CONTACT-NO.</b></td><td><input type=\"text\" name=\"contact\" size=\"30\" id=\"contact\"></td></tr>\n");
      out.write("                            <tr><td><b>FEEDBACK</b></td><td><textarea name=\"feedbacks\" size=\"30\"rows=\"5\" cols=\"30\" id=\"feedback\"></textarea></td></tr>\n");
      out.write("                            <tr><td><b><input type=\"submit\" name=\"submit\" value=\"Submit\" onclick=\"return doCheck()\"></b></td>\n");
      out.write("                        <td><b><input type=\"reset\" name=\"reset\" value=\"Reset\" /></b></td></tr>\n");
      out.write("                    </table>\n");
      out.write("                                                    </form>\n");

String submit=request.getParameter("submit");
if(submit==null)
       {  
}
else if(submit.equals("Submit"))
       {
String username=request.getParameter("username");
String email=request.getParameter("email");
String contact=request.getParameter("contact");
String feedbacks=request.getParameter("feedbacks");
try
               {
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
       String query="insert into feedbacks values(?,?,?,?)";
       PreparedStatement pst=con.prepareStatement(query);
       pst.setString(1, username);
       pst.setString(2, email);
       pst.setString(3, contact);
       pst.setString(4, feedbacks);
       pst.executeUpdate();
       out.println("Your feedback has been registered successfully");
}
catch(Exception ae)
               {
    out.println(ae.getMessage());
}}

      out.write("\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"panel panel-primary\" style=\"margin-top:10px\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <b>24/7 CUSTOMER SUPPORT</b>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <img src=\"images/3.jpg\" class=\"img-thumbnail\" width=\"100\" align=\"left\" vspace=\"5\" hspace=\"5\"/>\n");
      out.write("                    <p align=\"right\" style=\"text-align: justify\">\n");
      out.write("                        A dedicated customer support team always at your service to help solve problem.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"panel panel-primary\" style=\"margin-top:10px\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <b>YOUR SAFETY FIRST</b>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <img src=\"images/5.jpg\" class=\"img-thumbnail\" width=\"100\" align=\"left\" vspace=\"5\" hspace=\"5\"/>\n");
      out.write("                    <p align=\"justify\" style=\"text-align: justify\">\n");
      out.write("            Keep your relatives informed about travels or call emergency services when in need.           \n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"panel panel-primary\" style=\"margin-top:10px\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <b>TOP RATED DRIVER-PARTNERS</b>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <img src=\"images/4.jpg\" class=\"img-thumbnail\" width=\"100\" align=\"left\" vspace=\"5\" hspace=\"5\"/>\n");
      out.write("                    <p align=\"justify\" style=\"text-align: justify\">\n");
      out.write("            All driver-partners are background verified and trained to deliver only best experience.           \n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\" class=\"navbar-fixed-bottom\" style=\"margin-top: 50px\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <ul>\n");
      out.write("                            <a class=\"navbar-brand\" href=\"#\"><img src=\"images/TaxiTour.png\" WIDTH=\"100\" height=\"60\"/></a>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"col-sm-3\"style=\"color: #fff\">\n");
      out.write("                                <ul><h5><b>Taxi Tour</b></h5>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("        \n");
      out.write("       ");
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
