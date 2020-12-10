<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.bean.nhanvien" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	form{
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
	<% String name="nv";%>
	<form action="CheckSearchServlet?name=<%=name %>" method="post">
		<input type="text" name="textsearch">
		<input type="submit" name="search" value="Search">
		<%
			ArrayList<nhanvien> nvlist = (ArrayList<nhanvien>) request.getAttribute("nvlist");
			if (nvlist == null || nvlist.size() == 0) {
		%>
		<table align="center" class="a">
			<br>
			<tr>
				<br>
				<td><%="No Result is matched!"%></td>
			</tr>
		</table>
		<%
			} else {
		%>
		<table align="center" class="a">
			<tr>
				<th> MaNV </th>
				<th> HoTen </th>
				<th> GioiTinh </th>
				<th> Phongban </th>
			</tr>
			<%
				for (int i = 0; i < nvlist.size(); i++) {
			%>
			<tr>
				<td><%=nvlist.get(i).getMaNV()%></td>
				<td><%=nvlist.get(i).getHoten()%></td>
				<td><%=nvlist.get(i).getGioitinh()%></td>
				<td><%=nvlist.get(i).getPhongban()%></td>
			<%
				}
				}
			%>
		</table>
	</form>
</body>
</html>