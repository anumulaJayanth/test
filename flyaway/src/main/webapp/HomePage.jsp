<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="right">
<a href="AdminPage.jsp">Admin Login</a>
</div>
<%
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
	if(user!=null){
%>
<p>Welcome <%=user.get("name") %></p>
<a href="Logout">Logout</a>
<%
	}else{
%>
<a href=UserPage.jsp>User Login</a>
<%
	}
%>
<br><br>
<div style="border:5px solid tomato;width:25%;border-radius:20px;padding:20px">
<form action=FlightList method=post>
	<label for=source>Source :-</label> <input type=text name=source id=source/><br><br>
	<label for=destination>Destination :-</label> <input type=text name=destination id=destination/><br><br>
	<label for=departure>Departure :-</label> <input type=date name=departure id=departure/><br><br>
	<label for=travellers>Travellers :-</label> <input type=number name=travellers id=travellers/><br><br>
	<input type=submit value=Search /> <input type=reset />
</form>
</div>
</body>
</html>