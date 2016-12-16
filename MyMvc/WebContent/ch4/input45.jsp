<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Set屬性的類型轉換</title>
</head>
<body>
	<br />
	<h3>Set屬性的類型轉換</h3>
	<s:form action="login45">
		<s:textfield name="users" label="first user" />
		<s:textfield name="users" label="second user" />
		<s:textfield name="birth" label="Birthday" />
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