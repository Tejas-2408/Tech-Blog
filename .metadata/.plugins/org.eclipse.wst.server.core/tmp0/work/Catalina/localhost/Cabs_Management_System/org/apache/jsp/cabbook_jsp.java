/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.63
 * Generated at: 2022-08-07 15:30:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class cabbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1659885859223L));
    _jspx_dependants.put("/userheader.jsp", Long.valueOf(1659880689650L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
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

      out.write("\n");
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
      out.write("                <a href=\"#\" class=\"navbar-brand\">Taxi Tour</a>\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#home\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"home\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"userhome.jsp\">HOME</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                \n");
      out.write("        <li><a href=\"usermain.jsp\">Profile</a></li>\n");
      out.write("        <li><a href=\"complaints.jsp\">Complaints</a></li>\n");
      out.write("        <li><a href=\"suggestions.jsp\">Suggestions</a></li>\n");
      out.write("        <li><a href=\"cabbook.jsp\">Bookings</a></li>\n");
      out.write("        <li><a href=\"offersee.jsp\">Offers</a></li>\n");
      out.write("        \n");
      out.write("        <li><a href=\"userlogout.jsp\"><input id=\"button\" type=\"button\" name=\"logout\" value=\"Logout\"/></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	<div class=\"container\" style=\"margin-top: 70px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("		<div class=\"row\">\n");
      out.write("			<div class=\"col-sm-12\">\n");
      out.write("				<div class=\"well\" style=\"background-color: burlywood\">\n");
      out.write("					<h3>\n");
      out.write("						<b><center>BOOK A CAB FOR YOU</center></b>\n");
      out.write("					</h3>\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<div class=\"container\" style=\"margin-top: 30px\">\n");
      out.write("\n");
      out.write("		<div class=\"jumbotron\" style=\"background-color: yellowgreen\">\n");
      out.write("			<div class=\"row\">\n");
      out.write("				<div class=\"col-sm-6\">\n");
      out.write("					<img src=\"images/book.jpg\" class=\"img-responsive img-thumbnail\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col-sm-6\">\n");
      out.write("					<table border-width=\"10px\" height=\"300\" align=\"center\">\n");
      out.write("						<form method=\"get\" action=\"\">\n");
      out.write("							<tr>\n");
      out.write("								<td><b>USER NAME:</b></td>\n");
      out.write("								<td><input type=\"text\" name=\"username\"></td>\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								<td><b>PASSWORD:</b></td>\n");
      out.write("								<td><input type=\"password\" name=\"password\"></td>\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								<td><b>EMAIL ID:</b></td>\n");
      out.write("								<td><input type=\"text\" name=\"email\" /></td>\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								<td><b>CONTACT No:</b></td>\n");
      out.write("								<td><input type=\"text\" name=\"contact\"></td>\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								<td><b>ADDRESS:</b></td>\n");
      out.write("								<td><input type=\"text\" name=\"address\"></td>\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								<td><b>PIN CODE:</b></td>\n");
      out.write("								<td><input type=\"text\" name=\"pincode\"></td>\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								<td><b>CITY:</b></td>\n");
      out.write("								<td><input type=\"text\" name=\"city\"></td>\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								<td><b>BOOKING-DATE:</b></td>\n");
      out.write("								<td><input type=\"text\" name=\"bookingdate\"></td>\n");
      out.write("							</tr>\n");
      out.write("							<tr>\n");
      out.write("								<td><b>BOOKING-TIME:</b></td>\n");
      out.write("								<td><input type=\"text\" name=\"bookingtime\"></td>\n");
      out.write("							<tr>\n");
      out.write("								<td><b>STARTING-LOCATION:</b></td>\n");
      out.write("								<td><input type=\"text\" name=\"startinglocation\"></td>\n");
      out.write("							<tr>\n");
      out.write("								<td><b>DEPARTURE:</b></td>\n");
      out.write("								<td><input type=\"text\" name=\"departure\"></td>\n");
      out.write("							<tr>\n");
      out.write("								<td><b><input type=\"submit\" name=\"action\" value=\"BOOK\"></b></td>\n");
      out.write("								<td><b><input type=\"submit\" name=\"action\"\n");
      out.write("										value=\"UPDATE\"></b></td>\n");
      out.write("							</tr>\n");
      out.write("\n");
      out.write("						</form>\n");
      out.write("					</table>\n");
 		
					String action = request.getParameter("action");	
if (action == null) {	
	
} else if (action.equals("BOOK")) {	
String username = request.getParameter("username");	
String password = request.getParameter("password");	
String email = request.getParameter("email");	
String contact = request.getParameter("contact");	
String address = request.getParameter("address");	
String pincode = request.getParameter("pincode");	
String city = request.getParameter("city");	
String bookingdate = request.getParameter("bookingdate");	
String bookingtime = request.getParameter("bookingtime");	
String startinglocation = request.getParameter("startinglocation");	
String departure = request.getParameter("departure");	
try {	
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
	String query = "insert into booking(username,password,email,contact,address,pincode,city,bookingdate,bookingtime,startinglocation,departure) values(?,?,?,?,?,?,?,?,?,?,?)";
	PreparedStatement pst = con.prepareStatement(query);
	pst.setString(1, username);
	pst.setString(2, password);
	pst.setString(3, email);
	pst.setString(4, contact);
	pst.setString(5, address);
	pst.setString(6, pincode);
	pst.setString(7, city);
	pst.setString(8, bookingdate);
	pst.setString(9, bookingtime);
	pst.setString(10, startinglocation);
	pst.setString(11, departure);
	pst.executeUpdate();
	out.println("BOOKING SUCCESSFULL");
} catch (Exception ae) {	
	out.println(ae.getMessage());
}	
}	

      out.write("\n");
      out.write("					\n");
      out.write("					\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
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
      out.write("                    <li><b>SCO-92 SECTOR-17,KURUKSHETRA</b></li>\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                </ul>\n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
