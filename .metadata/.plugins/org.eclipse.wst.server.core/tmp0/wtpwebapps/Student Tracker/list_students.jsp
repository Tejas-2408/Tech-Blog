<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students Information</title>

<link type="text/css" rel="stylesheet" href="css/style.css">

</head>
<body>

	<div id="wrapper">
		<div id = "header">
				<h2>Bansal's University</h2>
		</div>
	</div>



	<div id="container">
		<div id="content">
		
			<input type="button" value="Add Student" onclick="window.location.href='add_Student.jsp';return false;" class="add-student-button"/>
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>

				<c:forEach var="temp" items="${Students_List}">
				
					<c:url var="tempLink" value="StudentControllerServlet">
						<c:param name="command" value="LOAD"/>
						<c:param name="studentId" value="${temp.id }"></c:param>
					
					</c:url>	
					
					<c:url var="deleteLink" value="StudentControllerServlet">
						<c:param name="command" value="DELETE"/>
						<c:param name="studentId" value="${temp.id }"></c:param>
					
					</c:url>
					
				<tr>
					<td> ${temp.firstName} </td>
					<td> ${temp.lastName} </td>
					<td> ${temp.email} </td>
					<td><a href="${tempLink}">Update</a>
						 |
						<a href="${deleteLink }"
						onclick="if(!(confirm('Are you sure you want to delete this student?'))) return false">
						Delete</a>
					</td>
				</tr>
				
				</c:forEach>
				
				
			
			</table>
		</div>
	</div>
</body>
</html>