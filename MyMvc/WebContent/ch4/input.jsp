<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Sort</title>
</head>
<body>
	<br />
	<s:form action="ch4login">
		<s:textfield name="user.name" label="user" />
		<s:password name="user.pass" label="pass" />
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