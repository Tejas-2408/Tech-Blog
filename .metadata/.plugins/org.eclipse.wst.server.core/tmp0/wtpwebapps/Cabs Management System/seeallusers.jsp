<%@include file="adminheader.jsp" %>
<%@page import="java.sql.*"%>
<html>
    <body>
        <div class="container" style="margin-top: 70px">
             <div class="well" style="background-color: orange"> <h2 style="color: blueviolet"><center><b>USER-LIST</b></center></h2></div>
            <div class="jumbotron" style="background-color: papayawhip">
            <div class="row">
                
            <div class="col-sm-12">
                
<%
try
               {
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
       String query="select * from usermain";
       PreparedStatement pst=con.prepareStatement(query);
       ResultSet rs=pst.executeQuery();
       out.println("<html><body><div class='container' style='margin-top:50px'><table border='2' align='center'>");
       out.println("<tr><th>USER-ID</th><th>USERNAME</th><th>PASSWORD</th><th>EMAIL-ID</th><th>CONTACT</th><th>ADDRESS</th><th>PINCODE</th><th>GENDER</th><th>CITY</th><th>Action</th></tr>");
       while(rs.next())
                     {
                     out.println("<tr><td>"+rs.getString(1)+"</td>");
                     out.println("<td>"+rs.getString(2)+"</td>");
                     out.println("<td>"+rs.getString(3)+"</td>");
                     out.println("<td>"+rs.getString(4)+"</td>");
                     out.println("<td>"+rs.getString(5)+"</td>");
                     out.println("<td>"+rs.getString(6)+"</td>");
                     out.println("<td>"+rs.getString(7)+"</td>");
                     out.println("<td>"+rs.getString(8)+"</td>");
                     out.println("<td>"+rs.getString(9)+"</td>");
                     %>
                     <td><a href="#">Edit</a> | <a href="#">Delete</a> </td>
              
                     <% 
       }
       out.println("</table></div></body></html>");
}
catch(Exception ae)
               {
    out.println(ae.getMessage());
}
%>
            </div></div></div></div></body>
</html>
<%@include file="footer.jsp" %>