<%@include file="userheader.jsp"%>
<%@page import="java.sql.*"%>
<html>
<body>

	<div class="container" style="margin-top: 70px">


		<div class="row">
			<div class="col-sm-12">
				<div class="well" style="background-color: burlywood">
					<h3>
						<b><center>BOOK A CAB FOR YOU</center></b>
					</h3>
				</div>

			</div>
		</div>
	</div>
	<div class="container" style="margin-top: 30px">

		<div class="jumbotron" style="background-color: yellowgreen">
			<div class="row">
				<div class="col-sm-6">
					<img src="images/book.jpg" class="img-responsive img-thumbnail" />
				</div>
				<div class="col-sm-6">
					<table border-width="10px" height="300" align="center">
						<form method="get" action="">
							<tr>
								<td><b>USER NAME:</b></td>
								<td><input type="text" name="username"></td>
							</tr>
							<tr>
								<td><b>PASSWORD:</b></td>
								<td><input type="password" name="password"></td>
							</tr>
							<tr>
								<td><b>EMAIL ID:</b></td>
								<td><input type="text" name="email" /></td>
							</tr>
							<tr>
								<td><b>CONTACT No:</b></td>
								<td><input type="text" name="contact"></td>
							</tr>
							<tr>
								<td><b>ADDRESS:</b></td>
								<td><input type="text" name="address"></td>
							</tr>
							<tr>
								<td><b>PIN CODE:</b></td>
								<td><input type="text" name="pincode"></td>
							</tr>
							<tr>
								<td><b>CITY:</b></td>
								<td><input type="text" name="city"></td>
							</tr>
							<tr>
								<td><b>BOOKING-DATE:</b></td>
								<td><input type="text" name="bookingdate"></td>
							</tr>
							<tr>
								<td><b>BOOKING-TIME:</b></td>
								<td><input type="text" name="bookingtime"></td>
							<tr>
								<td><b>STARTING-LOCATION:</b></td>
								<td><input type="text" name="startinglocation"></td>
							<tr>
								<td><b>DEPARTURE:</b></td>
								<td><input type="text" name="departure"></td>
							<tr>
								<td><b><input type="submit" name="action" value="BOOK"></b></td>
								<td><b><input type="submit" name="action"
										value="UPDATE"></b></td>
							</tr>

						</form>
					</table>
<% 		
					String action = request.getParameter("action");	
if (action == null) {	
	
} else if (action.equals("BOOK")) {	
String username = request.getParameter("username");	
String password = request.getParameter("password");	
String email = request.getParameter("email");	
String contact = request.getParameter("contact");	
String address = request.getParameter("address");	
String pincode = request.getParameter("pincode");	
String city = request.getParameter("city");	
String bookingdate = request.getParameter("bookingdate");	
String bookingtime = request.getParameter("bookingtime");	
String startinglocation = request.getParameter("startinglocation");	
String departure = request.getParameter("departure");	
try {	
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cabs","root","root");
	String query = "insert into booking(username,password,email,contact,address,pincode,city,bookingdate,bookingtime,startinglocation,departure) values(?,?,?,?,?,?,?,?,?,?,?)";
	PreparedStatement pst = con.prepareStatement(query);
	pst.setString(1, username);
	pst.setString(2, password);
	pst.setString(3, email);
	pst.setString(4, contact);
	pst.setString(5, address);
	pst.setString(6, pincode);
	pst.setString(7, city);
	pst.setString(8, bookingdate);
	pst.setString(9, bookingtime);
	pst.setString(10, startinglocation);
	pst.setString(11, departure);
	pst.executeUpdate();
	out.println("BOOKING SUCCESSFULL");
} catch (Exception ae) {	
	out.println(ae.getMessage());
}	
}	
%>
					
					
				</div>
			</div>
		</div>
	</div>
</body>
</html>
<%@include file="footer.jsp"%>