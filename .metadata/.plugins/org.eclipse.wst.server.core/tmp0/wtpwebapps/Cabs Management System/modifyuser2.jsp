<%@include file="userheader.jsp" %>
<%@page import="java.sql.*"%>
<html>
    <body>    
                <div class="container" style="margin-top: 100px">
                 <div class="jumbotron" style="background-color: moccasin">
             <div class="row">
            <div class="col-sm-12">
<%

               
    HttpSession h1=request.getSession();
    String userid=(String)h1.getAttribute("userid");
    String username=request.getParameter("username");
String password=request.getParameter("password");
String email=request.getParameter("email");
String contact=request.getParameter("contact");
String address=request.getParameter("address");
String pincode=request.getParameter("pincode");
String gender=request.getParameter("gender");
String city=request.getParameter("city");
try
               {
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
       String query="update usermain set username=?,password=?,email=?,contact=?,address=?,pincode=?,gender=?,city=? where userid=?";
       PreparedStatement pst=con.prepareStatement(query);
       pst.setString(1, username);
       pst.setString(2, password);
       pst.setString(3, email);
       pst.setString(4, contact);
       pst.setString(5, address);
       pst.setString(6, pincode);
       pst.setString(7, gender);
       pst.setString(8, city);
       pst.setString(9,userid);
       pst.executeUpdate();
       out.println("<h1><b>Thanks..We have updated your record</b></h1>");
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
                 <div class="container">
    <div class="row">
        <div class="col-sm-4">
            <div class="panel panel-primary" style="margin-top:10px">
                <div class="panel-heading">
                    <b>24/7 CUSTOMER SUPPORT</b>
                </div>
                <div class="panel-body">
                    <img src="images/3.jpg" class="img-thumbnail" width="100" align="left" vspace="5" hspace="5"/>
                    <p align="right" style="text-align: justify">
                        A dedicated customer support team always at your service to help solve problem.
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="panel panel-primary" style="margin-top:10px">
                <div class="panel-heading">
                    <b>YOUR SAFETY FIRST</b>
                </div>
                <div class="panel-body">
                    <img src="images/5.jpg" class="img-thumbnail" width="100" align="left" vspace="5" hspace="5"/>
                    <p align="justify" style="text-align: justify">
            Keep your relatives informed about travels or call emergency services when in need.           
                    </p>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="panel panel-primary" style="margin-top:10px">
                <div class="panel-heading">
                    <b>TOP RATED DRIVER-PARTNERS</b>
                </div>
                <div class="panel-body">
                    <img src="images/4.jpg" class="img-thumbnail" width="100" align="left" vspace="5" hspace="5"/>
                    <p align="justify" style="text-align: justify">
            All driver-partners are background verified and trained to deliver only best experience.           
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>
        
    </body>
</html>
<%@include file="footer.jsp" %>