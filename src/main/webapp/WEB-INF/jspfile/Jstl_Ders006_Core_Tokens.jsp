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

<h1>Core/Tokens</h1>

<c:forTokens var="alias" items="Malatya,Yeşilyurt,Battalgazi" delims=",">

<c:out value="${ alias}"></c:out>

</c:forTokens>

</body>
</html>