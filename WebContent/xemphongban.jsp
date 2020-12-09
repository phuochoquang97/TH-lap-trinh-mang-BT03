<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="model.bean.phongban"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách phòng ban</title>
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

	<form action="thempb.jsp" method="post">
		<center>
			<table>
				<tr>
					<td>DANH SÁCH PHÒNG BAN</td>
					<td><input type="submit" name="them" value="Thêm"></td>
				</tr>
			</table>
			<br>
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
					<th>MaPB</th>
					<th>Ten PB</th>
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
		</center>
	</form>
</body>
</html>