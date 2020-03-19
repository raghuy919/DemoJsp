<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Product</title>
</head>
<body>
	<div align="center">
		<h1>Edit Product</h1>
		<br />
		<f:form modelAttribute="product" action="/save" method="POST">
			<table>
				<tr>
					<td>Product Name:<f:hidden path="id"/></td>
					<td><f:input path="name"/></td>
				</tr>
				<tr>
					<td>Brand:</td>
					<td><f:input path="brand" /></td>
				</tr>
				<tr>
					<td>Made in:</td>
					<td><f:input path="madein" /></td>
				</tr>

				<tr>
					<td>Price:</td>
					<td><f:input path="price" /></td>
				</tr>

				<tr>
					<td colspan="2"><f:button>Update</f:button></td>
				</tr>
			</table>
		</f:form>
	</div>
</body>
</html>