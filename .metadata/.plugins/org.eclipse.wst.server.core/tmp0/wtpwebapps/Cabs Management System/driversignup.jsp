<%@include file="mainheader.jsp" %>
<html>
    <head>
 <script language="javascript">
function doCheck()
{
 
  var u=document.getElementById("drivername");
  var p=document.getElementById("password");
   var e=document.getElementById("email");
   var ph=document.getElementById("contact");
  var a=document.getElementById("address");
  var pi=document.getElementById("pincode");
  var c=document.getElementById("city");
  var n=document.getElementById("cabno");
  var s=document.getElementById("capacity");
  var t=document.getElementById("timing")
 
 


  if(u.value == "")
  {
    alert ("enter the drivername");
	return false;
u.focus();

	}
 else if(parseInt(u.value))
		{
                    alert("Enter Valid drivername");
                    
		    return false;
                    u.focus();
		}

    if(p.value == "")
  {
    alert ("enter the password");
	return false;
        p.focus();
	
	}

	else if((p.value.length)<6)
	{
	 alert("password should contain atleast 6 characters ");
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
 
     if(n.value == "")
  {
    alert ("enter the cabno.");
	n.focus();
	return false;
	}

	 else if(!parseInt(n.value))
		{
                    alert("Enter Integer");
		    return false;
		}
                 if(s.value == "")
  {
    alert ("enter the sitting capacity");
	s.focus();
	return false;
	}

	 else if(!parseInt(s.value))
		{
                    alert("Enter Integer");
		    return false;
		}

  if(t.value == "")
  {
    alert ("enter the timing of job");
	t.focus();
	return false;
	}
  }
  
  </script>
    </head>
<body>
        
       
     <div class="container">
         <div class="jumbotron" style="background-color:papayawhip">
       
<%@page import="java.sql.*"%>
<form method="post" name="myform" onsubmit="return focus()" action="">
    <div class="well" style="background-color: peachpuff"> <h2 align="center"><b>DRIVER DETAILS</b></h2></div>
    <table border-width="10px" height="300" align="center">
        <tr><td><b>DRIVER NAME:</b></td><td><input type="text" name="drivername" id="drivername"></td></tr>
        <tr><td><b>PASSWORD:</b></td><td><input type="password" name="password" id="password"></td></tr>
        <tr><td><b>EMAIL ID:</b></td><td><input type="text" name="email" id="email"></td></tr>
        <tr><td><b>CONTACT No:</b></td><td><input type="text" name="contact" id="contact"></td></tr>
        <tr><td><b>ADDRESS:</b></td><td><input type="text" name="address"id="address"></td></tr>
        <tr><td><b>PIN CODE:</b></td><td><input type="text" name="pincode"id="pincode"></td></tr>
        <tr><td><b>GENDER:</b></td><td><b><input type="radio" name="gender" value="male">Male</b></td>
            <td><b><input type="radio" name="gender" value="female">Female</b></td></tr>
        <tr><td><b>CITY:</b></td><td><input type="text" name="city"id="city"></td></tr>
        <tr><td><b>CAB No:</b></td><td><input type="text" name="cabno"id="cabno"></td></tr>
        <tr><td><b>SITTING CAPACITY:</b></td><td><input type="text" name="capacity"id="capacity"></td></tr>
        <tr><td><b>TIMING OF JOB:</b><td><input type="text" name="timing"id="timing"></td></tr>
        <tr><td><b>TYPE OF CAB:</b></td><td><select name="type"><option value="ac">AC</option>
                    <option value="nonac">NON-AC</option></select></td></tr>
        
        <tr><td><b><input type="submit" name="submit" value="Apply" onclick="return doCheck()"></b></td>
            <td><b><input type="reset" name="reset" value="Reset"></b></td></tr>
    </table>
</form>
<%
String submit=request.getParameter("submit");
if(submit==null)
       {
    
}
else if(submit.equals("Apply"))
    {   
String drivername=request.getParameter("drivername");
String password=request.getParameter("password");
String email=request.getParameter("email");
String contact=request.getParameter("contact");
String address=request.getParameter("address");
String pincode=request.getParameter("pincode");
String gender=request.getParameter("gender");
String city=request.getParameter("city");
String cabno=request.getParameter("cabno");
String capacity=request.getParameter("capacity");
String timing=request.getParameter("timing");
String type=request.getParameter("type");


try
               {
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
       String query="insert into drivermain(drivername,password,email,contact,address,pincode,gender,city,cabno,capacity,timing,type) values(?,?,?,?,?,?,?,?,?,?,?,?)";
       PreparedStatement pst=con.prepareStatement(query);
       pst.setString(1, drivername);
       pst.setString(2, password);
       pst.setString(3, email);
       pst.setString(4, contact);
       pst.setString(5, address);
       pst.setString(6, pincode);
       pst.setString(7, gender);
       pst.setString(8, city);
       pst.setString(9, cabno);
       pst.setString(10, capacity);
       pst.setString(11, timing);
       pst.setString(12, type);
       pst.executeUpdate();
  out.println("<h1> your signup process is complete Please login</h1>");      
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