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
	<% String select = "nv"; %>
	<form action="CheckAddServlet?select=<%=select %>" method="post">
		<table align="center">
			<caption> <h3>Thêm nhân viên</h3> </caption>
			<tr>
				<td> <%= "MaNV" %> </td>
				<td> <input type="text", name="manv" required> </td>
			</tr>
			<tr>
				<td> HoTen </td>
				<td> <input type="text", name="hoten" required> </td>
			</tr>
			<tr>
				<td> GioiTinh </td>
				<td colspan=2> Nam : <input type="radio" name="gioitinh" value="Nam"> Nữ :
				 <input type="radio" name="gioitinh" value="Nữ"> </td>
			</tr>
			<tr>
				<td> PhongBan </td>
				<td> <input type="text", name="phongban" required> </td>
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