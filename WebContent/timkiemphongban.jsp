<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.bean.phongban" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	form{
		border : 1px solid black;
		text-align : center;
		align : center;
	}
	table.a,th,td{
		border: 1px solid black;
    	border-collapse: collapse;
	}
</style>
</head>
<body>
	<% String name="pb";%>
	<form action="CheckSearchServlet?name=<%=name %>" method="post">
		<input type="text" name="textsearch">
		<input type="submit" name="search" value="Search">
		<%
			ArrayList<phongban> pblist = (ArrayList<phongban>) request.getAttribute("pblist");
			if (pblist == null || pblist.size() == 0) {
		%>
		<table align="center" class="a">
			<br>
			<tr>
				<td><%="No Result is matched!"%></td>
			</tr>
		</table>
		<%
			} else {
		%>
		<table align="center" class="a">
			<tr>
				<th> MaPB </th>
				<th> Ten PB </th>
			</tr>
			<%
				for (int i = 0; i < pblist.size(); i++) {
			%>
			<tr>
				<td><%=pblist.get(i).getMaPB()%></td>
				<td><%=pblist.get(i).getTenPB()%></td>
			<%
				}
				}
			%>
		</table>
	</form>
</body>
</html>