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
		<h1>Add Bro</h1>
		<s:form action="addproduct">
			<s:textfield name="id" label="Product ID" />
			<s:textfield name="name" label="Product name" />
			<s:textfield name="description" label="Product description" />
			<s:textfield name="price" label="Product price" />
			<s:submit value="Submit"/>
		</s:form>
	</div>

</body>
</html>