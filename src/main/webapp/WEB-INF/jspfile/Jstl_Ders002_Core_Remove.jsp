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

<h1>Core/Set</h1>
<c:set scope="session" var="takmaAd" value="${'Hamit Mızrak'}" ></c:set>
<c:out value="${takmaAd}"></c:out>

<h1>Core/Remove</h1>
<c:remove var="takmaAd" />
<c:out value="${takmaAd}"></c:out>


</body>
</html>