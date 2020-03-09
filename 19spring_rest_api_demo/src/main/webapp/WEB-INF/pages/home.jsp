<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<p>Home page</p>
	
	<a href="${pageContext.request.contextPath}/demo/read/ColeNhut">Demo normal controller</a>
	<br><br>
	<a href="${pageContext.request.contextPath}/api/students">Demo rest controller</a>
	
</body>
</html>