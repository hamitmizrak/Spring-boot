<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Merhabalar Jsp</h1>

<%
String nowDate=new java.util.Date(System.currentTimeMillis()).toString();
%>

<time> <%=nowDate %>  </time>

</body>
</html>