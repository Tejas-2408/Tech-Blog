<%@include file="mainheader.jsp" %>
<%@page import="java.sql.*"%>
<html>
    <head>
        <script>
             
            function doCheck()
{
 
  var u=document.getElementById("adminname");
  var p=document.getElementById("password");
   var e=document.getElementById("email");
   var ph=document.getElementById("contact");
  var a=document.getElementById("address");
  var pi=document.getElementById("pincode");
  var c=document.getElementById("city");
 
  if(u.value == "")
  {
    alert ("Enter the adminname");
	return false;
u.focus();

	}
 else if(parseInt(u.value))
		{
                    alert("Enter Valid adminname");
                    
		    return false;
                    u.focus();
		}

    if(p.value == "")
  {
    alert ("Enter the password");
	return false;
        p.focus();
	
	}

	else if((p.value.length)<6)
	{
	 alert("Password should contain atleast 6 characters ");
	 return false;
        p.focus();

	 }
         if(e.value == "")
  {
    alert ("enter the email");
	return false;
e.focus();	
    }

	 else if(e.value.indexOf('@')==-1)
		      {
		       alert("Use @ email correctly");
		        return false;
                      e.focus();
		     
		      }

	  else if(e.value.indexOf('.')==-1)
		       {
		        alert("Use . email correctly");
		         return false;
                        e.focus();
		       
		       }
 if(ph.value == "")
  {
    alert ("enter the phone number");

	ph.focus();
	return false;
	}
   else if(!parseInt(ph.value))
		{
                    alert("Enter valid Phone number ");
		    return false;
		}
            else if(((ph.value.length)<10) || ((ph.value.length)>10))
	                     {
	               alert("Phone no should contain atleast 10 integers ");

	               ph.focus();
                        return false;
	                  }


	  if(a.value == "")
  {
    alert ("enter the address");
	a.focus();
	return false;
	}

  if(pi.value == "")
  {
    alert ("enter the pincode");
	pi.focus();
	return false;
	}

	 else if(!parseInt(pi.value))
		{
                    alert("Enter Integer");
		    return false;
		}
              else if(((pi.value.length)>6))
	        {
	               alert("Pin no: should contain 6 integers ");
	               pi.focus();
	               return false;
                 }

	  if(c.value == "")
  {
    alert ("enter the city");
	c.focus();
	return false;
	}
 
  }
       
        </script>
           
    </head>
</html>
<form method="get" action="">
    <h1 align="center">ADMIN DETAILS</h1>
    <table>
        <tr><td>ADMIN NAME:</td><td><input type="text" name="adminname" id="adminname"></td></tr>
        <tr><td>PASSWORD:</td><td><input type="password" name="password" id="password"></td></tr>
        <tr><td>EMAIL ID:</td><td><input type="text" name="email" id="email"></td></tr>
        <tr><td>CONTACT No:</td><td><input type="text" name="contact" id="contact"></td></tr>
        <tr><td>ADDRESS:</td><td><input type="text" name="address" id="address"></td></tr>
        <tr><td>PIN CODE:</td><td><input type="text" name="pincode" id="pincode"></td></tr>
        <tr><td>GENDER:</td><td><input type="radio" name="gender" value="male">Male</td>
            <td><input type="radio" name="gender" value="female">Female</td></tr>
        <tr><td>CITY:</td><td><input type="text" name="city" id="city"></td></tr>
        <tr><td><input type="submit" name="submit" value="Signup" onclick="return doCheck()"></td>
            <td><input type="reset" name="reset" value="Reset"></td></tr>
    </table>
</form>
<%
String submit=request.getParameter("submit");
if(submit==null)
       {
    
}
else if(submit.equals("Signup"))
       {
String adminname=request.getParameter("adminname");
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
       String query="insert into adminmain values(?,?,?,?,?,?,?,?)";
       PreparedStatement pst=con.prepareStatement(query);
       pst.setString(1, adminname);
       pst.setString(2, password);
       pst.setString(3, email);
       pst.setString(4, contact);
       pst.setString(5, address);
       pst.setString(6, pincode);
       pst.setString(7, gender);
       pst.setString(8, city);
       pst.executeUpdate();
       out.println("<h3> Your signup process is complete <a href='adminlogin.jsp'>Please Login</a></h3>");        
       
}
catch(Exception ae)
               {
    out.println(ae.getMessage());
}}
%>
<%@include file="footer.jsp" %>