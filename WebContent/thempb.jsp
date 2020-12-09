<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Thêm nhân viên </title>
<style type="text/css">
	form{
		border : 1px solid black;
		text-align : center;
		align : center;
	}
</style>
</head>
<body>
	<% String select = "pb"; %>
	<form action="CheckAddServlet?select=<%=select %>" method="post">
		<table align="center">
			<caption> <h3>Thêm phòng ban</h3> </caption>
			<tr>
				<td> <%= "MaPB" %> </td>
				<td> <input type="text", name="mapb" required> </td>
			</tr>
			<tr>
				<td> TenPB </td>
				<td> <input type="text", name="tenpb" required> </td>
			</tr>
		</table>
		<table align="center">
			<tr>
				<td> <input type="submit" name="ok" value="Thêm"> </td>
				<td> <input type="button" name="cancel" value="Hủy"> </td>
		</table>
	</form>
</body>
</html>