<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>
			Welcome
			<s:property value="username" />
		</h1>
		<a href="addproduct.jsp" >Add Product</a>
	</div>
	<table >
		<thead>
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Product Description</th>
				<th>Product price</th>
				<th colspan="2">Actions</th>
			</tr>
		</thead>
		<s:iterator value="products" var="product">
			<tr>
				<td><s:property value="#product.id" /></td>
				<td><s:property value="#product.name" /></td>
				<td><s:property value="#product.description" /></td>
				<td><s:property value="#product.price" /></td>
				<td>Update</td>
				<td>Delete</td>
			</tr>
		</s:iterator>

	</table>
</body>
</html>