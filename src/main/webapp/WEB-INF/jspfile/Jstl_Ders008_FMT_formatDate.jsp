<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
	pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Insert title here</title>
</head>
<body>

<c:set var="simdikiTarih" value="<%=new Date()%>" />

Saat:    <fmt:formatDate type="time" value="${simdikiTarih}" /><br/>
Tarih:   <fmt:formatDate type="date" value="${simdikiTarih}" /><br/>


Tarih Saat Sayı: <fmt:formatDate type="both" dateStyle="short" timeStyle="medium" value="${simdikiTarih}" /><br/>
Tarih Saat Kısaltma: <fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${simdikiTarih}" /><br/>
Tarih Saat Uzun version: <fmt:formatDate type="both" dateStyle="long" timeStyle="medium" value="${simdikiTarih}" /><br/>



</body>
</html>