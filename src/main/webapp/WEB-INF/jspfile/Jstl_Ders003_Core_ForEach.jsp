<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
	pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Insert title here</title>
</head>
<body>

<h1>Core/ForEach</h1>

<c:forEach var="alias" begin="1" end="10" step="2" >

<c:out value="${alias}"></c:out>

</c:forEach>

</body>
</html>