<%@include file="mainheader.jsp" %>
<%@page import="java.sql.*"%>
<html>
    
    <body>
        <div class="container-fluid" style="margin-top: 70px">
            <div class="well" style="background-color: orange">  <h2><b><center>ADMIN LOGIN</center></b></h2></div>
        </div>
        <div class="container" style="margin-top: 40px">
            <div class="jumbotron">
            <div class="row">
                   <div class="col-sm-6">
                       
                    <img src="images/userhome2.png" class="img-responsive img-thumbnail" style="width: 80%"/>
               </div>
                <div class="col-sm-6">
                   
                        <form method="post" action="">
    <table border-width="10px" height="100" align="center">
        <tr><td><h3>ADMIN NAME:</h3></td><td><input type="text" name="adminname"></td></tr>
        <tr><td><h3>PASSWORD:</h3></td><td><input type="password" name="password"></td></tr>
        <tr><td><h3><input type="submit" name="login" value="Login"></h3></td>
        <td><h3><input type="reset" name="reset" value="Reset"></h3></td></tr>
    </table>
</form>
<%



       String submit=request.getParameter("login");
if(submit==null)
       {
    
}
else if(submit.equals("Login"))
    {    
       String adminname=request.getParameter("adminname");
       String password=request.getParameter("password");
        HttpSession h1=request.getSession();
       
       try
                             {
       int num=0;
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
        String query="select * from cabs.adminmain where adminname=? and password=?";
       PreparedStatement pst=con.prepareStatement(query);
       pst.setString(1, adminname);
       pst.setString(2, password);
       ResultSet rs= pst.executeQuery();
       if(rs.next())
           num=rs.getRow();
       if(num>=1)
                     {
           h1.setAttribute("adminname",adminname);
           h1.setAttribute("password",password);
           out.println("You are the administrator");
           response.sendRedirect("adminhome.jsp");
       }
       else
                     {
           out.println("Please enter right adminname & password");
       }
               
       
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
    </body>
</html>
<%@include file="footer.jsp" %>