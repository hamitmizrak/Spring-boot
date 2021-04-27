<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring-form"
	uri="http://www.springframework.org/tags/form"%>

<!doctype html>
<html lang="en">
<head>
<title>Title</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-9">
				<h2 class=" text-uppercase text-center display-4">Register</h2>
				<spring-form:form modelAttribute="register" method="post">
					<spring-form:errors />

					<div class="form-group">
						<label for="adiniz">ID</label>
						<spring-form:input path="id" type="text" class="form-control"
							disabled="true" />
						<spring-form:errors path="id" />
					</div>


					<div class="form-group">
						<label for="adiniz">Adınız</label>
						<spring-form:input path="name" type="text" class="form-control" />
						<spring-form:errors path="name" />
					</div>

					<div class="form-group">
						<label for="adiniz">Soyadınız</label>
						<spring-form:input path="surname" type="text" class="form-control" />
						<spring-form:errors path="surname" />
					</div>

					<div class="form-group">
						<label for="adiniz">Email</label>
						<spring-form:input path="email" type="email" class="form-control" />
						<spring-form:errors path="email" />
					</div>

					<div class="form-group">
						<label for="adiniz">Şifre</label>
						<spring-form:input path="password" type="text"
							class="form-control" />
						<spring-form:errors path="password" />
					</div>

					<input type="reset" value="Temizle" class="btn btn-danger">
					<input type="submit" value="Gönder" class="btn btn-primary">

				</spring-form:form>
			</div>
		</div>
	</div>


	<!-- Optional JavaScript -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>

</html>