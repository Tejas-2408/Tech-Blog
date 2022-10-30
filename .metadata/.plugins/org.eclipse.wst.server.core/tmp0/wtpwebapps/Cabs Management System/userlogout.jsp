<%@include file="userheader.jsp" %>
<%
HttpSession h1=request.getSession();
h1.invalidate();
response.sendRedirect("userlogin.jsp");
%>
