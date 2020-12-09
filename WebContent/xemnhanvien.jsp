<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="model.bean.nhanvien"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách nhân viên</title>
<style type="text/css">
form {
	text-align: center;
	align: center;
}

table.a, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>

	<form action="themnv.jsp" method="post">
		<center>
			<table>
				<tr>
					<td>DANH SÁCH NHÂN VIÊN</td>
					<td><input type="submit" name="them" value="Thêm"></td>
				</tr>
			</table>

			<br>
			<%
					ArrayList<nhanvien> nvlist = (ArrayList<nhanvien>) request.getAttribute("nvlist");
					if (nvlist == null || nvlist.size() == 0) {
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
					<th>MaNV</th>
					<th>HoTen</th>
					<th>GioiTinh</th>
					<th>Phongban</th>
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