<%@include file="adminheader.jsp" %>
<%
HttpSession h1=request.getSession();
h1.invalidate();
response.sendRedirect("adminlogin.jsp");
%>
<%@include file="footer.jsp" %>