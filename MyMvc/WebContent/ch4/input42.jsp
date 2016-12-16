<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Sort</title>
</head>
<body>
	<br />
	<s:form action="login42">
		<s:textfield name="users[0].name" label="first user" />
		<s:password name="users[0].pass" label="first pass" />
		<s:textfield name="users[1].name" label="second user" />
		<s:password name="users[1].pass" label="second pass" />
		<tr>
		<td colspan="2">
		<s:submit value="Convert" theme="simple" />
		<s:reset value="Reset" theme="simple" />
		</td>
		</tr>
	</s:form>
	<br />
	<s:debug />
</body>
</html>