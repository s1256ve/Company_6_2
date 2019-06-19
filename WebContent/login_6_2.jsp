<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

</head>
<body>
	<s:form action="login_6_2">
		<s:textfield name="name" key="name"/>
		<s:password name="password" key="password"/>
		<s:submit value="Go"/>
		<s:reset value="重設"/>
	</s:form>
</body>
</html>