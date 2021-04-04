<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>${page}</title>
</head>
<body>


	<div class="container mt-3">
		<h1 class="text-center">Welcome to my first mvc Todo Appliation</h1>

		<div class="row">

			<div class="col-md-6">
				<h3>Options</h3>

				<div class="list-group">


				<a href='<c:url value='/home'></c:url>'
						class="list-group-item list-group-item-action list-group-item-primary">Menu</a>
				<a href='<c:url value='/add'></c:url>'
						class="list-group-item list-group-item-action list-group-item-primary">Add Todo</a> 
				<a href='<c:url value='/view'></c:url>'
						class="list-group-item list-group-item-action list-group-item-primary">View Todo</a>
				</div>

			</div>

			<div class="col-md-6">
				<h3>Content</h3>

				<c:if test="${page=='home'}">
					<h1>Home</h1>

				</c:if>

				<c:if test="${page=='add'}">
					<h1>Add</h1>
				
				<form action="savedata" method="post" modelAttribute="todo">
				<input type="text" name="username"></input>
				<input type="submit" name="submit"></input>
				
				</form>
		
				</c:if>


				<c:if test="${page=='view'}">
					<h1>View</h1>
					</c:if>
				
					${username  }			


				

				


			</div>



		</div>



	</div>















	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>