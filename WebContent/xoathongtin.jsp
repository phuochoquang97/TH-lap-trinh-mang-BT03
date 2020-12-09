<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Xóa thông tin</title>
<style type="text/css">
	div{
		text-align : center;
	}
	button{
		width : 300px;
		height : 30px;
		background-color : white;
	}
	a{
    	text-decoration: none;
	}
</style>
</head>
<body>
	<%String xoa = "xoa"; %>
	<div>
		<a href="CheckShowNVServlet?manv=<%=xoa %>"><button>Xóa nhân viên</button></a>
		</br>
		</br>
		<a href="CheckShowPBServlet?mapb=<%=xoa %>"><button>Xóa phòng ban</button></a>
	</div>
</body>
</html>