<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>

	<h2>Product Page</h2>

	<a href="index.jsp"> Add products</a>
	<br>
	<table border="1">

		<thead>
			<tr>
				<th>S.No</th>
				<th>Name</th>
				<th>Price</th>
				<th>Quantity</th>
			</tr>

		</thead>

		<tbody>

			<c:forEach items="${products}" varStatus="index" var="product">
				<tr>
					<td>${index.count}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>${product.qty}</td>
				</tr>

			</c:forEach>


		</tbody>

	</table>
</body>
</html>