<%@include file="userheader.jsp" %>
<%@page import="java.sql.*"%>
<html>
    <body>
        <div class="container" style="margin-top: 70px">       
            <div class="row">
                <div class="col-sm-12">
                    <img src="images/olab1.jpg" class="img-responsive img-thumbnail" style="width: 100%"/>
            </div>
            </div>
            </div>
                <div class="container" style="margin-top: 100px">
                 <div class="jumbotron" style="background-color: darkseagreen">
             <div class="row">
                <div class="col-sm-6"> 
                    <img src="images/mod.png" class="img-responsive img-thumbnail"/>
                </div>
                 <div class="col-sm-6">
                   
                     <%                     
try
               {
    HttpSession h1=request.getSession();
    String userid=(String)h1.getAttribute("userid");
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
    String query="select * from usermain where userid=?";
    PreparedStatement pst=con.prepareStatement(query);
    pst.setString(1, userid);
    ResultSet rs=pst.executeQuery();
    while(rs.next())
               {
         out.println("<form method='get' action='modifyuser2.jsp'>");
        out.println("<table border-width='10px' height='300' align='center'");
        out.println("<tr><td><b>USERID</b></td><td><input type='text' name='userid' value="+rs.getString(1)+"></td></tr>");
        out.println("<br>");
        out.println("<tr><td><b>USERNAME</b></td><td><input type='text' name='username' value="+rs.getString(2)+"></td></tr>");
        out.println("<br>");
        out.println("<tr><td><b>PASSWORD</b></td><td><input type='text' name='password' value="+rs.getString(3)+"></td></tr>");
        out.println("<br>");
        out.println("<tr><td><b>EMAIL-ID</b></td><td><input type='text' name='email' value="+rs.getString(4)+"></td></tr>");
        out.println("<br>");
        out.println("<tr><td><b>CONTACT</b></td><td><input type='text' name='contact' value="+rs.getString(5)+"></td></tr>");
        out.println("<br>");
        out.println("<tr><td><b>ADDRESS</b></td><td><input type='text' name='address' value="+rs.getString(6)+"></td></tr>");
        out.println("<br>");
        out.println("<tr><td><b>PINCODE</b></td><td><input type='text' name='pincode' value="+rs.getString(7)+"></td></tr>");
        out.println("<br>");
        out.println("<tr><td><b>GENDER</b></td><td><input type='text' name='gender' value="+rs.getString(8)+"></td></tr>");
        out.println("<br>");
        out.println("<tr><td><b>CITY</b></td><td><input type='text' name='city' value="+rs.getString(9)+"></b></td></tr>");
        out.println("<br>");
        out.println("<tr><td><input type='submit' name='modify' value='modify'></td></tr>");
        out.println("</form>");
               }
    out.println("</table>");
       }

catch(Exception ae)
               {
    out.println(ae.getMessage());
       }

        
%>
                </div>
            </div>
            </div>
                </div>
    </body>
</html>
<%@include file="footer.jsp" %>