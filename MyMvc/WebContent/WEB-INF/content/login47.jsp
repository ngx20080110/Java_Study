<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@ page isELIgnored="true" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="loginPage" /></title>
</head>
<body>
	<s:form action="login_47">
		<s:textfield name="username" key="user" />
		<s:password name="password" key="pass" />
		<s:submit key="login" />
	</s:form>
	<br />
</body>
</html>