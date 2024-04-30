<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>

	<h2>Enter Product Details</h2>
	
	<p><font color="green">${msg}</font></p>
	
	
	<form:form action="product" modelAttribute="p" method="post">
	
	  <table>
	    <tr>
	       <td>
	           <form:label path="name">Name:</form:label>
	           <form:input path="name"/>
	       </td>
	    </tr>
	    
	     <tr>
	       <td>
	           <form:label path="price">Price:</form:label>
	           <form:input path="price"/>
	       </td>
	    </tr>
	    
	     <tr>
	       <td>
	           <form:label path="qty">Quantity:</form:label>
	           <form:input path="qty"/>
	       </td>
	    </tr>
	    
	     <tr>
	       <td>
	           <input type="submit" value="save" >
	       </td>
	    </tr>
	     
	  </table>
	
	</form:form>
	
	<a href="data.jsp"> View Products</a>

</body>
</html>