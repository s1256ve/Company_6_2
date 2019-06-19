<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Porder</title>
</head>
<body>
Welcome ${m.getName()}<br>
Your password is ${m.getPassword()}<br>
	<s:form action="addPorder_6_2">
		
		<s:select list="#{'A':'A', 'B':'B', 'C':'C'}" name="product"/>
		<s:textfield name="amount" key="amount" value="0"/>
		
		<s:submit value="Go"/>
		<s:reset value="重設"/>
	</s:form>
</body>
</html>