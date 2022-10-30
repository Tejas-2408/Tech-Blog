<%@include file="mainheader.jsp" %>
<%@page import="java.sql.*"%>
<html>
    <body>  
<div class="container" style="margin-top: 40px">
            <div class="jumbotron">
                <div class="row">
                    <div class="col-sm-8">
                        <img src="images/help.jpg" class="img-responsive img-thumbnail "width="400"/>
                        
                    </div>
                    <div class="col-sm-4">
                    
                        <form method="get" action="">
                            <table border-width="10px" height="300" align="center">
                            <tr><td><b>USERNAME</b></td><td><input type="text" name="username" size="30"></td></tr>
                            <tr><td><b>EMAIL-ID</b></td><td><input type="text" name="email" size="30"></td></tr>
                            <tr><td><b>CONTACT-NO.</b></td><td><input type="text" name="contact" size="30"></td></tr>
                            <tr><td><b>HOW CAN WE HELP YOU?</b></td><td><textarea name="HELP" size="30"rows="5" cols="30"></textarea></td></tr>
                        <tr><td><input type="submit" name="submit" value="Submit"></td>
                        <td><input type="reset" name="reset" value="Reset"/></td></tr>
                    </table>
                                                    </form>
                        
<%
String submit=request.getParameter("submit");
if(submit==null)
       {
    
}
else if(submit.equals("submit"))
       {
String username=request.getParameter("username");
String email=request.getParameter("email");
String contact=request.getParameter("contact");
String help=request.getParameter("help");
try
               {
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
       String query="insert into cabs.help values(?,?,?,?)";
       PreparedStatement pst=con.prepareStatement(query);
       pst.setString(1, username);
       pst.setString(2, email);
       pst.setString(3, contact);
       pst.setString(4, help);
       pst.executeUpdate();
       out.println("Thanks..we will try to resolve your issue instantly");
}
catch(Exception ae)
               {
    out.println(ae.getMessage());
}}
%>
                    
                </div>
            </div>
            </div>
        </div>
<div class="container">
    <div class="row">
        <div class="well">
            <h4 style="color: green">You can report any issue such as Billing /Payment issue or any Driver related issue and we will try to resolve it instantly by contacting you.</h4>
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