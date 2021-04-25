<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
	pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Insert title here</title>
</head>
<body>

<c:set var="alias" value="Hamit M�zrak"/>

Length: ${fn:length(alias)} <br/>

<br/><br/><hr/>

Hepsi B�y�k: ${fn:toUpperCase(alias)} <br/>

<br/><br/><hr/>

Hepsi K���k: ${fn:toLowerCase(alias)} <br/>

<br/><br/><hr/>

Bo�luklar� almak: ${fn:trim(alias)} <br/>

<br/><br/><hr/>

Par�aland�: ${fn:substring(alias , 0, 5 )} <br/> 

<br/><br/><hr/>

indexOf: ${fn:indexOf("HamitM�zrak Java", "Java")}
<br/><br/><hr/>
<c:set var="kelime1" value="Hamit M�zrak Java"/>
<c:set var="kelime2" value=" Java " />

<c:if test="${fn:contains(kelime1, kelime2)}">
 Contains:<c:out value="Kelimede Java"/>
</c:if>
<br/><br/><hr/>
 <c:set var="kelime1" value="Java JSP"/>
 <c:set var="kelime2" value="${fn:replace(kelime1,'JSP', 'JSP JSTL')}" />
 <p>Replace: ${kelime2}</p>

<br/><br/><hr/>
 <br/>
 
 <c:set var="ad_soyad" value="Hamit & M�zrak" />
<c:set var="bol" value="${fn:split(ad_soyad,'&')}" />
 <p>�fade: ${bol}</p>

<c:set var="birlestir" value="${fn:join(bol,' ')}" />
<p>Split Tag Kullan�lan �fade: ${birlestir}</p>
	
<br/><br/><hr/>



</body>
</html>