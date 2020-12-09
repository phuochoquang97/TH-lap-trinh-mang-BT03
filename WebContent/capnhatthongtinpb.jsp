<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Thêm </title>
<style type="text/css">
	form{
		border : 1px solid black;
		text-align : center;
		align : center;
	}
</style>
</head>
<body>
	<%  response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String mapb = request.getParameter("mapb");
		String tenpb = request.getParameter("tenpb");
		String name = "pb";
	%>
	<form action="CheckUpdateNVServlet?mapb=<%=mapb%>&name=<%=name %>" method="post">
		<table align="center">
			<caption> <h3>Sửa thông tin sinh viên</h3> </caption>
			<tr>
				<td> Sửa phòng ban : </td>
				<td> <%= tenpb %> </td>
			</tr>
			<tr>
				<td> Mã PB : </td>
				<td> <%= mapb %> </td>
			</tr>
			<tr>
				<td> Tên PB : </td>
				<td> <input type="text" name="tenpb" required> </td>
			</tr>			
		</table>
		<table align="center">
			<tr>
				<td> <input type="submit" name="ok" value="Lưu lại"> </td>
				<td> <input type="button" name="cancel" value="Quay lại"> </td>
		</table>
	</form>
</body>
</html>