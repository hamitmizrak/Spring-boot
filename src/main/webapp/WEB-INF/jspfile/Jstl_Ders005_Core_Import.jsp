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

<h1>Core/Import</h1>

<c:import var="alias" url="/WEB-INF/jspfile/Jstl_Ders001_Core_Set_Out.jsp"></c:import>

<c:out value="${alias}"></c:out>

</body>
</html>