<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tìm kiếm</title>
<style type="text/css">
div {
	text-align: center;
}

button {
	width: 300px;
	height: 30px;
	background-color: white;
}

a {
	text-decoration: none;
}
</style>
</head>
<body>
	<%String capnhat = "capnhat"; %>
	<div>
		<a href="CheckShowNVServlet?manv=<%=capnhat %>"><button>Nhân
				viên</button></a> </br> </br> <a href="CheckShowPBServlet?mapb=<%=capnhat %>"><button>Phòng ban</button></a>
	</div>
</body>
</html>