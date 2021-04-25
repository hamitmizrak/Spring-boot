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

<h1>Core/If-Else</h1>

<c:set var="alias" value="Servlet" ></c:set>

<c:choose>

<c:when test="${alias=='java'}">
sonuc: Java
</c:when>

<c:when test="${alias=='jsp'}">
sonuc: Jsp
</c:when>

<c:when test="${alias=='jsf'}">
sonuc: Jsp
</c:when>

<c:otherwise>
Java Teknolojisi ama hangisi olduğunu bilmiyorum
</c:otherwise>

</c:choose>

</body>
</html>