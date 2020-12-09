<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
<title>Insert title here</title>
<style>
	div {
		width : 200px;
		margin-left: 10px;
        border-radius: 10px ;
        border: black solid 2px;
        text-align : center;
        margin : 10px;
        background-color : white;
    }
    div.a{
    	border-color : blue;
    }
    div.b{
    	border-color : yellow;
    }
    div.c{
    	border-color : green;
    }
    div.d{
    	border-color : red;
    }
    div.e{
    	border-color : blue;
    }
    div.f{
    	border-color : yellow;
    }
    div.g{
    	border-color : green;
    }
    div.h{
    	border-color : red;
    }
    a {
    	text-decoration: none;
    }

</style>
</head>
<body bgcolor="#00FF00">
	<%String xem = "xem"; %>
	<div class="a">
		<a href="login.jsp" target="T3"> <%= "Trang chủ" %> </a> 
	</div>
	<div class="b">
		<a href="CheckShowNVServlet?manv=<%=xem %>" target="T3"> <%= "Xem nhân viên" %></a>
	</div>
	<div class="c">
		<a href="CheckShowPBServlet?mapb=<%=xem %>" target="T3"> <%= "Xem phòng ban" %></a>
	</div>
	<div class="d">
		<a href="timkiem.jsp" target="T3"> <%= "Tìm kiếm" %></a>
	</div>
	<div class="e">
		<a href="capnhat.jsp" target="T3"> <%= "Cập nhật thông tin" %> </a>
	</div>
	<div class="f">
		<a href="xoathongtin.jsp" target="T3"> <%= "Xóa thông tin" %> </a>
	</div>
	<div class="g">
		<a href="CheckDeleteAllServlet" target="T3"> <%= "Xóa tất cả" %> </a>
	</div>
	<div class="h">
		<a href="trogiup.jsp" target="T3"> <%= "Trợ giúp chương trình" %> </a>
	</div>
</body>
</html>