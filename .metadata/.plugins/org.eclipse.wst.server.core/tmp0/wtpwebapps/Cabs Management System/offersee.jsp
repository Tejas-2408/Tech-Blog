<%@include file="userheader.jsp" %>
<%@page import="java.sql.*"%>
<html>
    <body>
 
                <div class="container" style="margin-top: 100px">
                 <div class="jumbotron" style="background-color: papayawhip">
             <div class="row">
                
                 <div class="col-sm-12">
                   
<%

try
               {
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
       String query="select * from offers";
       PreparedStatement pst=con.prepareStatement(query);
       ResultSet rs=pst.executeQuery();
       out.println("<html><body><div class='container'><table border='1' align='center'>");
       out.println("<tr><th><h3><b>OFFER-NAME</b></h3></th><th><h3><b>DESCRIPTION</b></h3></th><th><h3><b>DISCOUNT</b></h3></th><th><h3><b>STARTING-DATE</b></h3></th><th><h3><b>ENDING-DATE</b></h3></th></tr>");
       while(rs.next())
                     {
                     out.println("<tr><td>"+rs.getString(1)+"</td>");
                     out.println("<td>"+rs.getString(2)+"</td>");
                     out.println("<td>"+rs.getString(3)+"</td>");
                     out.println("<td>"+rs.getString(4)+"</td>");
                     out.println("<td>"+rs.getString(5)+"</td>");
                     
                    
                     
       }
       out.println("</table></div></body></html>");
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