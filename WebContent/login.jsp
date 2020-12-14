<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="styles.css"> -->
</head>
<body>

	<div align="center">
		<h3>Login</h3>
		<s:form action="loginaction">
			<s:textfield name="username" label="Username"  />
			<s:password name="password" label="Password"  />
			<s:submit value="Submit" />
		</s:form>
	</div>
</body>
</html>