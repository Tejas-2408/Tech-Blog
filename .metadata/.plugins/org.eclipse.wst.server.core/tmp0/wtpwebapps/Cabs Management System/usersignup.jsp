<%@include file="mainheader.jsp" %>
<html>
    <head>
        <script>
           function doCheck()
{
 
  var u=document.getElementById("username");
  var p=document.getElementById("password");
   var e=document.getElementById("email");
   var ph=document.getElementById("contact");
  var a=document.getElementById("address");
  var pi=document.getElementById("pincode");
  var c=document.getElementById("city");
  
  if(u.value == "")
  {
    alert ("enter the username");
    u.focus();
	return false;
	}
 else if(parseInt(u.value))
		{
                    alert("Enter Valid username");
                     u.focus();
		    return false;
                   
		}

    if(p.value == "")
  {
    alert ("enter the password");
     p.focus();
	return false;
	}

	else if((p.value.length)<6)
	{
	 alert("password should contain atleast 6 characters ");
          p.focus();
	 return false;
       

	 }
         if(e.value == "")
  {
    alert ("enter the email");
    e.focus();
	return false;
	
    }

	 else if(e.value.indexOf('@')==-1)
		      {
		       alert("Use @ email correctly");
                        e.focus();
		        return false;
                     
		     
		      }

	  else if(e.value.indexOf('.')==-1)
		       {
		        alert("Use . email correctly");
                          e.focus();
		         return false;
                      
		       
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
     <body>
        
        <div class="container-fluid" style="margin: 50px">
         
               
       
        </div>
     <div class="container">
         <div class="jumbotron" style="background-color:palegoldenrod">
       
<%@page import="java.sql.*"%>
<form method="post" name="myform" onsubmit="return focus()" action="">
    <div class="well" style="background-color: papayawhip"> <h2 align="center"><b>USER DETAILS</b></h2></div>
    <table border-width="10px" height="300" align="center">
        <tr><td><b>USER NAME:</b></td><td><b><input type="text" name="username" id="username"></td></tr>
        <tr><td><b>PASSWORD:</b></td><td><b><input type="password" name="password" id="password"></td></tr>
        <tr><td><b>EMAIL ID:</b></td><td><input type="text" name="email"id="email"></td></tr>
        <tr><td><b>CONTACT No:</b></td><td><input type="text" name="contact" id="contact"></td></tr>
        <tr><td><b>ADDRESS:</b></td><td><input type="text" name="address" id="address"></td></tr>
        <tr><td><b>PIN CODE:</b></td><td><input type="text" name="pincode" id="pincode"></td></tr>
        <tr><td><b>GENDER:</b></td><td><b><input type="radio" name="gender" value="male">Male</b></td>
            <td><b><input type="radio" name="gender" value="female">Female</b></td></tr>
        <tr><td><b>CITY:</b></td><td><input type="text" name="city" id="city"></td></tr>
        <tr><td><b><input type="submit" name="submit" value="Signup" onclick="return doCheck()"></b></td>
            <td><b><input type="reset" name="reset" value="Reset"></b></td></tr>
    </table>
</form>
<%
String submit=request.getParameter("submit");
if(submit==null)
       {
    
}
else if(submit.equals("Signup"))
       {
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
       String query="insert into cabs.usermain(username,password,email,contact,address,pincode,gender,city) values(?,?,?,?,?,?,?,?)";
       PreparedStatement pst=con.prepareStatement(query);
       pst.setString(1, username);
       pst.setString(2, password);
       pst.setString(3, email);
       pst.setString(4, contact);
       pst.setString(5, address);
       pst.setString(6, pincode);
       pst.setString(7, gender);
       pst.setString(8, city);
       pst.execute();
       %>
       <h3><b>Your Signup process is completes <a href="userlogin.jsp">Please Login</a></b></h3>
      <!-- out.println("<h3><b> Your signup process is complete <a href='userlogin.jsp'>Please login</a></b></h3>"); -->
      <%  
}
catch(Exception ae)
               {
    out.println(ae.getMessage());
}}
%>
         </div>
     </div>
</body>
</html>
<%@include file="footer.jsp" %>