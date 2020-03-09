<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jav" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		Student is: ${msg}
		
		<br><br>
		FirstName: ${std.name}
		
		<br><br>
		Age: ${std.age}
		
		<br><br>
		Country: ${std.country}
		
		<br><br>
		Country: ${std.favoriteLanguage}
		
		<br><br>
		Operation Systems:		
		<ul>		
			<jav:forEach var="operation" items="${std.operationSystems}">
				<li>${operation}</li>
			</jav:forEach>
		</ul>

</body>
</html>