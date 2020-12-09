<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
<title>Trang chủ</title>
<style>
	frameset{
		border : solid black 1px;
	}
</style>
</head>
<frameset rows = "200,*" scrolling="no">
	<frame name= "Form" src="T1.jsp" scrolling="no"></frame>
	<frameset cols = "250,*,150" scrolling="no">
		<frame name ="T2" src="T2.jsp" scrolling="no"></frame>
		<frame name ="T3" src="T3.jsp" scrolling="no"></frame>
		<frame name="T4" src="T4.jsp" scrolling="no"></frame>
	</frameset>
</frameset>
<body>
</body>
</html>