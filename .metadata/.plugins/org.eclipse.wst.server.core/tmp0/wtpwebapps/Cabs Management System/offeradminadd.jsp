<%@include file="adminheader.jsp" %>
<%@page import="java.sql.*"%>
<html>
    <body>
        <div class="container" style="margin-top: 70px">
             <div class="well" style="background-color: plum"> <h2><center><b>ADD-OFFERS</b></center></h2></div>
            <div class="jumbotron" style="background-color: papayawhip">
            <div class="row">
                <div class="col-sm-12">
                    <img src="images/offers.jpg" class="img-responsive img-thumbnail" style="width: 100% "/>
            </div>
            <div class="col-sm-12">
<form method="get" action="">
    
    <table border-width="10px" height="300" align="center">
        <tr><td><b>OFFER NAME:</b></td><td><input type="text" name="offername"></td></tr>
        <tr><td><b>DESCRIPTION:</b></td><td><input type="text" name="description"></td></tr>
        <tr><td><b>DISCOUNT:</b></td><td><input type="text" name="discount"/></td></tr>
        <tr><td><b>STARTING-DATE:</b></td><td><input type="text" name="startingdate"></td></tr>
        <tr><td><b>ENDING-DATE:</b></td><td><input type="text" name="endingdate"></td></tr>
        <tr><td><b><input type="submit" name="add" value="Add"></b></td>
            <td><b><input type="reset" name="reset" value="Reset"></b></td></tr>
    </table>
</form>
<%
String add=request.getParameter("add");
if(add==null)
       {
    
}
else if(add.equals("add"))
       {
String offername=request.getParameter("offername");
String description=request.getParameter("description");
String discount=request.getParameter("discount");
String startingdate=request.getParameter("startingdate");
String endingdate=request.getParameter("endingdate");

try
               {
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
       String query="insert into offers(offername,description,discount,startingdate,endingdate) values(?,?,?,?,?)";
       PreparedStatement pst=con.prepareStatement(query);
       pst.setString(1, offername);
       pst.setString(2, description);
       pst.setString(3, discount);
       pst.setString(4, startingdate);
       pst.setString(5, endingdate);
       pst.executeUpdate();
      out.println("<h1> Offer is added</h1>"); 
}
catch(Exception ae)
               {
    out.println(ae.getMessage());
}}

%>
            </div>
            </div></div></div></body></html>
<%@include file="footer.jsp" %>