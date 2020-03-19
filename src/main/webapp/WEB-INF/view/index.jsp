<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Demo</title>
</head>
<body>
	<div align="center">
		<h1>Spring Demo</h1>
		<a href="new">Create New Product</a> <br /> <br />
		<table border="1" cellopadding="10">
			<thead>
				<tr>
					<th>Product ID</th>
					<th>Name</th>
					<th>Brand</th>
					<th>Made In</th>
					<th>Price</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ListProduct}" var="product">
					<tr>
						<td>${product.id}</td>
						<td>${product.name}</td>
						<td>${product.brand}</td>
						<td>${product.madein}</td>
						<td>${product.price}</td>
						<td><a href="/edit/${product.id}">Edit</a></td>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<td><a href="/delete/${product.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>