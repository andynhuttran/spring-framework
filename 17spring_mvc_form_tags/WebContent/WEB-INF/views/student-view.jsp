<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>This page will handle student objects</title>
</head>
<body>

	<form:form action="process-student" modelAttribute="student">
		 Name: <form:input path="name"/>
		 <br><br>
		 Age: <form:input path="age"/>
		 <br><br>
		 Country: 
		 <form:select path="country">
		 	<form:options items="${student.optionCountries}" />
		 </form:select>
		 <br><br>
		 
		 
		 Favorite Language: <br>
		 <form:radiobutton path="favoriteLanguage" value="CS" /> C# <br>
		 <form:radiobutton path="favoriteLanguage" value="JAV" /> JAVA <br>
		 <form:radiobutton path="favoriteLanguage" value="C" /> C <br>
		 <form:radiobutton path="favoriteLanguage" value="PHP" /> PHP <br>
		 
		 <br><br>
		 
		 Operation Systems: <br>
		 <form:checkbox path="operationSystems" value="Windown"/> Windown<br>
		 <form:checkbox path="operationSystems" value="Ubuntu"/> Ubuntu<br>
		 <form:checkbox path="operationSystems" value="Mac OS"/> Mac OS<br>
		 
		 
		 <br><br>
		 
		 
		 
		 
		 <input type="submit" value="Submit"  />
	</form:form>
	
	
</body>
</html>