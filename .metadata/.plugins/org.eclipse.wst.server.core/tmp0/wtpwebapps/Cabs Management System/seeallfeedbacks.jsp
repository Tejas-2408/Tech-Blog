<%@include file="adminheader.jsp" %>
<%@page import="java.sql.*"%>
<html>
    <body>
        <div class="container" style="margin-top: 70px">
            <div class="jumbotron" style="background-color: greenyellow">
            <div class="row">
                <div class="col-sm-6">
                    <img src="images/feedback.jpg" class="img-responsive img-thumbnail"/>
            </div>
            <div class="col-sm-6">
                <h2><b><center>FEEDBACK-LIST</center></b></h2>
<%
try
               {
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
       String query="select * from feedbacks";
       PreparedStatement pst=con.prepareStatement(query);
       ResultSet rs=pst.executeQuery();
       out.println("<html><body><div class='container'><table border='1' align='center'>");
       out.println("<tr><th>USER-NAME</th><th>CONTACT</th><th>EMAIL-ID</th><th>FEEDBACK</th></tr>");
       while(rs.next())
                     {
                     out.println("<tr><td>"+rs.getString(1)+"</td>");
                     out.println("<td>"+rs.getString(2)+"</td>");
                     out.println("<td>"+rs.getString(3)+"</td>");
                     out.println("<td>"+rs.getString(4)+"</td>");
                    
                     
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