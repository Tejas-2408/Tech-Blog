/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.63
 * Generated at: 2022-08-06 17:27:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Project.ConnectionProvider;
import java.sql.*;

public final class editDeleteList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.html", Long.valueOf(1654261158677L));
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
    _jspx_imports_classes.add("Project.ConnectionProvider");
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("  float: left;\r\n");
      out.write("  border-right:1px solid #bbb;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li:last-child {\r\n");
      out.write("  border-right: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a:hover:not(.active) {\r\n");
      out.write("  background-color: #111;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active {\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("  <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("  <li><a href=\"addNewDonor.jsp\">Add New Donor</a></li>\r\n");
      out.write("  <li><a href=\"editDeleteList.jsp\">Edit,Delete & List of Donor Details</a></li>\r\n");
      out.write("    <li><a href=\"manageStock.jsp\">Manage Stock</a></li>\r\n");
      out.write("  <li><a href=\"requestForBlood.jsp\">Request for Blood</a></li>\r\n");
      out.write("  <li><a href=\"requestCompleted.jsp\">Request Completed</a></li>\r\n");
      out.write("  <li style=\"float:right\"><a href=\"adminLogin.jsp\">Logout</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("#customers {\r\n");
      out.write("  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  width: 95%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#customers td, #customers th {\r\n");
      out.write("  border: 1px solid #ddd;\r\n");
      out.write("  padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#customers tr:nth-child(even){background-color: #f2f2f2;}\r\n");
      out.write("\r\n");
      out.write("#customers tr:hover {background-color: #ddd;}\r\n");
      out.write("\r\n");
      out.write("#customers th {\r\n");
      out.write("  padding-top: 12px;\r\n");
      out.write("  padding-bottom: 12px;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");

String msg = request.getParameter("msg");
if("valid".equals(msg)){

      out.write("\r\n");
      out.write("<center><font color=\"green\" size=\"5\">Successfully Updated</font></center>\r\n");
 }
      out.write("\r\n");
      out.write("\r\n");

if("invalid".equals(msg)){

      out.write("\r\n");
      out.write("<center><font color=\"red\" size=\"5\">Something went Wrong!!! Try Again</font></center>\r\n");
 }
      out.write("\r\n");
      out.write("\r\n");

if("deleted".equals(msg)){

      out.write("\r\n");
      out.write("<center><font color=\"red\" size=\"5\">Successfully Deleted</font></center>\r\n");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<table id=\"customers\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th>ID</th>\r\n");
      out.write("<th>Name</th>\r\n");
      out.write("<th>Father's Name</th>\r\n");
      out.write("<th>Mother's Name</th>\r\n");
      out.write("<th>Mobile Number</th>\r\n");
      out.write("<th>Gender</th>\r\n");
      out.write("<th>Email</th>\r\n");
      out.write("<th>Bloodgroup</th>\r\n");
      out.write("<th>Address</th>\r\n");
      out.write("<th>Edit</th>\r\n");
      out.write("<th>Delete</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");

try{
	Connection con = ConnectionProvider.getCon();
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from donor");
	while(rs.next()){

      out.write("\r\n");
      out.write("<td>");
      out.print(rs.getInt(1));
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString(5));
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString(6));
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString(7));
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString(8));
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(rs.getString(9));
      out.write("</td>\r\n");
      out.write("<td><a href=\"updateDonor.jsp?id=");
      out.print(rs.getString(1));
      out.write("\">Edit</a></td>\r\n");
      out.write("<td><a href=\"deleteDonor.jsp?id=");
      out.print(rs.getString(1));
      out.write("\">Delete</a></td>\r\n");
      out.write("</tr>\r\n");
}
	}
catch(Exception e){System.out.println(e);}	

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("</body>\r\n");
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