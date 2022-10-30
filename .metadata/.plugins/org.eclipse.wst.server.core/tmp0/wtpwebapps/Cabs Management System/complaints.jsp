<%@include file="userheader.jsp" %>
<%@page import="java.sql.*"%>
<html>
    <head>
        <script>
           function doCheck()
{
 
  var c=document.getElementById("complaint");
  
  
  if(c.value == "")
  {
    alert ("complaint column can't be empty");
    c.focus();
	return false;
	}
}
</script>
    </head>
    <body>
         
        
                <div class="container" style="margin-top: 70px">
             
            <div class="jumbotron" style="background-color: peachpuff">
            <div class="row">
                <div class="col-sm-6"> <img src="images/comp.jpg" class="img-responsive img-thumbnail" style="width: 100%"/></div>
                <div class="col-sm-6"> 
 <table border-width="10px" height="300" align="center">
     <%
     HttpSession h1=request.getSession();
     String username=(String)h1.getAttribute("username");
     String email=(String)h1.getAttribute("email");
     String contact=(String)h1.getAttribute("contact");
     String complaints=(String)h1.getAttribute("complaints");
     %>
 <form method="post" name="myform" onsubmit="return focus()" action="">
    <tr><td><b>USER NAME:</b></td><td><input type="text" name="username" value="<%=username%>"></td></tr>
        <tr><td><b>EMAIL ID:</b></td><td><input type="text" name="email" value="<%=email%>"></td></tr>
        <tr><td><b>CONTACT No:</b></td><td><input type="text" name="contact" value="<%=contact%>"></td></tr>
        <tr><td><b>COMPLAINT-BOX:</b></td><td><textarea name="complaints" rows="5" cols="22" id="complaint"></textarea></td></tr>
         <tr><td><b><input type="submit" name="submit" value="Submit" onclick="return doCheck()"></b></td>
            <td><b><input type="reset" name="reset" value="Reset"/></b></td></tr>
</form>
      </table>
<%
String submit=request.getParameter("submit");
if(submit==null)
       {
    
}
else if(submit.equals("Submit"))
       {
try
               {
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
       String query="insert into cabs.complaints values(?,?,?,?)";
       PreparedStatement pst=con.prepareStatement(query);
       pst.setString(1, username);
       pst.setString(2, email);
       pst.setString(3, contact);
       pst.setString(4, complaints);
       pst.executeUpdate();
       out.println("Your complaint has been registered successfully");
       
}
catch(Exception ae)
               {
    out.println(ae.getMessage());
}}
%>
                </div>
            </div></div>
        </div>
    </body>
</html>
<%@include file="footer.jsp" %>