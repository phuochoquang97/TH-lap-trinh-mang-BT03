<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Thêm</title>
<style type="text/css">
form {
	border: 1px solid black;
	text-align: center;
	align: center;
}
</style>
</head>
<body>
	<%  response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String manv = request.getParameter("manv");
		String hoten = request.getParameter("hoten");
		String name = "nv";
	%>
	<form action="CheckUpdateNVServlet?manv=<%=manv%>&name=<%=name %>"
		method="post">
		<table align="center">
			<caption>
				<h3>Sửa thông tin sinh viên</h3>
			</caption>
			<tr>
				<td>Sửa sinh viên :</td>
				<td><%= hoten %></td>
			</tr>
			<tr>
				<td>Mã NV :</td>
				<td><%= manv %></td>
			</tr>
			<tr>
				<td>Họ tên :</td>
				<td><input type="text" name="hoten" required></td>
			</tr>
			<tr>
				<td>Giới tính</td>
				<td colspan=2>Nam : <input type="radio" name="gioitinh"
					value="Nam"> Nữ : <input type="radio" name="gioitinh"
					value="Nu">
				</td>
			</tr>
			<tr>
				<td>PhongBan</td>
				<td><input type="text" , name="phongban" required></td>
			</tr>

		</table>
		<table align="center">
			<tr>
				<td><input type="submit" name="ok" value="Lưu lại"></td>
				<td><input type="button" name="cancel" value="Quay lại">
				</td>
		</table>
	</form>
</body>
</html>